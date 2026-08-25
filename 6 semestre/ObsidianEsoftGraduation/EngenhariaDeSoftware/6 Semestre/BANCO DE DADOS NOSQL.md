Professor Cidão.

NoSql: Volume, variedade e velocidade. Coisas rapidas.
# Aula 01 - 28/07/2026
# Aula 02 - 29/07/2026
# Aula 03 - 04/08/2026
# Aula 04 - 05/08/2026
	NoSql: Volume, variedade e velocidade. Coisas rapidas.
	Uma sequencia do básico ao profissional.
	Relacional basico: Check = ENUM
		Não recebe nenhum tipo de valor diferente daquilo
	Vamos ter varios niveis.
	Criar um data base: 
		use aula
		db.(nome do banco).intertOnly({
			(Aqui tu coloca o que quer dar no intert)
		})
		*Para criar com restrições é diferente*
		db.createCollection("Nome do banco",{
			validator
		})
		db.createCollection("alunos",{
			  validator:{(aqui tu ta dizendo que ele é um validador)
			    $jsonSchema:{()
			      bsonType:"object",(Para o que tu ta fazendo, não está valendo só para um documento, mas está valendo para toda a collection)
			      required:["nome","email","idade","ativo"](o que deve conter, pelo menos na collection, os NotNull)
			    }
			  }
		})
		Exemplo de insertion faltando alguns dados
			db.alunos.insertOne({
				  nome:"Nicolas",email:"exemplo1@exemplo.com"
			})
			MongoServerError: Document failed validation
		Exemplo de insertion executado com sucesso
			db.alunos.insertOne({
			nome:"Nicolas",email:"exemplo1@exemplo.com",idade:587,ativo:false
			})
			{
			  acknowledged: true,
				  insertedId: ObjectId('6a73ddcbebd34079c56d835c')
			}
		Para colocar os tipos das colunas temos esse exemplo a baixo:
			db.createCollection("alunos",{
				  validator:{
				    $jsonSchema:{
						bsonType:"object",
						required:["nome","email","idade","ativo"],
						properties:{
					        nome:{bsonType:"string"},
					        email:{bsonType:"string"},
					        idade:{bsonType:"int"},
					        ativo:{bsonType:"bool"}
					      }
				    }
				  }
			})
		Valores permitidos para enum:
			status:{
				enum:["ativo","inativo","trancado"]
			}

# Aula 05 - 11/08/2026
	No studeo temos a parte 
	3 V(NOSQL):
		Volume
		Variedade
		Velocidade: onde ele busca isso aqui. Ele tira os joins, ele tem um charkey para trabalhar de como ele faz. 
		Para o Post tem o OneCompiler
	q2 
		db.pedidos.find().sort({data_pedido:-1}).limit(3);
	Respostas aula de banco relacional:
		Dentro do TXT RESPOSTAS
		
# Aula 06 - 12/08/2026
	Transferindo as 6 tabelas do banco relacional(PostgresSql) para o banco não relacional(NoSql)
	Diferença entre array e object: no object temos um conjunto de identificadores, o array só guarda um conjunto de valores. 
	Essas primeiras 4 linhas não mudam
	db.createCollection("pedidos",{
		validator:{
			$jsonSchema:{
				bsonType:"object",
				required:[    ],
		    }
		  }
	})
	-----------------------------------------------------------
``` json
db.createCollection("pedidos",{
  validator:{
    $jsonSchema:{
      bsonType:"object",
      required:["_id","dataPedido","status","cliente","enderecoEntrega","itens","frete"],
      proporties:{
        _id:{ bsonType:"int"},
        dataPedido:{ bsonType:"date"},
        status:{enum:["CRIADO", "PAGO", "ENVIADO", "ENTREGUE","CANCELADO"]},
      	frete:{ bsonType:"decimal", minimum:NumberDecimal("0")},
        cliente:{ bsonType:"object",
                  required:["id","nome","email"],
                  proporties:{
                    id:{ bsonType:"int"},
                    nome:{ bsonType:"string"},
                    email:{ bsonType:"string"}
                  }
        },
        itens:{ bsonType:"object",
                required:[ ],
                proporties:{
                  
                }
        }
      }
    }
  }
})

//Resposta disso tudo:
db.createCollection("pedidos", {
  validator: {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "dataPedido", "status", "cliente", "enderecoEntrega", "itens", "frete"],
      properties: {
        _id: { bsonType: "int" },
        dataPedido: { bsonType: "date" },
        status: { enum: ["CRIADO", "PAGO", "ENVIADO", "ENTREGUE", "CANCELADO"] },
        frete: { bsonType: "decimal", minimum: NumberDecimal("0") },
        cliente: {
          bsonType: "object",
          required: ["id", "nome", "email"],
          properties: {
            id: { bsonType: "int" },
            nome: { bsonType: "string" },
            email: { bsonType: "string" }
          }
        },
        enderecoEntrega: {
          bsonType: "object",
          required: ["logradouro", "numero", "cidade", "uf", "cep"],
          properties: {
            logradouro: { bsonType: "string" }, numero: { bsonType: "string" },
            cidade: { bsonType: "string" }, uf: { bsonType: "string", pattern: "^[A-Z]{2}$" },
            cep: { bsonType: "string", pattern: "^[0-9]{8}$" }
          }
        },
        itens: {
          bsonType: "array", minItems: 1,
          items: {
            bsonType: "object",
            required: ["produtoId", "sku", "nome", "categoria", "quantidade", "precoUnitario"],
            properties: {
              produtoId: { bsonType: "int" }, sku: { bsonType: "string" },
              nome: { bsonType: "string" }, categoria: { bsonType: "string" },
              quantidade: { bsonType: "int", minimum: 1 },
              precoUnitario: { bsonType: "decimal", minimum: NumberDecimal("0.01") }
            }
          }
        }
      }
    }
  }
})




// Aula prática: do modelo relacional ao MongoDB
// Carga da coleção "pedidos" a partir dos dados de Relacional_Criacao_Carga.txt
// Rode DEPOIS de criar a coleção com MongoDB_Criacao_Restricoes.txt
//
// O QUE MUDOU NO PROCESSO :
// 1) 5 tabelas (clientes, enderecos, categorias, produtos, itens_pedido) viram
//    UM ÚNICO documento por pedido — os JOINs viram embedding.
// 2) cliente e enderecoEntrega deixam de ser uma referência (FK) e passam a ser
//    uma CÓPIA (snapshot) dos dados no momento do pedido — é assim que o
//    documento fica auto-suficiente para leitura, sem precisar de JOIN.
// 3) Em "itens", a categoria do produto (antes só um id_categoria) é
//    DESNORMALIZADA: gravamos o NOME da categoria dentro de cada item, para
//    já vir pronto na consulta.
// 4) JSON puro só tem number/string/boolean — não existe "date", "decimal"
//    nem "int" em JSON. Por isso usamos os construtores do mongosh:
//    NumberInt(), NumberDecimal() e ISODate(). Sem eles, tudo viraria
//    "double" por padrão, e o $jsonSchema (bsonType) do validator rejeitaria
//    o insert.

// ---------------------------------------------------------------
// Pedido 1 — inserido individualmente com insertOne()
// (cliente 1 = Ana Souza, endereço 1 = Casa, itens do pedido 1)
// ---------------------------------------------------------------
db.pedidos.insertOne({
  _id: NumberInt(1),
  dataPedido: ISODate("2026-08-01T10:15:00Z"),
  status: "PAGO",
  frete: NumberDecimal("18.00"),
  cliente: {
    id: NumberInt(1),
    nome: "Ana Souza",
    email: "ana@exemplo.com"
  },
  enderecoEntrega: {
    logradouro: "Rua das Flores",
    numero: "120",
    cidade: "São Paulo",
    uf: "SP",
    cep: "01001000"
  },
  itens: [
    { produtoId: NumberInt(1), sku: "LIV-001", nome: "Modelagem de Dados", categoria: "Livros", quantidade: NumberInt(1), precoUnitario: NumberDecimal("89.90") },
    { produtoId: NumberInt(2), sku: "LIV-002", nome: "MongoDB na Prática", categoria: "Livros", quantidade: NumberInt(1), precoUnitario: NumberDecimal("109.90") }
  ]
});

// ---------------------------------------------------------------
// Pedidos 2 a 6 — inseridos de uma vez com insertMany()
// ---------------------------------------------------------------
db.pedidos.insertMany([
  {
    _id: NumberInt(2),
    dataPedido: ISODate("2026-08-02T14:30:00Z"),
    status: "ENVIADO",
    frete: NumberDecimal("22.00"),
    cliente: { id: NumberInt(2), nome: "Bruno Lima", email: "bruno@exemplo.com" },
    enderecoEntrega: {
      logradouro: "Rua do Mercado", numero: "45",
      cidade: "Campinas", uf: "SP", cep: "13010000"
    },
    itens: [
      { produtoId: NumberInt(3), sku: "INF-001", nome: "Teclado Mecânico", categoria: "Informática", quantidade: NumberInt(1), precoUnitario: NumberDecimal("249.90") },
      { produtoId: NumberInt(4), sku: "INF-002", nome: "Mouse sem Fio", categoria: "Informática", quantidade: NumberInt(2), precoUnitario: NumberDecimal("129.90") }
    ]
  },
  {
    _id: NumberInt(3),
    dataPedido: ISODate("2026-08-03T09:20:00Z"),
    status: "CRIADO",
    frete: NumberDecimal("15.00"),
    cliente: { id: NumberInt(1), nome: "Ana Souza", email: "ana@exemplo.com" },
    enderecoEntrega: {
      logradouro: "Av. Central", numero: "900",
      cidade: "São Paulo", uf: "SP", cep: "01310000"
    },
    itens: [
      { produtoId: NumberInt(6), sku: "PAP-001", nome: "Caderno Universitário", categoria: "Papelaria", quantidade: NumberInt(3), precoUnitario: NumberDecimal("29.90") }
    ]
  },
  {
    _id: NumberInt(4),
    dataPedido: ISODate("2026-08-04T18:45:00Z"),
    status: "ENTREGUE",
    frete: NumberDecimal("28.00"),
    cliente: { id: NumberInt(3), nome: "Carla Mendes", email: "carla@exemplo.com" },
    enderecoEntrega: {
      logradouro: "Av. Atlântica", numero: "700",
      cidade: "Rio de Janeiro", uf: "RJ", cep: "22010000"
    },
    itens: [
      { produtoId: NumberInt(2), sku: "LIV-002", nome: "MongoDB na Prática", categoria: "Livros", quantidade: NumberInt(1), precoUnitario: NumberDecimal("109.90") },
      { produtoId: NumberInt(5), sku: "INF-003", nome: "Webcam Full HD", categoria: "Informática", quantidade: NumberInt(1), precoUnitario: NumberDecimal("199.90") }
    ]
  },
  {
    _id: NumberInt(5),
    dataPedido: ISODate("2026-08-05T11:10:00Z"),
    status: "CANCELADO",
    frete: NumberDecimal("20.00"),
    cliente: { id: NumberInt(4), nome: "Diego Alves", email: "diego@exemplo.com" },
    enderecoEntrega: {
      logradouro: "Rua da Serra", numero: "88",
      cidade: "Belo Horizonte", uf: "MG", cep: "30110000"
    },
    itens: [
      { produtoId: NumberInt(7), sku: "PAP-002", nome: "Caneta Técnica", categoria: "Papelaria", quantidade: NumberInt(5), precoUnitario: NumberDecimal("14.90") }
    ]
  },
  {
    _id: NumberInt(6),
    dataPedido: ISODate("2026-08-06T16:05:00Z"),
    status: "PAGO",
    frete: NumberDecimal("25.00"),
    cliente: { id: NumberInt(3), nome: "Carla Mendes", email: "carla@exemplo.com" },
    enderecoEntrega: {
      logradouro: "Av. Atlântica", numero: "700",
      cidade: "Rio de Janeiro", uf: "RJ", cep: "22010000"
    },
    itens: [
      { produtoId: NumberInt(1), sku: "LIV-001", nome: "Modelagem de Dados", categoria: "Livros", quantidade: NumberInt(1), precoUnitario: NumberDecimal("89.90") },
      { produtoId: NumberInt(4), sku: "INF-002", nome: "Mouse sem Fio", categoria: "Informática", quantidade: NumberInt(1), precoUnitario: NumberDecimal("129.90") },
      { produtoId: NumberInt(6), sku: "PAP-001", nome: "Caderno Universitário", categoria: "Papelaria", quantidade: NumberInt(2), precoUnitario: NumberDecimal("29.90") }
    ]
  }
]);
```

# Aula 07 - 18/08/2025

# Aula 08 - 19/08/2025
Consulta primeiro
Da o update 
Consulta de novo
```json
use empresa_tech

db.funcionarios.insertMany([
  {
    nome: "Ana Silva",
    idade: 28,
    cargo: "Desenvolvedora Frontend",
    departamento: "Tecnologia",
    salario: 7500.00,
    data_contratacao: new Date("2021-03-15"),
    ativo: true,
    habilidades: ["JavaScript", "React", "CSS", "HTML"],
    contato: {
      email: "ana.silva@empresa.com",
      telefone: "11-98765-4321"
    }
  },
  {
    nome: "Bruno Costa",
    idade: 35,
    cargo: "Desenvolvedor Backend",
    departamento: "Tecnologia",
    salario: 9000.00,
    data_contratacao: new Date("2019-07-20"),
    ativo: true,
    habilidades: ["Java", "Spring", "Docker", "PostgreSQL"],
    contato: {
      email: "bruno.costa@empresa.com"
    }
  },
  {
    nome: "Carla Dias",
    idade: 42,
    cargo: "Gerente de Projetos",
    departamento: "Projetos",
    salario: 12500.00,
    data_contratacao: new Date("2017-01-10"),
    ativo: true,
    habilidades: ["Scrum", "Jira", "Gestão de Riscos"],
    contato: {
      email: "carla.dias@empresa.com",
      telefone: "11-91234-5678"
    }
  },
  {
    nome: "Daniel Farias",
    idade: 25,
    cargo: "Analista de Dados",
    departamento: "BI",
    salario: 6000.00,
    data_contratacao: new Date("2022-11-01"),
    ativo: true,
    habilidades: ["SQL", "Python", "PowerBI", "AWS"],
    contato: {
      email: "daniel.farias@empresa.com"
    }
  },
  {
    nome: "Eduarda Lima",
    idade: 31,
    cargo: "Analista de RH",
    departamento: "RH",
    salario: 5500.00,
    data_contratacao: new Date("2020-05-30"),
    ativo: false,
    habilidades: ["Recrutamento", "Entrevistas", "Legislação"],
    contato: {
      email: "eduarda.lima@empresa.com",
      telefone: "11-98888-7777"
    }
  },
  {
    nome: "André Marques",
    idade: 29,
    cargo: "Desenvolvedor Fullstack",
    departamento: "Tecnologia",
    salario: 8500.00,
    data_contratacao: new Date("2023-02-18"),
    ativo: true,
    habilidades: ["Node.js", "React", "MongoDB", "AWS"],
    contato: {
      email: "andre.marques@empresa.com"
    }
  }
]);
```

``` json
db.funcionarios.updateOne(
  { nome: "Daniel Farias"},
  {
    &set:{
      cargo: "Cientista de Dados",
      Salario: 7800.00
    }
  }//Ação de atualização
)

db.funcionarios.updateOne(
  { nome:"Daniel Farias"},
  {
    $unset:{"Morte":""}
  }
)
db.funcionarios.updateOne(
  { nome: "Daniel Farias"},
  {
    $set:{
      cargo: "Cientista de Dados",
      Salario: 7800.00,
      Morte: true
    }
  }
)

db.funcionarios.updateMany(
  {},//Esse daqui é a parte do where, precisa ter essa parte sempre
  //Pq o daqui para baixo é a projeção
  {
    $rename:{"habilidades":"competencias"}
  }
)

db.funcionarios.updateOne(
  {nome:"Carla Dias"},
  {
    $set:{cargo:"Diretora de Projetos"},
    $currentDate:{ultima_modificacao:true}
  }
)

db.funcionarios.updateMany(
  {departamento:"Tecnologia"},
  {
    $inc:{salario:500}
    //Incrementa o salario, se eu quiser tirar é só eu usar um -(menos) na frente
  }
)

db.funcionarios.updateMany(
  {ativo: true},
  {
    $mul:{
      salario: 1.05
    }
  }
)
db.funcionarios.updateOne(
  {nome:"Ana Silva"},
  {
    $push:{"competencias":"TypeScript"}
  }
)
```


# Aula 09 - 25/08/26

# Aula 10 - 26/08/26
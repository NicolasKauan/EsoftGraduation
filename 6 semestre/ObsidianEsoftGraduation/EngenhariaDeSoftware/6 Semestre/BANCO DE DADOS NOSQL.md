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
# Aula 06 - 12/08/2026
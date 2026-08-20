Professora Ana


# Aula 01 - 27/07/2026
# Aula 02 - 30/07/2026

# Aula 03 - 03/08/2026

# Aula 04 - 06/08/2026
	Produção de software
		Organização
			pq uma empresa precisa ser organizada
			Conhecimento: Nosso capital seria o conhecimento e o intelecto. Nesse caso, temos que em uma empresa varias pessoas vão passar por uma empres, ou seja, um software vai passar por varias pessoas. A estrutura/organização em uma empresa seria uma barreira de proteção para o ciclo de vida de um projeto/software.
			Organização Produtoras:
		Itens que temos que verificar para termos a organização em nossos processos de software:
			Partes interessadas:Entidades externas que interagem com os processos de negócio da organização.
			Iso 12207 Processos do ciclo de vida do software:Os processos mais visiveis para as partes interesssadas externas são chamadas de processos primários.
				Processo: Aquisição, fornecimento, desenvolvimento, operação e manutenção.
			Estrutura da organização produtora
				Unidades organizacionais: Podemos ter varias unidades subordinadas dentro de uma unidade mãe/chefe.
			Maturidade das organizações:
				Maturidade: grau de competencia, tecnica e gerencial, que a organização possui para atingir suas metas.
				Sintomas de imaturidade
					Projetos não são definidos com clareza
					As pessoas não recebem os treinamentos necessários
					As ferramentas não ajudam realmente a resolver os problemas
					Os procedimentos e padrões, quando existem, são definidos de maneira burocrática, sem funcamentação teórica ou base em dados reais. O processo mapeado é rigido e o executado muio diferente.
				Prejuízos da imaturidade: Slide
			*Nos slides temos 10 riscos de projetos sem processos adequados *
# Aula 05 - 10/08/2026
	História e evolução dos processos de desenvolvimento de software(cilcos de conhecimento):
		Desorganização inicial -> Crise de software -> Modelo cascara -> modelos iterativos -> manifesto ágil -> processos contemporaneos. 
		Desorganização Inicial: 
			Era pré-processos(1940-1960)
				Contexto diferente, etavamos saindo da era mecanica e enrando em uma era diferente. Voltado para a construção de hardware. Código de maquina, feito sob demanda, não pensando em escalabilidade. Entendiam muito bem da parte da lógica. Tinhamos uma coisa a mais de criatividade de serem inventores. 
				Caracteristicas: Sem métodos formais ou padrões, Cada projeto era uma aventura artesanal, com pouca documentação e conhecimento era pessoal e não compartilhado. 
				*Obs. Nesse momento da história a maioria eram mulheres*
				Problemas: Software dificil de manter e reutilizar, altamente suscetivel a erros humanos, crescimento da complexidade sem controle. 
		Crise do Softawre(1968-1970)
			Ponto de ruptura
			Época em que começaram a pensar em se organizar, com o pensamento de que se continuassem do jeito que eram os projetos não se sustentariam a longo prazo. 
			Eventos marcantes: Conferencia da otan, termo formalizado.
				Foco: atrasos, estouros de orçamentos, falhas catastróficas
				Surge o termo "Engenharia de software".
			Exemplos: Projetos militares e aeroespaciais com atrasos crítios, sistemas de defesa dos era com bugs que comprometiam segurança. 
				Frase marcante: "Estamos tentando construir sistemas além da nossa capacidade de compreende-los"
		Modelo cascata(Waterfall - Década de 1970)
			Caracteristicas: Linha de produtação, etapas muito sequenciais e rigidas. Mas ironicamente como um modelo a ser evitado sem ciclos de validação.
			*COMEÇO MEIO E FIM BEM DELIMITADO*
			*Exemplo: MVP*
			Fases:Requisitos, análise, projeto, implementação, testes e manutenção. 
			Objetivo: Trazer ordem, docuemntação e controle para o caos
			*Obs. Primeio modelo que temos datado para tentar fornecer uma ordem em meio ao caos da crise do software da época.*
			Pontos fortes: Clareza de etapas, facilita o gerenciamento, boa trastreabilidade e controle.
			Problemas: Pouca flexibilidade, testes só no final, mudanças de requisitos são difíceis de incorporar
			Exemplo real:
				NASA - Projeto Apollo> Software altamente controlado e documentado, usado com sucesso, mas com enorme custo e tempo.
		Modelos iterativos e incrementais(1980-1990)
			Reação á rigidez do cascata. Iterativo: Produzir vários pedacinhos
			Incremental: pois desses varios pedacinhos eu faço um pedaço grande kkkk
			Modelo Espiral(Barry Boehm, 1986)
				Focos em riscos
				Cada ciclo inclui: definição, análise de risco, construção e avaliação
				RUP - RAPTIONAL UNIFIED PROCESS (IBM)
				Baseado em iterações
				Ciclo de vida dividido em fases:
					Iniciação 
					Elaboração
					Construção
					Transição
				Integra práticas de engenharia orientada a objetos e UML.
				Beneficios: feedback precoce, flexivel a mudanças, enfatiza qualidade de software e arquitetura. 
				Desvantagens: Complexidade alta, custo e tempo ainda significativos, requer alto nível de capacitação
				Exemplo: Grandes sistemas bancários, erp, telecomunicações.
			Manifesto Ágil(2001 - Ponto de virada)
				Evento histórico:
					17 especialistas reúnem-se em Snowbird, Utah.
					Rejeitam burocracia excessiva dos métodos anteriores. 
					Criam os 4 valores e 12 princípios do Manifesto Ágil.
				Principios: Slides
				Tema principal: Slides
				Métodos populares:
					Scrum, Extreme Programming (XP), Kanban
					Beneficios:
					Entregas rápidas e frequentes.
					Flexibilidade ás mudanças.
					Cultura colaborativa e foco no cliente.
				Desafios:
					Pode gerar desorganização disfarçada de agilidade.
					Exige disciplinas e times maduros.
				Exemplos reais:
					Spotify
					Google e facebook
			Processos comteporaneos(2010+)
				Integração e escalabilidade
				DevOps:
					 Integra desenvolvimento + operações.
					Foco em automação, entrega continuas, resiliencia.
				CI/CD:
					Continuous integrration / Continuous Delivery
					Pipeline automatizado de testes, builds, deploy.
				SAFe
					Escala os principios ageis para grandes organizações
				Lean Software Developmenti
					Baseado no Toyota
					Elimina disperdicios, foca em valores continuos
				Amazon:
					Centenas de deploys por dia.
				Netflix:
					Testes em produção, mcrosserviçoes
				Nubank:
					Squads ágeis com arquitetura moderna
				Natura:
					Implementou Desugn Thinking para desenvolver novos produtos e serviçoes, focando nas necessidades dos clientes e buscando soluções inovadoras.
# Aula 06 - 13/08/2026
	 Slides Aula 05:
		 Modelos evolutivos do processo de software
			 Programaão Ad hoc
				Programação sem processo formal
				Programação feita para cada computaodr em especifico.
				Normalmente feito por mulheres nessa época
				Normalmente formadas por matemáticos, engenheiros ou operadores do próprio computador. 
				Código direto - Sem ambiente para teste/homologação
				Curto prazo e urgencia - Foco em só fazer funcionar o mais rapido possivel
				Vantagem: rapidez inicial, flexibilidade total, baixo custo inicial
				Desvantagens: Dependencia forte do programador.
			 Modelo de código e conserto
					(Code-and-fiz)
					Codifica-remenda: O desenvolvimento é feito partindo de apenas uma especificação (ou nem isso) e os desenvolvedores começam imediatamente a codificar, remendando á medida que o erros são descobertos.
					Nenhum processo definido é seguido
					Representa alto risco, impossivel de gerir e não permite assumir grandes projetos. Sem segurança
					 Escrever código: Código, testar, corrigir e repetir.
					 Vantagens: Velocidade inicial, baixa burocracia e facilidade para pequenos projetos.
					 Desvantagens: Alta manutenção, custo crescente, pouca escalabilidade, ausencia de previsibilidade. 
			 Modelo em cascara
				 Ele é sequencial e linear, seguindo etapas fixas onde a saida de uma fase serve de entrada para a proxima - como uma "cascata" de agua descendo.
				 Etapas:
					 Levantamento de requisitos: /
					 Analise de sistema: 
					 Projeto:
					 Implementação:
					 Testes:
					 Implementação e Manutenção:
			 Modelo em V
				 
			 Modelo de desenvolvimento ecolutivo inicial
				 
			 Modelo incremental
				 
			 Programação estruturada
				 
			 Desenvolvimento rápido de aplicações
				 
			 Modelo de ciclo de vida classico
				 
			 Modelo de prototipagem rapida
				 
			 Modelo espiral
				 
			 Modelo de desenvolvimento baseado em componentes
				 
			 Moelo RUP

# Aula 07 - 17/08/2026
	Continuação das aulas:
		Modelos evolutivos do processo de software
			Modelo de desenvolvimento baseado em componentes: 
				O desenvolvimento baseado em componentes é uima abordagem onde o software é construido a partir da integração de componentes pré=existentes, que são unidade de software independentes, reutilizáveis e com funcionalidades especificas bem definidas.
				Em vez de criar do zero, o conceito desse projeto é basicamente pegar algo já pronto e pegar aquilo que desejo e fazer isso funcionar bem.
				Vantagens: Tras economia, reutilização de código, maior produtividade, qualidade e confiabilidade, manutenção facilitada.
			Programação estruturada
				 Não é em si um processo, mas como é um meio de programar, pode se utilizar como um processo. Nesse caso seria ter um fluxo de controle bem definido. Devisão em modolos, fluxo de controle bem definido e evita o uso de comandos "goto" e hierarquia e top-down. 
				 Vantagens: Código mais organizado e facil de entender, facilita a identificcação e correçõa de erros, melhora a manutenção e atualização do programa e facilita o trabalho em equipe, pois o código é modularizado. 
				 Analise do problema.
				 Divisão do problema.
				 Desenvolvimento dos modulos.
				 Testes.
				 Integrações.
			Modelo RUP(Rational Unified Process):
				É um modelo iterativo e incremental criado pela IBM. 
				Ciclos de processo de software: 
					Iniciação: Defini-se o escopo do projeto, requisitos iniciais e viabilidade, sem programação pesada ainda. 
					Programação iterativa e incremental: Simplesmente entregar algo do software em partes bem definidas.
					Elaboração:Desenvolve-se a arquitetura do sistema, cria-se protótipos e começam a programar os componentes criticos para validar a arquitetura
					Construção: Aqui que realizamos a programação iterativa e incremental
					Transição: Entregar o produto e corrigir os erros
			Desenvolvimento Rápido de aplicações
				Simplesmente fazer a coisa rapida. Sem requisitos bem estruturados. Protótipo mostra para o cliente valida e parte para a frente, tem que ser rapido.
				Vantagens da programação no RAD
					Entrega rápida de sistemas funcionais
					Maior alinhamento com as necessidades do usuário
					Flexibilidade para mudanças durante o desenvolvimento
					Redução de riscos com feedback constante. 
				Etapas: Requisitos preliminares, Desenvolvimento do protótipo, revisão pelo usuário, ajuste e melhorias e construção incremental. 
	Termino da aula de semana passada.
	Aula de hoje: Aula 06 - Metodologias ágeis
		Scrum
			O que é: Framework iterativo e incemental para gerenciamento e desenvolvimento de projetos complexos.
			Principais pilares:
				Times pequenos, auto -organizados
				Sprints(ciclos curtis de trabalho, geralmente 2-4 semanas)
				Reuniões diárias(Daily Scrum)
				Papéis claros: PO, Scrum Master, time de desenvolvimento
				Backlog do produto e backlog da sprint
					Importancia: base para muitas prátivas ágeis modernas, foco na inspeção e adaptação constante. 
		XP
			O que é: Metodologia focada em prátivas técnicas de desenvolvimento de software para melhorar qualidade e capacidade de resposta a mudanças
			Principais práticas:
				Programação em pares
				Desenvolvimento orientado a testes
				Integração continua
				Releases frequentes
				Código simples e refatoração constante
					Diferencial: Enfase nas prátivas de engenharia de software alinhadas aos valores ágeis. 
		Crystal Methodologies
			O que é: Familia de metodologias ágeis adaptadas ao tamanho da equipe e criticidade do projeto. 
			Principios:
				Pessoas acima de processos e ferramentas
				Entrega frequente de software funcional
				Reflexão e melhoria continua
				Comunicação dace a dace como padrão
				LUGAR LEGAL
			Vantagens: 
				Altamente adaptaveis ao contexto
				Leve em termos de documentação e burocracia
				Favorece comunicação direta e aprendizado rápido
				Pode ser escalada para projetos maiores ajustando prátivas e formalidades.
			Desvantagens
				Precisa de um time legal para funcionar
				Não tem guia passo a passo
				Muita flexibilidade que pode gerar falta de clareza no processo. 
		FDD(Feateru-driven development)
			 Metodologia orientada a funcionalidade com foco em planejamento detalhado e desenvolvimento incremental de pequenas funcionalidades. É uma metodologia agil, mas com foco mais forte em planejamento e modelagem do que métodos como Scrum ou XP.
			 Motivação: Encontrar uma forma estuturada e previsicel de desenvolver software, mas sem perder a agilidade e a entrega incremental
			 Principais etapas
				 Desen de um modelo geral
				 Construção da lista de funfa
				 ...
			Principios fundamentais:
				Entregar a funfa concreta e de valor para os clientes
				Planejar com base nas funfas, não apenas em tarefas técnicas
				Modelar antes de construir - modelagem inicial e ajustes continuos 
				Manter acompanhamento visual do progresso - 
				Design por funcionalidade - cada pequena entrega tem design e implementação completos.
		abababa

# Aula 08 - 20/08/2026
	 Continuação da aula de metodologias ágeis
		Dynamic Systems Development Method(DSDM)
			o que é: Metodologia para inovação, focada para a construção de novos produtos. Unica metodologia que tem a parte de verificar as tendencias de mercado. Uma coisa particular onde ela deixa o tempo, custo e qualidades fixos, mas deixa o escopo flexivel. 
			8 principios obrigatórios:
				Focar na necessidade do negócio
				Entrega no prazo
				Colaborar
				Nunca comprometer qualidade
				Construir de forma incremental a partir de bases sólidas
				...(Continuação no slide)
			Métodos é dividido em fases bem definidas
			Pré-projeto
			Estudo de viabilidade
			Estudo de negócio
			Iteração do modelo funcional
			Iteração de design e construção
			Implementação
			Pós-projeto
		Lean Software Development
			O que é: Aplicação dos principios Lean para eliminar desperdicios e otimizar fluxo no desenvolvimento de software
			Principios
				Eliminar desperdicio
				amplificar aprnedizado
				decidir o mais tarde possivel
				entregar o mais rapido possivel
				empoderar a equipe
				construir integridade
				ver o todo
		Adaptive Software Development(ASD)
			O que é: Metodologia ágil voltada para o desenvolvimento de software em ambientes de alta inverteza e mudança constante, éfoca em ciclos adaptativos e aprendizagem continua. Evolução do RAD visando lidar melhor com projetos complexos, onde requisitos mudanm rapidamente e não podem ser definidos totalmente no inicio
			Objetivos:
				Criar mum processo flexivel e adaptável que responda a mudanças de requisitos, tecnologia ou mercado
				Reduzir o risco de fracasso em projetos com alto grau de incerteza
				Incentivar a colaboração constante e aprendizado continuo entre equipes e stakeholerns
				...
				Slide
		Agile Unified Process (AUP)
			O que é: Versão simplificada e agil do rup, combinando prátivas ageis
			...(slide)
		Disciplined Agile Delivery(dad)
			o que é: 
			...slide
		Kanban para software
			o que é: Método visual para gerenciar fluxo de trabalho, baseado no método Kanban do Lean
			Principios
				Visualizar o fluxo de trabalho
				Limitar o trabalho em progresso(WIP)
				Gerenciar fluxo
				Tornar políticas explícitas
				Melhorar continuamente
				Diferencial: foco em fluxo continuo, sem sprints ou timeboxes
		Scaled Agile Framework(SAFe)
			O que é: framework para escalar práticas ágeis e Lean em grandes organizações com multiplas equipes
			Caracteristicas:
				Program increments
				3 NIVEIS(team, program portfolio)
				Cerimonias e papeis alinhados com Scrum e Lean
				Diferencial: Amplamente adotado em grandes corporações.
		Large Scale Scrum (LeSS)
			...slide
		Spotify Model
			O que é: Abordagem para organizar times em squads(equipes pequenas e autonomas) chapters(especialistas), tribes(agrupamento de squads) e guilds(interesses comuns).
			Caracteristicas
				Autonomia e alinhamento
				Cultura forte de colaboração
				foco em inovação e agilidade organizacional
				Diferencial: Inspira muita empresas, mas não é um framework prescritivo.
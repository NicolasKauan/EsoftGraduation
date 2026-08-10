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
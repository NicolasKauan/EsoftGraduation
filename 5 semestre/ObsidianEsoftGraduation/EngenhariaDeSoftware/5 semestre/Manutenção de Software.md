Professor: João Paulo Biazotto;
Contato: joao.biazotto@unicesumar.com.br

# Aula 00 - 09/02/2026

# Aula 01 - 10/02/2026
	Obs. Nesta aula tem uma atividade prática
	Fundamentos de manutenção de Software
		Revisão de processos de software
			Requisitos: requisitos temos o levantamento dos quereres dos clientes/partes interessadas, temos também a parte das restrições.
			Projeto(análise, projeto, arquitetura): Parte da modelagem e a forma de como vamos organizar um softwarer. Podemos ter na parte da estruturação do código, exemplo: hexagonal, monolito, microsserviços, etc.
			Implementação: Seria a parte de fato programar o sistema, podemos ter a parte de teste aqui.
			Manutenção: Ponto focal da disciplina, acontece depois da entrega do projeto.
		Tipos de manutenção 
			Manutenção corretiva: Encontrado um defeito/bug no projeto e precisamos corrigir esse defeito.
			Manutenção preventiva: Seria a manutenção para tentar evitar o problemas, foi usado o exemplo de atualização de dependencias, refatorações, atualização de documentações, etc.
			Manutenções adaptativas: Seriam manutenções que vem de fora, ou seja, impostos por algo externo, que não fazem parte do projeto mas tem impacto sobre ele
			Manutenção evolutiva: Quando temos a inserção de novas funcionalidades no sistema
			Obs. Técnicamente essa seria a mais utilizada, por conta de ser algo que agrega valor ao sistema como um todo. 
		Leis de lehman
			O termo manutenção de software data dos anos 60/70
			Lehman após 20 anos de pesquisas, formulou as 8 leis da evolução do software
			8 tópicos slide 23. 
				Mudança continua: o sftware sempre vai estar mudando por alguma coisa
				Complexidade crescente: sempre vai ficar mais complexo ao longo do tempo
				Crescimento contínuo: O sistema vai sempre estar em crescimento continuo
				Declínio de qualidade: O software sempre vai perder qualidade se não é alterado para refletir as mudanças do ambiente externo. Ou seja, o software vai perdendo qualidade ao longo do tempo
				Auto regulação: o software tende a se auto regular, seguindo padr~]oes previsíveis e comportamentos disciplinados.
				Conservação da estabilidade organizacional: O software tende a se manter em um nível constante em reação à organização
				Conservação da familiaridade: Muitas mudanças no software afetam a familiaridade dos usuários com o software
				Sistema de feedback: Cada nova versão, gera feedback e novas informações e ajustes
		Manutenção/Evolução:
		OBS. Slide 5 temos uma definição do que seria a manutenção
		Desenvolvimento x Manutenção:
			Pergunta qual seria mais facil, fazer algo em já em produção, ou quando o projeto não foi entregue, reposta, quando ainda não foi entregue
			Neste caso o professor utilizou o exemplo da contrução de uma casa, onde é sempre mais facil realizar alguma alteração enquanto ainda estamos na fase de planejamento/projeto da casa do que mudar depois que tivéssemos algo já "Levantado". 
			Acoplamento: Se realizarmos a alteração em algum lugar, teremos respingos e mais lugares do código.
			Retirando o acoplamento seria um jeito de realizar uma "ajuda" para o desenvolvimento do software, reduzindo o impacto dele como um todo.
			Slide 10 temos quando realizarmos a manutenção em um software
			Qual seria o melhor momento para realizar a mudança de um design: Seria quando a parte do design atual do seu sistema está mais atrapalhando do que te ajudando
		Categorias de Manutenção:
			Slide 19
			Manutenção corretiva e evolutiva são mais visíveis e trazem valor direto para o usuario
			Manutenção preventiva e adaptativa trazem valor indireto para o usuário(por quê?)
	Custo de manutenção de Software
		O gráfico apresentado pelo professor foi de 67% de todo o budget de um projeto.
		Se a manutenção de um software é cara quase sempre está relacionada por conta da baixa manutenibilidade do projeto
		A manutenibilidade é dificil de quantificar
		O que temos de impacto pela manutenibilidade
			Qualidade de código
			Arquitetura
			Acoplamento, etc
		Para a manutenibilidade temos algumas métricas que podem nos dar um bom indicador para isso, para verificar isso, verificar o slide 32.
		Obs. O importante é saber que temos metricas para isso.
# Aula 03 - 24/02/2026
	Princípios SOLID
		Pq falar de SOLID: SOLID = conjunto de princípios para: Reduzir acoplamento, aumentar coesão(aquilo que está correto, aquilo que está certo. Neste caso seria aumentar o que está certo dentro do código) e facilitar evolução e testes
		Esses principios vem para ajudar na escabilidade do código, em sua manutenção ao longo do tempo.
		Acoplamente é quando duas partes do sistema dependem uma da outra. Não que isso seja algo ruim, mas se tivermos algo totalmente acoplado teremos uma dificuldade para realizarmos a manutenção.
		Causas principais por trás da bagunça: Muitas responsabilidades no mesmo lugar(uma classe faz "tudo"), Dependência direa de detalhes(gateway, email, sms dentro do checkout), extensão por edição(toda nova regra obriga alterar código existente) e interfaces inchadas(serviço obrigado a conhecer métodos que nem usa). No fim das contas, o problema não é OO, mas, sim, o design sem princípios para mudanças constantes.
		SOLID
			S - Single Responsibility;
			O - Open-closed principle;
			L - Liskov suvtitution principle;
			I - interface segragation principle;
			D - Dependency inversion principle;
	S - Single Responsibility
		Cada classe deve ser responsavel por uma unica responsabilidade
	O - Open-closed principle
		Uma classe deve ser fechada para uma modificação mas aberta para uma extensão
	L - Liskov substitution principle
		Todas as subsclasses devem conseguir substituir a superclasse. Em resumo, precisamos que qualquer subclasse deve poder substituir a superclasse. Lembrar dos veiculo(Superclasse e flutuar) e as subclasses(Carro, bicicleta, barco). 
	I - interface segragation principle
		Segregação de interface: Nossas interfaces devem ser o mais especificas possiveis, para eviter termos métodos vazios em uma classe que implemente ela. 
	D - Dependency inversion principle
		Inversão de dependencias é vc depender de abstrações e não de implementações concretas. Neste caso o que temos seria que uma classe concreta dependa de uma clase abstrata(interface) em vez de outra concreta

# Aula 04 - 02/03/2026
	
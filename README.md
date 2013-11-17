:Analisador Estático de Código Java - (AEC-J):
----------------------------------------------

Paulo Bender (leopoldes@gmail.com)

Universidade do Vale do Rio dos Sinos(UNISINOS)
São Leopoldo – RS – Brazil




1. Introdução:

	Um analisador estático de código provê um processo de verificação e validação do
	código fonte de forma automatizada. Processo este que aborda as fases iniciais do
	compilador, e tem como saída um relatório informando erros e inconsistências.
	O objetivo do analisador estático de código java (AEC-J) é prover
	verificação de erros e de regras de estilo.


2. Escopo e Ferramentas:

	O AEC-J irá executar o processo de análise léxica do código e um pequeno subset da
	análise sintática, atendo-se às questões mais básicas e fundamentais da sintaxe, tais
	como: uso de operadores, regras sintáticas relacionadas ao uso de palavras reservadas
	(if, while, for, etc).
	Outros aspectos da verificação e apontamento de erros: variáveis inicializadas
	mas não utilizadas, comparação de objetos sem utilizar equals, etc.
	A verificação de estilo por sua vez irá validar padrão de nomenclatura,
	visibilidade de atributos, tamanho de métodos e classes e código duplicado. Além da
	verificação de algumas das melhores práticas sugeridas por [BLOCH]
	
	1) Variáveis inicializadas mas não utilizadas;
	2) Comparação de objetos sem utilizar equals;
	3) A verificação de estilo por sua vez irá validar padrão de nomenclatura (checkstyle como exemplo);
	4) Visibilidade de atributos;
	5) Tamanho de métodos e classes (defini-se um padrão);
	6) Código duplicado;
	7) Além da verificação de algumas das melhores práticas sugeridas por [BLOCH].
	http://blog.caelum.com.br/effective-java-segunda-edicao/


3. Exemplo:

	Como entrada a ferramenta irá receber um arquivo com código java (classe concreta,
	interface, classe abstrata) e a saída será um relatório no console registrando o problema
	encontrado, linha do arquivo em que o problema foi identificado e sugestão de correção.
	
	

Referências:

Bloch, Joshua (2000), Java Efetivo, Alta Books, 2a edição.

programa
{
	
	funcao inicio()
	{
		//Identação
		//Recebe um nome digitado pelo usuário
		//Digita uma mensagem na tela com esse nome
		//Vareia = Variável - Tipo - Fortemente Tipado
		//Recebe muitas letras - cadeia de caracteres
		
		//ingredientes
		cadeia nomeUsuario //camelCase - criou uma variavel na memória
		inteiro anoNascimento //variável numérica para idade
		real salarioUsuario // salário do usário
		inteiro idadeUsuario = 0
		
		//modo de preparo
		escreva ("Digite o nome do usuário: ") //escreveu na tela
		leia(nomeUsuario)
		escreva("Digite o ano do nascimento: ")
		leia(anoNascimento)
		escreva("Digite o salário: ")
		leia(salarioUsuario)

		//processamento
		idadeUsuario = 2020-anoNascimento
		
		//saída - tira do forno
		escreva("\n Oi, meu nome é ",nomeUsuario)
		escreva("\n Nasci no ano de ",anoNascimento)
		escreva("\n Meu salário atual é ",salarioUsuario)
		escreva("\n Eu tenho "+idadeUsuario+" anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 905; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
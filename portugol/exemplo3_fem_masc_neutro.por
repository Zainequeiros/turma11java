programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		caracter opcao
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite m - masculino / f - feminino / e - não binário: ")
		leia(opcao)
		se (opcao == 'f') {
			escreva("Bom dia Sra. ", nomeUsuario, "!")
		}
		senao se (opcao == 'm') {
			escreva("Bom dia Sr. ", nomeUsuario, "!")
		}
		senao {
			escreva("Bom dia Sre. ", nomeUsuario, "!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario

		escreva("Digite um número qualquer: ")
		leia(valorUsuario)
		limpa()
		parImpar(valorUsuario)
	}
	funcao parImpar(inteiro valorUsuario) {
		se (valorUsuario > 0) {
			se ((valorUsuario % 2) == 0) {
				escreva("O valor é par")	
			}
			senao {
				escreva("O valor é ímpar")
			}
		}
		senao se (valorUsuario < 0) {
			escreva("O valor é negativo. Digite um número maior que 0 para continuar")
		}
		senao {
			escreva("Você digitou 0. Digite um número maior para continuar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario

		escreva("Digite um valor: ")
		leia(valorUsuario)

		se (valorUsuario > 0) {
			se ((valorUsuario % 2) == 0) {
				escreva("O valor é positivo e par")	
			}
			senao {
				escreva("O valor é positivo e ímpar")
			}
		}
		senao se (valorUsuario <0) {
			se ((valorUsuario % 2) == 0) {
			escreva("O valor é negativo e par")
			}
			senao {
				escreva("O valor é negativo e ímpar")
			}
		}
		senao {
			escreva("Você digitou 0")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
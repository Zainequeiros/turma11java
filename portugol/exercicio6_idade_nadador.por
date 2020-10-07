programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a sua idade: ")
		leia(idade)

		se (idade >= 5 e idade <= 7) {
			escreva("Sua categoria é a infantil A")
		}

		senao se (idade >= 8 e idade <= 11) {
			escreva("Sua categoria é a infantil B")
		}

		senao se (idade >= 12 e idade <= 13) {
			escreva("Sua categoria é a Juvenil A")
		}

		senao se (idade >= 14 e idade <= 17) {
			escreva("Sua categoria é a Juvenil B")
		}

		senao se (idade >= 18) {
			escreva("Sua categoria é a Adulta")
		}

		senao {
			escreva("Você ainda é muito jovem pra nadar aqui, volte quando chegar aos 5 anos :)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
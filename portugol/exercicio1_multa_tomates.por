programa
{
	
	funcao inicio()
	{
		
		inteiro pesoTomates, excessoPeso, valorMulta
		
		escreva("Digite o peso total dos tomates: ")
		leia(pesoTomates)

		excessoPeso = (pesoTomates - 50)
		valorMulta = (excessoPeso*4)

		se (pesoTomates > 50) {
			escreva("O peso excedente de tomates é: ", excessoPeso, "kg e a multa a ser paga é de R$", valorMulta)
		}

		senao {
			escreva("ZERO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro numero[4], posicao

		para (posicao=0; posicao<4; posicao++) {
			escreva("Digite um número: ")
			leia(numero[posicao])
		}

		para (posicao=0; posicao<4; posicao++) {
			escreva("\nValor posição ", posicao+1, ":", numero[posicao])
		}

		para (posicao=3; posicao>=0; posicao--) {
			escreva("\nValor posição ", posicao+1, ":", numero[posicao])
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
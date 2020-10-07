programa
{
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	
	funcao inicio()
	{

		 const inteiro TAMANHO = 3
		 inteiro valores[TAMANHO][TAMANHO]
		 inteiro linha = 0, coluna = 0, somaMatriz = 0, somaDiagonal = 0
		
		 para (linha=0; linha<TAMANHO; linha++) {
			para (coluna=0; coluna<TAMANHO; coluna++) {
				escreva("Digite um número: ")
				leia(valores[linha][coluna])
			}
		}

		escreva("\n")
		para (linha=0; linha<TAMANHO; linha++) {
			para (coluna=0; coluna<TAMANHO; coluna++) {
				se(linha==coluna) {
		 			somaDiagonal = somaDiagonal + valores[linha][coluna]	 			
		 		}
				somaMatriz = somaMatriz + valores[linha][coluna]
			}
		}
		limpa()
		escreva("A soma dos valores da matriz é: ", somaMatriz)
		escreva("\nA soma da dos valores da diagonal principal é: ",somaDiagonal)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
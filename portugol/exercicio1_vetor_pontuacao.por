programa
{
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
//Encontre após a maior pontuação e a apresente.
	funcao inicio()
	{
		inteiro pontuacao[5], posicao, maiorPontuacao = 0

		para (inteiro x=0; x<5; x++) {
			escreva("Digite a pontuação da sua atividade: ")
			leia(pontuacao[x])
			se (pontuacao[x] > maiorPontuacao) {
				maiorPontuacao = pontuacao[x]4
				
			}
		}
		
		limpa()
		escreva("\nSuas pontuações na atividade foram: ")
		
		para (inteiro x=0; x<5; x++) {
			escreva("[ ", pontuacao[x], " ]")
		}

		escreva ("\nA sua maior pontuação nessa atividade foi: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
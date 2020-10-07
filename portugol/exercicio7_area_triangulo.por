programa
{
	
	funcao inicio()
	{
		real base, altura, areaTriangulo

		escreva("Digite o valor da base: ")
		leia(base)
		escreva("Digite o valor da altura: ")
		leia(altura)
		areaTriangulo = ((base*altura)/2)

		se (base > 0 e altura > 0) {
			escreva("A área do triangulo é ", areaTriangulo)
		}
		senao {
			escreva("Digite valores maiores que zero para calcular a área do triângulo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
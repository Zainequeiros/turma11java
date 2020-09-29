programa
{
	
	funcao inicio()
	{
		inteiro valor1, valor2, valor3, valor4, quadrado1, quadrado2, quadrado3, quadrado4
		escreva("Digite o valor 1: ")
		leia(valor1)
		escreva("Digite o valor 2: ")
		leia(valor2)
		escreva("Digite o valor 3: ")
		leia(valor3)
		escreva("Digite o valor 4: ")
		leia(valor4)

		quadrado1 = valor1*valor1
		quadrado2 = valor2*valor2
		quadrado3 = valor3*valor3
		quadrado4 = valor4*valor4

		se (quadrado3 >= 1000) {
			escreva("O valor do terceiro número é ", valor3, " e seu quadrado é ", quadrado3)
		}
		senao {
			escreva("\nO valor do primeiro número é ", valor1, " e seu quadrado é ", quadrado1)
			escreva("\nO valor do segundo número é ", valor2, " e seu quadrado é ", quadrado2)
			escreva("\nO valor do terceiro número é ", valor3, " e seu quadrado é ", quadrado3)
			escreva("\nO valor do quarto número é ", valor4, " e seu quadrado é ", quadrado4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
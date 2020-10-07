programa
{
	
	funcao inicio()
	{
		inteiro numero,tabuada,resultado

		escreva("Entre com o valor da tabuada: ")
		leia(tabuada)
		limpa()

		para (numero=1;numero<=10;numero++) {
			resultado = numero*tabuada
			escreva("\n", numero, "x", tabuada, " = ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
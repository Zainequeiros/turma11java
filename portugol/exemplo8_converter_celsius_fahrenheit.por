programa
{

/*		
Cálculo para conversão: F=(9*C+160)/5
Algoritmo para converter graus celsius em fahrenheit	
*/

	
	funcao inicio()
	{
		 real tempCelsius, tempFaren = 0
		 caracter opc = ' '
		 inteiro contador = 0
		 faca {
			 limpa()
			 escreva("Digite a temperatura em graus Celsius :")
			 leia(tempCelsius)
			 tempFaren = (((9*tempCelsius)+160)/5)
			 escreva("A temperatura em graus Fahrenheit é: ", tempFaren,"F")
			 pula()
			 escreva("Continua S-sim ou N-não: ")
			 leia(opc) //variavel de escape - fuga
			 enquanto (opc != 'S' e opc != 's' e opc != 'n' e opc != 'N')
			 {
			 	escreva("Voce não digitou S ou N, tente de novo: ")
			 	leia(opc)	 
			 	contador = contador + 1
			 	contador++
			 	se (contador > 3){
			 		escreva("Por favor, digite S ou N!")
			 		pula()
			 	}
			  }
			 
		 } enquanto ((opc == 'S') ou (opc =='s'))
		 
		 escreva("Fim do Programa - Tenha um ótimo dia!")
	}
	funcao pula(){
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 788; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
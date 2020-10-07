programa
{

//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
//a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	
	funcao inicio()
	{
		inteiro numero = 0, somaNumero = 0, medNumero, totalNumero = 0

		enquanto (numero >= 0){
			escreva("Digite outro número: ")
			leia(numero)

			se(numero>0){
			somaNumero = somaNumero + numero
			totalNumero = totalNumero++
			}
		}
		
		limpa()
		escreva("O total de números lidos é de: ", totalNumero)
		escreva("\nA soma dos números é igual a: ", somaNumero)
		medNumero = somaNumero/totalNumero
		escreva("\nA média dos números é igual de: ", medNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{

/*Escrever um programa que leia uma quantidade desconhecida de números e 
conte quantos deles estão nos seguintes intervalos:
[0-25], [26-50], [51-75] e [76-100].
A entrada de dados deve terminar quando for lido um número negativo.*/
	
	funcao inicio()
	{
		inteiro numero=1, intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0

		enquanto (numero>0) {
			escreva("Digite um número qualquer: ")
			leia(numero)

			se(numero> 0 e numero<=25) {
				intervalo1 = intervalo1++
			}
			senao se(numero>=26 e numero<=50) {
				intervalo2 = intervalo2++
			}
			senao se(numero>=51 e numero<=75) {
				intervalo3 = intervalo3++
			}
			senao se(numero>=76 e numero<=100) {
				intervalo4 = intervalo4++
			}
		}
		escreva("A quantidade de números dentro o intervalo 1 é: ", intervalo1, ".\nA quantidade de números dentro o intervalo 2 é: ", intervalo2, ".\nA quantidade de números dentro o intervalo 3 é: ", intervalo3, ".\nA quantidade de números dentro o intervalo 4 é: ", intervalo4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
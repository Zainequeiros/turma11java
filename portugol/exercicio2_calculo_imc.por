programa
{

/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a
condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso*/
	
	funcao inicio()
	{
		real peso, imc, altura
		
		escreva("Digite o seu peso em kilos(exemplo: 75.5): ")
		leia(peso)
		escreva("Digite a sua altura em metros (exemplo: 1.61): ")
		leia(altura)

		imc=(peso/(altura*altura))
		limpa()

		se (imc<18.5) {
			escreva("Seu imc é: ", imc, "\nVocê está abaixo do peso")	
		}
		senao se (imc>=18.5 e imc<=25) {
			escreva("Seu imc é: ", imc, "\nVocê está com o peso adequado")	
		}
		senao se (imc>25 e imc<=30) {
			escreva("Seu imc é: ", imc, "\nVocê está acima do peso")	
		}
		senao {
			escreva("Seu imc é: ", imc, "\nVocê está no índice de obesidade")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
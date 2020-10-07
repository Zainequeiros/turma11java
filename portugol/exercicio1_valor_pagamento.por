programa
{

/*Elabore um programa que calcule o que deve ser pago por um produto,
 * considerando o preço normal de etiqueta e a escolha da condição de pagamento.
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

	funcao inicio()
	{
		real valorEtiqueta, pagamento, valorFinal

		escreva("Digite o valor do produto: ")
		leia(valorEtiqueta)
		limpa()
		
		escreva("Formas de pagamento aceitas: ", "\nDinheiro ou cheque à vista - 20% de desconto - Digite 1", "\nCartão à vista - 15% de desconto - Digite 2", "\nParcelado em 2 vezes - valor da etiqueta - Digite 3", "\nParcelado em 3 vezes - valor da etiqueta + 10% de juros - Digite 4", "\nDigite a forma de pagamento escolhida: ")
		leia(pagamento)
		limpa()

		se (pagamento == 1) {
			valorFinal = (valorEtiqueta-(valorEtiqueta*0.2))
			escreva("O valor final do produto é: R$", valorFinal)
		}
		senao se (pagamento == 2){
			valorFinal = (valorEtiqueta-(valorEtiqueta*0.15))
			escreva("O valor final do produto é: R$", valorFinal)
		}
		senao se (pagamento == 3) {
			valorFinal = valorEtiqueta
			escreva("O valor final do produto é: R$", valorFinal)
		}
		senao se (pagamento == 4) {
			valorFinal = valorEtiqueta+(valorEtiqueta*0.1))
			escreva("O valor final do produto é: R$", valorFinal)
		}
		senao {
			escreva("Você digitou uma forma de pagamento inválida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
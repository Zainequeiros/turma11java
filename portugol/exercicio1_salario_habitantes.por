programa
{
//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  

	funcao inicio()
	{
		real habitantes, salario, medSalario, maiorSalario = 0, totalSalario = 0, percSalario, cemSalario = 0, filhos, medFilhos, totalFilhos = 0

		para (habitantes = 1; habitantes<=20; habitantes++) {
			escreva("Digite aqui o seu salário: ")
			leia(salario)
			escreva("Digite aqui quantos filhes você tem: ")
			leia(filhos)

			totalSalario = totalSalario + salario
			totalFilhos = totalFilhos + filhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}

			se (salario <= 100) {
				cemSalario = cemSalario + 1
			}
		}

		limpa()

		medSalario = totalSalario/20
		escreva("A média de salário dos habitantes é de R$", medSalario)
		medFilhos = totalFilhos/20
		escreva("\nA média de filhos dos habitantes é de ", medFilhos)
		escreva("\nO valor do maior salário entre os habitantes é de R$", maiorSalario)
		percSalario = ((cemSalario/20)*100)
		escreva("\nO percentual de habitantes com salário de até R$100,00 é de ", percSalario, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
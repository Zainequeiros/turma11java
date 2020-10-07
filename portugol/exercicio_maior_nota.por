programa
{
	
	funcao inicio()
	{
		inteiro maiorNota = 0, nota[4],ordemNotas[4],temp
		cadeia aluno[4]
		
		para(inteiro x = 0; x <= 3; x++){
			escreva("Digite seu nome: ")
			leia(aluno[x])
			escreva("Digite sua nota: ")
			leia(nota[x])
			limpa()
			se(nota[x] > maiorNota){
				maiorNota = nota[x]	
			}
		}

		para(inteiro x = 0; x <= 3; x++){
			
			escreva("\nO nome é: ",aluno[x])
			escreva(", e sua nota foi: ",nota[x])
			
			se(nota[x] == maiorNota){
				escreva("*")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
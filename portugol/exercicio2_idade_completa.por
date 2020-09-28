programa
{
	
	funcao inicio()
	{
		inteiro dias, idadeAnos, idadeMeses, idadeDias

		escreva("Informe sua idade em dias: ")
		leia(dias)

		idadeAnos = (dias/365)
		idadeMeses = ((dias%365)/30)
		idadeDias = ((dias%365)%30)

		escreva("Sua idade é ", idadeAnos, " anos, ", idadeMeses, " meses e ", idadeDias, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
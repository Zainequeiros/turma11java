programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos = 0, idadeMeses = 0, idadeDias = 0, idadeUsuario

		escreva("Informe sua idade em anos: ")
		leia(idadeAnos)
		escreva("Informe sua idade em meses: ")
		leia(idadeMeses)
		escreva("Informe sua idade em dias: ")
		leia(idadeDias)

		idadeUsuario = ((idadeAnos*365) + (idadeMeses*30) + idadeDias)

		escreva("Você tem ", idadeUsuario, "dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
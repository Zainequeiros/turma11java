programa
{
	
	funcao inicio()
	{
		inteiro segundos, duracaoSegundos, duracaoMinutos, duracaoHoras

		escreva("Informe o tempo de duração do seu evento: ")
		leia(segundos)

		duracaoHoras = (segundos/3600)
		duracaoMinutos = ((segundos%3600)/60)
		duracaoSegundos = ((segundos%3600)%60)

		escreva("Otempo de duração do seu evento é ", duracaoHoras, " horas, ", duracaoMinutos, " minutos e ", duracaoSegundos, " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
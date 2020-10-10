package portugol;

import java.util.Scanner;

public class ExemploArrayResultadosTimes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//vari�veis
		String times[] = {"Corinthians", "Palmeiras", "SPFC", "Santos"};
		int pontos[] = {0, 0, 0, 0};
		char resultado; //Ganhou / Perdeu / Empatou
		char opc = 'S'; //S - sim / N - n�o
		int contador = 1;
		
		//momento inicial
		System.out.println("Antes dos jogos");
		for(int x = 0; x < pontos.length; x++) { //(int x = 0; x < 4; x++)
			System.out.printf("\nTime %s - Pontos: %d", times[x], pontos[x]);
		}
		//Uma rodada
		System.out.println("Processo de rodadas");
		while(opc == 'S') {
			System.out.printf("\nRodada n�mero %d", contador);
			for(int x = 0; x < pontos.length; x++) {
				System.out.printf("\nTime %s - Digite G - Ganhou / E - Empatou / P - Perdeu: ", times[x]);
				resultado = leia.next().toUpperCase().charAt(0);
				if (resultado == 'G') {
					pontos[x] = pontos[x]+3;
				} else if (resultado == 'E') {
					pontos[x] = pontos[x]+1;
				}
			}
			//fuga do la�o
			System.out.println("Continua sim ou n�o? ");
			opc = leia.next().toUpperCase().charAt(0);
			contador++;
		}
		//Resultado p�s rodada
		System.out.println("Pontua��o geral p�s rodada");
		for(int x = 0; x < pontos.length; x++) { //(int x = 0; x < 4; x++)
			System.out.printf("\nTime %s - Pontos: %d", times[x], pontos[x]);
		}
		
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

public class Lista4Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero[] = new int [6];
		int pares = 0, impares = 0, somaPares = 0, somaImpares = 0;
		
		for (int x = 0; x<6; x++) {
			System.out.println("Digite um n�mero qualquer: ");
			numero[x] = leia.nextInt();
			
			if (numero[x]%2 == 0) {
				pares = pares + 1;
				somaPares += numero[x];
			} else if (numero[x]%2 != 0) {
				impares = impares + 1;
				somaImpares += numero[x];
			}
		}
		
		System.out.printf("\nForam digitados %d n�meros pares e a soma desses n�meros � %d", pares, somaPares);
		System.out.printf("\nForam digitados %d n�meros �mpares e a soma desses n�meros � %d", impares, somaImpares);
		
		
		leia.close();
	}
}
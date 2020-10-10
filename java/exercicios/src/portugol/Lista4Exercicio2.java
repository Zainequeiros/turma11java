package portugol;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

public class Lista4Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero[] = new int [6];
		int pares = 0, impares = 0, somaPares = 0, somaImpares = 0;
		
		for (int x = 0; x<6; x++) {
			System.out.println("Digite um número qualquer: ");
			numero[x] = leia.nextInt();
			
			if (numero[x]%2 == 0) {
				pares = pares + 1;
				somaPares += numero[x];
			} else if (numero[x]%2 != 0) {
				impares = impares + 1;
				somaImpares += numero[x];
			}
		}
		
		System.out.printf("\nForam digitados %d números pares e a soma desses números é %d", pares, somaPares);
		System.out.printf("\nForam digitados %d números ímpares e a soma desses números é %d", impares, somaImpares);
		
		
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados (DO WHILE)

public class Lista3Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número de 0 a 9: ");
			numero = leia.nextInt();
			if (numero >= 1) {
				soma += numero;
			}
		} while (numero >= 1);
		System.out.println("A soma dos números digitados é: " + soma);
		leia.close();
	}
}
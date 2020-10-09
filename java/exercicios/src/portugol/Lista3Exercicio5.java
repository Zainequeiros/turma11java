package portugol;

import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados (DO WHILE)

public class Lista3Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um n�mero de 0 a 9: ");
			numero = leia.nextInt();
			if (numero >= 1) {
				soma += numero;
			}
		} while (numero >= 1);
		System.out.println("A soma dos n�meros digitados �: " + soma);
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior (if - else if - else)

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num1, num2, num3;

		System.out.print("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = leia.nextInt();
		
		if (num1>=num2 && num1>=num3) {
			System.out.printf("O maior numero �: %d", num1);
		} else if (num2>=num1 && num2>=num3) {
			System.out.printf("O maior numero �: %d", num2);
		} else {
			System.out.printf("O maior numero �: %d", num3);
		}
		
		leia.close();
	}
}
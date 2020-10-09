package portugol;

import java.util.Scanner;

//Definir se o número é par ou ímpar e imprimir (if - else if - else)

public class ExemploParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero>0) {
			if((numero%2) == 0) {
				System.out.println("O número é positivo e par!");
			} else {
				System.out.println("O número é positivo e ímpar!");
			}
		} else if(numero == 0) {
			System.out.print("Você digitou 0!");
		} else {
			System.out.println("Você digitou um número negativo");
		}
		leia.close();
	}
}
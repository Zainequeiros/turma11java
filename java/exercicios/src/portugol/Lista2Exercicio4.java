package portugol;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número qualquer: ");
		numero = leia.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Seu número é: " + numero + ". E a raiz quadrada dele é: " + (Math.sqrt(numero)));
		} else {
			System.out.println("Seu número é: " + numero + ". E este número elevado ao quadrado é: " + (numero*numero));
		}
		leia.close();
	}
}

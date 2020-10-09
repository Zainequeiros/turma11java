package portugol;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número qualquer: ");
		numero = leia.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("O número escolhido é " + numero + " e a raiz quadrada dele é: " + (Math.sqrt(numero)));
		} else {
			System.out.println("O número escolhido é " + numero + " e este número elevado ao quadrado é: " + (numero*numero));
		}
		leia.close();
	}
}
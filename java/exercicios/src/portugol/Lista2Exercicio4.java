package portugol;

import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero qualquer: ");
		numero = leia.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("O n�mero escolhido � " + numero + " e a raiz quadrada dele �: " + (Math.sqrt(numero)));
		} else {
			System.out.println("O n�mero escolhido � " + numero + " e este n�mero elevado ao quadrado �: " + (numero*numero));
		}
		leia.close();
	}
}
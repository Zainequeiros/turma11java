package portugol;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero qualquer: ");
		numero = leia.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Seu n�mero �: " + numero + ". E a raiz quadrada dele �: " + (Math.sqrt(numero)));
		} else {
			System.out.println("Seu n�mero �: " + numero + ". E este n�mero elevado ao quadrado �: " + (numero*numero));
		}
		leia.close();
	}
}

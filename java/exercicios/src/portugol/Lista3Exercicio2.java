package portugol;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par =0, impar=0, num, contador;
		
		for (num=0; num<10; num++) {
			System.out.println("Digite um número qualquer: ");
			contador = leia.nextInt();
			
			if (contador%2 == 0) {
				par++;
			} else {
				impar++;			
			}
		}
		System.out.printf("Vocês digitou %d números pares e %d números ímpares", par, impar);
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par =0, impar=0, num, contador;
		
		for (num=0; num<10; num++) {
			System.out.println("Digite um n�mero qualquer: ");
			contador = leia.nextInt();
			
			if (contador%2 == 0) {
				par++;
			} else {
				impar++;			
			}
		}
		System.out.printf("Voc�s digitou %d n�meros pares e %d n�meros �mpares", par, impar);
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Informar se a pessoa é menor ou maior de idade (do while)

public class ExemploLacoRepeticaoDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Digite a sua idade: ");
		idade = leia.nextInt();
		
		do {
			System.out.printf("\nVocê tem %d anos", idade);
			if(idade>=18) {
				System.out.printf(" e é maior de idade!");
			} else {
				System.out.println(" e é menor de idade!");
			}
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
		} while(idade>=1);
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Informar se a pessoa � menor ou maior de idade (while)

public class ExemploLacoRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1) {
			System.out.printf("Voc� tem %d anos", idade);
			if(idade>=18) {
				System.out.printf(" e � maior de idade!");
			} else {
				System.out.println(" e � menor de idade!");
			}
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
		}
		leia.close();
	}
}
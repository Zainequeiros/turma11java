package portugol;

import java.util.*;

//Verificar se a pessoa � menor ou maior de idade(if - else if - else)

public class ExemploCondicional1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Digite a sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.printf("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome � %s e voc� tem %d anos", nome, idade);
		
		
		if(idade>=18) {
			System.out.printf("\nVoc� � maior de idade!");
		} else if(idade>=1 && idade<18) {
			System.out.printf("\nVoc� e menor de idade!");
		} else {
			System.out.printf("\nVoc� digitou um valor inv�lido!");
		}
		leia.close();
	}
}
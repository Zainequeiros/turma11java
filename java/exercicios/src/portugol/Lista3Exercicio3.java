package portugol;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: 
Total de pessoas com menos de 21 anos
Total de pessoas com mais de 50 anos
O programa termina quando idade for <=99 (WHILE)*/

public class Lista3Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade<=99) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			if (idade<21) {
				menor21++;
			} else if (idade>50){
				maior50++;			
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + menor21);
		System.out.println("O total de pessoas com mais de 50 anos é: " + maior50);
		
		leia.close();
	}
}
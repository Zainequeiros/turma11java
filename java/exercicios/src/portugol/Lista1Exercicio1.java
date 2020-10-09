package portugol;

import java.util.Scanner;

//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int ano , meses , dias, totalDias=0;
		
		System.out.println("Digite a sua idade em anos, meses e dias");
		
		System.out.print("Anos: ");
		ano = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		totalDias = totalDias + (ano*365) + (meses*30);
		
		System.out.println("Você tem " + totalDias + " dias");
		
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias

public class Lista1Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias, idadeEmAnos, idadeEmMeses, idadeEmDias;
		
		System.out.print("Digite sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		idadeEmAnos = (idadeDias / 365);
		idadeEmMeses = ((idadeDias % 365) / 30);
		idadeEmDias = ((idadeDias % 365) % 30);
		
		System.out.println("Você tem " + idadeEmAnos + " anos, " + idadeEmMeses + " meses e " + idadeEmDias + " dias");
		
		leia.close();
	}
}
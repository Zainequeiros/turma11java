package portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		int ano , meses , dias, totalDias=0;
		
		System.out.println("Informe quantos anos, meses e dias de vida você tem");
		
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

package portugol;

import java.util.Scanner;

public class Lista1Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diaAniversario, idadeEmAnos, idadeEmMes, idadeEmDias;
		
		System.out.print("Digite sua idade em dias: ");
		diaAniversario = leia.nextInt();
		
		idadeEmAnos = (diaAniversario / 365);
		idadeEmMes = ((diaAniversario % 365) / 30);
		idadeEmDias = ((diaAniversario % 365) % 30);
		
		System.out.println("Você tem " + idadeEmAnos + " anos, " + idadeEmMes + " meses e " + idadeEmDias + " dias");
		
	}
}
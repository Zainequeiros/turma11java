package portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int tempoDuracao, segundos, minutos,horas;
		
		System.out.print("Escreva o tempo de dura��o do envento na f�brica em segundos: ");
		tempoDuracao = leia.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
		
		leia.close();
	}
}
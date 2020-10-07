package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x1 = 0, x2 = 2, y1 = 0, y2 = 0;
		double d = 0.0;
		
		System.out.print("Digite a posição do primeiro ponto x: ");
		x1 = leia.nextInt();
		System.out.print("Digite a posição do segundo ponto x: ");
		x2 = leia.nextInt();
		System.out.print("Digite a posição do primeiro ponto y: ");
		y1 = leia.nextInt();
		System.out.print("Digite a posição do segundo ponto y: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
		
		System.out.println("A distância entre os 2 pontos é: " + d);

	}

}

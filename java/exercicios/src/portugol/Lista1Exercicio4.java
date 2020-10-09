package portugol;

import java.util.Scanner;

//Escreva  um sistema que leia 3 números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D = ((R+S)/2), onde R = (A+B)² e S = (B+C)²

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r+s)/2;
		
		System.out.println("O valor de D é: "+ d);
		
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de c: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r+s)/2;
		
		System.out.println("O valor de d é: "+ d);
		
		leia.close();
	}

}

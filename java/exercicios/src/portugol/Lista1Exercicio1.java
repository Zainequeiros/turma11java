package portugol;

import java.util.Scanner;

public class Lista1Exercicio1 {

public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int a,b,c,d,e,f;
		double x,y;
		
		System.out.print("Informe o Valor de A: ");
		a = tec.nextInt();		
		System.out.print("Informe o Valor de B: ");
		b = tec.nextInt();
		System.out.print("Informe o Valor de C: ");
		c = tec.nextInt();
		System.out.print("Informe o Valor de D: ");
		d = tec.nextInt();
		System.out.print("Informe o Valor de E: ");
		e = tec.nextInt();
		System.out.print("Informe o Valor de F: ");
		f = tec.nextInt();
		
		x = ( ( (c*e) - (b*f) ) / ( (a*e) - (b*d) ) );
		y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
		System.out.printf("O valor de X é: %.02f",x);
		System.out.println();
		System.out.printf("O valor de Y é: %.02f",y);
		
		tec.close();				
	}	
}
package portugol;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite 3 números quaisquer: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1<=n2 && n1<=n3) {
			if(n2<=n3) {
				System.out.printf("%d, %d, %d", n1, n2, n3);
			} else if(n3<=n2) {
				System.out.printf("%d, %d, %d", n1, n3, n2);
			}
		}
		else if(n2<=n1 && n2<=n3) {
			if(n1<=n3) {
				System.out.printf("%d,%d,%d",n2,n1,n3);
			} else if(n3<=n1) {
				System.out.printf("%d,%d,%d",n2,n3,n1);
			}
		}
		else if(n3<=n1 && n3<=n2) {
			if(n1<=n2) {
				System.out.printf("%d,%d,%d",n3,n1,n2);
			} else if(n2<=n1) {
				System.out.printf("%d,%d,%d",n3,n2,n1);
			}
		}
	leia.close();
	}
}
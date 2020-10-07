package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, notaFinal;
		
		System.out.print("Digite o valor da nota 1: ");
		nota1 = leia.nextDouble();
		System.out.print("Digite o valor da nota 2: ");
		nota2 = leia.nextDouble();
		System.out.print("Digite o valor da nota 3: ");
		nota3 = leia.nextDouble();
		
		nota1 = nota1*2;
		nota2 = nota2*3;
		nota3 = nota3*5;
		
		notaFinal = (nota1+nota2+nota3)/10;
		System.out.println("A média final é: " + notaFinal);

	}

}

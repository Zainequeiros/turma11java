package portugol;

import java.util.Scanner;

//Inverter o valor de 2 variáveis sem utilizar uma terceira variável no processo

public class ExercicioInversao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.printf("Valores antes da inversão a: %d e b: %d",a,b);
		a = a + b;//2+3 = 5
		b = a - b;//5-3 = 2
		a = a - b;//5-2 = 3
		System.out.println();
		System.out.printf("Valores após a inversão a: %d e b: %d",a,b);
		leia.close();
	}
}
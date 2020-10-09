package portugol;

import java.util.Scanner;

//Definir se o n�mero � par ou �mpar e imprimir (if - else if - else)

public class ExemploParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if(numero>0) {
			if((numero%2) == 0) {
				System.out.println("O n�mero � positivo e par!");
			} else {
				System.out.println("O n�mero � positivo e �mpar!");
			}
		} else if(numero == 0) {
			System.out.print("Voc� digitou 0!");
		} else {
			System.out.println("Voc� digitou um n�mero negativo");
		}
		leia.close();
	}
}
package portugol;

import java.util.Scanner;

//Calcular e imprimir tabuada do 1 ao 10 (for)

public class ExercicioTabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, tabuada, resultado;
		
		for (tabuada = 1; tabuada<=10; tabuada++) {
			System.out.println("Tabuada do " + tabuada);
			for (numero = 1; numero<=10; numero++) {
				resultado = numero*tabuada;
				System.out.printf("\n %d X %d = %d",tabuada,numero,resultado);
			}
			System.out.println("\n");
		}
		leia.close();
	}
}
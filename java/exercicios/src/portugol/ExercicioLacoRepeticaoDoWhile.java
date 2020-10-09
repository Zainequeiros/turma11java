package portugol;

import java.util.Scanner;

// Fazer contagem com permissão do usuário (do while)

public class ExercicioLacoRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int contadorNumero = 1;
		char opcao;
		
		do {
			System.out.printf("%d",contadorNumero);
			System.out.println("\nDeseja continuar a contagem? S - Sim ou N - Não");
			opcao = leia.next().toUpperCase().charAt(0);
			contadorNumero = contadorNumero + 1;
		} while(opcao == 'S');
		System.out.println("Fim da contagem!");
		leia.close();
	}
}
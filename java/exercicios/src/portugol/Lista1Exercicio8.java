package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double carroNovo = 0, custoFabrica = 0;
		
		System.out.println("Digite o custo de fábrica do veículo: ");
		custoFabrica = leia.nextDouble();
		
		carroNovo = (custoFabrica+(custoFabrica*0.45)+(custoFabrica*0.28));
		
		System.out.println("O valor do carro novo é: " + carroNovo);

	}

}

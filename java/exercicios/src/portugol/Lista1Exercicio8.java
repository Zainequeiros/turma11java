package portugol;

import java.util.Scanner;

//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double carroNovo = 0, custoFabrica = 0;
		
		System.out.println("Digite o custo de f�brica do ve�culo: ");
		custoFabrica = leia.nextDouble();
		
		carroNovo = (custoFabrica+(custoFabrica*0.45)+(custoFabrica*0.28));
		
		System.out.println("O valor do carro novo �: " + carroNovo);

		leia.close();
	}
}
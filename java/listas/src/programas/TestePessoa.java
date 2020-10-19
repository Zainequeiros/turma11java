package programas;

import java.util.Scanner;

import classes.Fornecedor;

public class TestePessoa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do fornecedor: ");
		String nome = leia.next();
		Fornecedor fornecedor1 = new Fornecedor (nome); //Objeto = Forncedor / nome do objeto = fornecedor1 / Classe = Fornecedor/ Vari�vel = nome
		
		System.out.println("Digite o valor da d�vida: ");
		double valorDivida = leia.nextDouble();
		fornecedor1.setValorDivida(valorDivida);
		
		System.out.println("Digite o valor do cr�dito: ");
		double valorCredito = leia.nextDouble();
		fornecedor1.setValorCredito(valorCredito);
		
		double saldo = fornecedor1.obterSaldo();
		System.out.printf("O saldo � R$ %.2f", saldo);
		
		leia.close();
	}
}
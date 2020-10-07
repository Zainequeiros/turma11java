package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		//criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in); //criou o teclado
		
		String nome;
		int anoNascimento, idade=0;
		double salario;
		
		System.out.println("Escreva o nome do usuário: ");
		nome = tec.next();
		System.out.print("Escreva o ano de nascimento: ");
		anoNascimento = tec.nextInt();
		System.out.print("Escreva o salário: ");
		salario = tec.nextDouble();
		idade = 2020-anoNascimento;
		
		System.out.printf("Oi %s, sua idade é %d anos e seu salário é R$ %.2f",nome,idade,salario);

	}

}

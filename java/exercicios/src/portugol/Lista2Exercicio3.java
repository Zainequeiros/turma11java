package portugol;

import java.util.Scanner;

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Voc� � da categoria infantil");
		} else if (idade>=15 && idade<=17){
			System.out.println("Voc� � da categoria juvenil");
		} else if (idade>=18 && idade<=25) {
			System.out.println("Voc� � da categoria adulta");
		} else {
			System.out.println("Voc� digitou uma idade fora das categorias atuais");
		}
		leia.close();
	}
}
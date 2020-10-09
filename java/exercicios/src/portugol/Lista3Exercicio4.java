package portugol;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
Para tanto, a cada pessoa era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros)
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
o número de pessoas calmas
o número de mulheres nervosas
o número de homens agressivos
o número de outros calmos
o número de pessoas nervosas com mais de 40 anos
o número de pessoas calmas com menos de 18 anos (WHILE)*/

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		
		//instanciando o objeto teclado chamado leia pela classe scanner
		Scanner leia = new Scanner(System.in);
		
		//declarar as variáveis
		int idade, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervososMaior40 = 0, calmasMenor18 = 0, totalF = 0, totalM = 0, totalO = 0;
		final int LIMITE = 25;
		byte sexo; //(1-feminino / 2-masculino / 3-outros)
		byte perfil; //(1-calma / 2-nervosa / 3-agressivo)
		int contador = 1;
		
		System.out.println("Sistema de Pesquisa");
		
		while (contador <= LIMITE) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite seu sexo (1-feminino / 2-masculino / 3-outros): ");
			sexo = leia.nextByte();
			System.out.print("Digite o seu perfil (1-calma / 2-nervosa / 3-agressivo):");
			perfil = leia.nextByte();
			leia.nextLine(); //limpeza de buffer - limpa a "memória" do teclado
			
			if (perfil == 1) {
				pessoasCalmas++;
			} else if (perfil == 2 && sexo == 1) {
				mulheresNervosas++;
			} else if (perfil == 3 && sexo == 2) {
				homensAgressivos++;
			} else if (perfil == 1 && sexo == 3) {
				outrosCalmos++;
			} else if (idade > 40 && perfil == 2) {
				nervososMaior40++;
			} else if (idade < 18 && perfil == 1) {
				calmasMenor18++;
			}
			
			//fuga do loop/laço
			contador++;		
		}
		System.out.printf("\nTotal de pessoas calmas: %d", pessoasCalmas);
		System.out.printf("\nTotal de mulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\nTotal de homens agressivos: %d", homensAgressivos);
		System.out.printf("\nTotal de outros calmos: %d", outrosCalmos);
		System.out.printf("\nTotal de outros calmos: %d", nervososMaior40);
		System.out.printf("\nTotal de outros calmos: %d", calmasMenor18);
		
		leia.close();
	}
}
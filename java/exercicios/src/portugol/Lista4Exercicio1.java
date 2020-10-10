package portugol;

/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class Lista4Exercicio1 {

	public static void main(String[] args) {
		
		int numeros [] = {1, 0, 5, -2, -5, 7};
		int soma = 0;
		
		soma = (numeros[0] + numeros[1] + numeros[5]);
		System.out.println("A soma dos valores das posições [0], [1] e [5] do Vetor A é: " + soma);
		numeros[4] = 100;
		System.out.println("\nValores do Vetor A\n" + numeros[0] + "\n" + numeros[1] + "\n" + numeros[2] + "\n" + numeros[3] + "\n" + numeros[4] + "\n" + numeros[5]);
	}
}
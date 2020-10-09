package portugol;

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class Lista3Exercicio1 {

	public static void main(String[] args) {
		
		int numero;
		
		for(numero = 1000;numero <= 1999;numero++){
			if(numero%11==5) {
				System.out.printf("%d",numero);
				System.out.println();
			}
		}
	}
}
package portugol;

//Imprimir contagem automaticamente, somar e imprimir o resultado total dos valores (for)

public class ExemploLacoRepeticaoFor {

	public static void main(String[] args) {
		
		int x, soma=0;
		
		for(x=1; x<=10; x++) {
			System.out.printf("\n %d",x);
			soma = soma + x;
		}
		System.out.printf("\nSoma total: %d", soma);
	}
}
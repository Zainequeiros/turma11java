package portugol;

//Contador automático do 1 ao 1000 (for)

public class ExercicioLacosRepeticaoFor {

	public static void main(String[] args) {
		
		int contadorNumero = 0;
		
		for(contadorNumero = 1;contadorNumero <= 1000;contadorNumero++){
			System.out.printf("%d",contadorNumero);
			System.out.println();
		}
	}
}
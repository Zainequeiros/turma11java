package portugol;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
int valorUsuario;
		
		
		System.out.print("Informe um valor: ");
		valorUsuario = leia.nextInt();
		
		if(valorUsuario>0) {
			
			if((valorUsuario%2) == 0) {
				
				System.out.println("O valor � positivo e par!");
			}else {
				
				System.out.println("O valor � positivo e impar!");
			}
				
		}else if(valorUsuario == 0){
			
			System.out.print("Voc� digitou 0!");
			
		}else {
			
			System.out.println("Voc� digitou um n�mero negativo");
		}
		leia.close();
	}
}
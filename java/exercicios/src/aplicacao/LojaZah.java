package aplicacao;

import java.util.Scanner;
import entidades.Pessoa;

public class LojaZah {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //instanciando o objeto Scanner
		//INSTANCIAR
				Pessoa cliente1 = new Pessoa("Juliana", 'F', 1991);
				Pessoa cliente2 = new Pessoa("Jonhatan", 'M');
				Pessoa cliente3 = new Pessoa("Zaine", 'F' , 1991);
				
				System.out.println("Digite o nome do usuario: ");
				cliente1.nome = leia.next();
				System.out.println(cliente1.nome);
				System.out.println(cliente3.nome);
				System.out.println(cliente1.idade()+" "+ cliente1.nome +" "+ cliente1.sexo);
				
				leia.close();
	}			
}
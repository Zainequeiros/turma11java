package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import classes.Aluno;
import classes.AlunoEspecial;

public class CadAluno {
	
	public static void main(String[] args) {
		//int qtd=0;
		String nome;
		int anoNascimento, matricula;
		char sexo;
		char opc;
		
		//Aluno aluno1 = new Aluno("PEDRO", 2002, 'M', 1); // REFERENCIA
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Aluno> lista = new ArrayList<>(); //como monta a lista
		
		System.out.print("Digite o numero de alunos a serem cadastrados: ");
		int qtd = leia.nextInt();
		for (int x=1; x<=qtd ; x++)
		{
			System.out.println("Digite o nome: ");
			nome = leia.next();
			System.out.println("Digite o ano de nascimento :");
			anoNascimento = leia.nextInt();
			System.out.println("Digite o sexo M/F: ");
			sexo = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite a matricula");
			matricula = leia.nextInt();
			System.out.println("Digite a nota final: ");
			double notaFinal = leia.nextDouble();
			
			System.out.println("Aluno especial S/N:?");
			opc = leia.next().toUpperCase().charAt(0);
			if (opc == 'S') {
				System.out.println("Digite o valor do acrescimo[1-5]: ");
				int acrescimo = leia.nextInt();
				lista.add(new AlunoEspecial(nome, anoNascimento, sexo, matricula, notaFinal, acrescimo));
			} else if (opc == 'N') {
				lista.add(new Aluno(nome, anoNascimento, sexo, matricula, notaFinal));
			}		
		}
		System.out.println("LISTA DE ALUNOS");
		
		/*for (Aluno dado : lista) {
			System.out.println(dado.getNome() + " "+dado.mencao()+" NOTA AJUSTADA: "+dado.ajusteNota());
		}*/
		
		for (Aluno tigas : lista) {
			System.out.println(tigas.getNome());
		}
		
		leia.close();
	}
}
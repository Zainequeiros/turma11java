package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Cd;
import classes.Dvd;
import classes.Livros;
import classes.Produtos;

public class Zahraiva {
	
	public static void limpaTela() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int x = 0; x < 50; x++) System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String titulo = "", genero= "", autor = "", tipo = "", artista = "";
		double valor = 0;
		char opcInicial, opcTipoProd, tipoDvd, opcCatalogo;
		
		System.out.print("   _   _   _   _   _   _   _   _  \r\n"
				+ "");
		System.out.print("  / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ \r\n"
				+ "");
		System.out.print(" ( Z ( A ( H ( R ( A ( I ( V ( A )\r\n"
				+ "");
		System.out.print("  \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ");
		System.out.println("\n\nBem vinde ao Sistema!");

		limpaTela();
		
		List<Produtos> lista = new ArrayList<>();
		
			System.out.println("O que deseja fazer? \n1 - Cadastrar novo produto \n2 - Exibir catálogo ");
			opcInicial = leia.next().charAt(0);
		
			limpaTela();
		
			if(opcInicial == '1') {
				System.out.println("Qual item você quer cadastrar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcTipoProd = leia.next().charAt(0);
				if(opcTipoProd == '1') {
					System.out.println("Digite o nome do CD: ");
					titulo = leia.next();
					System.out.println("Digite o gênero do CD: ");
					genero = leia.next();
					System.out.println("Digite o valor do CD: ");
					valor = leia.nextDouble();
					System.out.println("Digite o artista do CD: ");
					artista = leia.next();
					lista.add(new Cd(titulo, genero, valor, artista));
				} else if(opcTipoProd == '2') {
					System.out.println("Digite o nome do DVD: ");
					titulo = leia.next();
					System.out.println("Digite o gênero do DVD: ");
					genero = leia.next();
					System.out.println("Digite o valor do DVD: ");
					valor = leia.nextDouble();
					System.out.println("Digite o tipo do DVD \n1 - Filme \n2 - Série \n3 - Show ");
					tipoDvd = leia.next().charAt(0);
					if(tipoDvd == '1') {
						tipo = "Filme";
					} else if (tipoDvd == '2') {
						tipo = "Série";
					} else if (tipoDvd == '3') {
						tipo = "Show";
					} else {
						System.out.println("Você digitou uma opção inválida");
					}
					lista.add(new Dvd(titulo, genero, valor, tipo));
				} else if(opcTipoProd == '3') {
					System.out.println("Digite o nome do Livro: ");
					titulo = leia.next();
					System.out.println("Digite o gênero do Livro: ");
					genero = leia.next();
					System.out.println("Digite o valor do Livro: ");
					valor = leia.nextDouble();
					System.out.println("Digite o autor do Livro: ");
					autor = leia.next();
					lista.add(new Livros(titulo, genero, valor, autor));
				} else {
					System.out.println("Você digitou uma opção inválida: ");
				}
				System.out.println("Deseja cadastrar um novo produto? \n1 - Sim \n2 - Não");
				
			} else if (opcInicial == '2') {
				System.out.println("O catálogo de qual produto você quer consultar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcCatalogo = leia.next().charAt(0);
				if(opcCatalogo == '1') {
					Cd catalogoCd = new Cd(titulo, genero, valor, artista);
					catalogoCd.catalProd();
				} else if(opcCatalogo == '2') {
					Dvd catalogoDvd = new Dvd(titulo, genero, valor, tipo);
					catalogoDvd.catalProd();
				}
			}
			
		leia.close();
	}
}
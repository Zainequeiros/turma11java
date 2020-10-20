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
		char opcInicial, opcTipoProd, tipoDvd, opcCatalogo, opcCadastro, opcConsulta;
		
		System.out.print("   _   _   _   _   _   _   _   _  \r\n"
				+ "");
		System.out.print("  / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ \r\n"
				+ "");
		System.out.print(" ( Z ( A ( H ( R ( A ( I ( V ( A )\r\n"
				+ "");
		System.out.print("  \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ");
		System.out.println("\n\nBem vinde ao Sistema!");

		limpaTela();
		
		List<Cd> listaCd = new ArrayList<>();
		List<Dvd> listaDvd = new ArrayList<>();
		List<Livros> listaLivros = new ArrayList<>();
		
			System.out.println("O que deseja fazer? \n1 - Cadastrar novo produto \n2 - Exibir cat�logo ");
			opcInicial = leia.next().charAt(0);
		
			limpaTela();
		
			if(opcInicial == '1') {
				System.out.println("Qual item voc� quer cadastrar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcTipoProd = leia.next().charAt(0);
				if(opcTipoProd == '1') {
					System.out.println("Digite o nome do CD: ");
					titulo = leia.next();
					System.out.println("Digite o g�nero do CD: ");
					genero = leia.next();
					System.out.println("Digite o valor do CD: ");
					valor = leia.nextDouble();
					System.out.println("Digite o artista do CD: ");
					artista = leia.next();
					listaCd.add(new Cd(titulo, genero, valor, artista));
				} else if(opcTipoProd == '2') {
					System.out.println("Digite o nome do DVD: ");
					titulo = leia.next();
					System.out.println("Digite o g�nero do DVD: ");
					genero = leia.next();
					System.out.println("Digite o valor do DVD: ");
					valor = leia.nextDouble();
					System.out.println("Digite o tipo do DVD \n1 - Filme \n2 - S�rie \n3 - Show ");
					tipoDvd = leia.next().charAt(0);
					if(tipoDvd == '1') {
						tipo = "Filme";
					} else if (tipoDvd == '2') {
						tipo = "S�rie";
					} else if (tipoDvd == '3') {
						tipo = "Show";
					} else {
						System.out.println("Voc� digitou uma op��o inv�lida");
					}
					listaDvd.add(new Dvd(titulo, genero, valor, tipo));
				} else if(opcTipoProd == '3') {
					System.out.println("Digite o nome do Livro: ");
					titulo = leia.next();
					System.out.println("Digite o g�nero do Livro: ");
					genero = leia.next();
					System.out.println("Digite o valor do Livro: ");
					valor = leia.nextDouble();
					System.out.println("Digite o autor do Livro: ");
					autor = leia.next();
					listaLivros.add(new Livros(titulo, genero, valor, autor));
				} else {
					System.out.println("Voc� digitou uma op��o inv�lida");
				}
				System.out.println("Deseja cadastrar um novo produto? \n1 - Sim \n2 - N�o ");
				opcCadastro = leia.next().charAt(0);
				if(opcCadastro == '1') {
					
				} else if (opcCadastro == '2') {
					System.out.println("Obrigade :)");
				} else {
					System.out.println("Voc� digitou uma op��o inv�lida");
				}
			}
			
			else if (opcInicial == '2') {
				System.out.println("O cat�logo de qual produto voc� quer consultar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcCatalogo = leia.next().charAt(0);
				if(opcCatalogo == '1') {
					Cd catalogoCd = new Cd(titulo, genero, valor, artista);
					catalogoCd.catalCd(listaCd);
				} else if(opcCatalogo == '2') {
					Dvd catalogoDvd = new Dvd(titulo, genero, valor, tipo);
					catalogoDvd.catalDvd(listaDvd);
				} else if(opcCatalogo == '2') {
					Livros catalogoLivros = new Livros(titulo, genero, valor, autor);
					catalogoLivros.catalLivro(listaLivros);
				} else {
					System.out.println("Voc� digitou uma op��o inv�lida");
				}
				System.out.println("DEseja consultar outro cat�logo? \n1 - Sim \n2 - N�o ");
				opcConsulta = leia.next().charAt(0);
				if(opcConsulta == '1') {
					
				} else if (opcConsulta == '2') {
					System.out.println("Obrigade :)");
				} else {
					System.out.println("Voc� digitou uma op��o inv�lida");
				}
			}
			
		leia.close();
	}
}
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
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int x = 0; x < 50; x++) System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String titulo = "", genero= "", autor = "", tipo = "", artista = "";
		double valor = 0;
		char opcInicial = 0, opcTipoProd, tipoDvd, opcCatalogo, opcCadastro, opcConsulta;
		boolean volta = false;
		
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
		
		listaCd.add(new Cd("Vesúvio", "MPB", 12.00, "Djavan"));
		listaCd.add(new Cd("Farewell Song", "Rock", 14.00, "Janis Joplin"));
		listaCd.add(new Cd("Ao Vivo na Ilha da Magia", "Pagode", 16.00, "Exaltasamba"));
		listaDvd.add(new Dvd("Turnê 7 Vidas", "Musical", 18.00, "Show"));
		listaDvd.add(new Dvd("Box House MD", "Drama", 189.99, "Série"));
		listaDvd.add(new Dvd("Na Natureza Selvagem", "Aventura", 25.00, "Filme"));
		listaLivros.add(new Livros("Dexter", "Suspense", 49.90, "Jeff Lindsay"));
		listaLivros.add(new Livros("Os Sete", "Terror", 50.90, "André Vianco"));
		listaLivros.add(new Livros("Deadpool Dog Park", "Ficção", 37.00, "Stefan Petrucha"));
		
		do {
			if(!volta) {
				System.out.println("O que deseja fazer? \n1 - Cadastrar novo produto \n2 - Exibir catálogo \n3 - Sair do Sistema");
				opcInicial = leia.next().charAt(0);
			}
				
			limpaTela();
			
			if(opcInicial == '1') {
				System.out.println("Qual item você quer cadastrar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcTipoProd = leia.next().charAt(0);
				
				limpaTela();
				
				if(opcTipoProd == '1') {
					System.out.println("Digite o nome do CD: ");
					titulo = leia.next();
					System.out.println("Digite o gênero do CD: ");
					genero = leia.next();
					System.out.println("Digite o valor do CD: ");
					valor = leia.nextDouble();
					System.out.println("Digite o artista do CD: ");
					artista = leia.next();
					listaCd.add(new Cd(titulo, genero, valor, artista));
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
					listaDvd.add(new Dvd(titulo, genero, valor, tipo));
				} else if(opcTipoProd == '3') {
					System.out.println("Digite o nome do Livro: ");
					titulo = leia.next();
					System.out.println("Digite o gênero do Livro: ");
					genero = leia.next();
					System.out.println("Digite o valor do Livro: ");
					valor = leia.nextDouble();
					System.out.println("Digite o autor do Livro: ");
					autor = leia.next();
					listaLivros.add(new Livros(titulo, genero, valor, autor));
				} else {
					System.out.println("Você digitou uma opção inválida");
				}
				
				limpaTela();
				
				System.out.println("Deseja cadastrar um novo produto? \n1 - Sim \n2 - Não ");
				opcCadastro = leia.next().charAt(0);
				if(opcCadastro == '1') {
					volta = true;
				} else if (opcCadastro == '2') {
					System.out.println("\nObrigade :)");
					volta = false;
				} else {
					System.out.println("Você digitou uma opção inválida");
					volta = false;
				}
				
				limpaTela();
			}
			
			else if (opcInicial == '2') {
				System.out.println("O catálogo de qual produto você quer consultar? \n1 - CD \n2 - DVD \n3 - Livro ");
				opcCatalogo = leia.next().charAt(0);
				
				limpaTela();
				
				if(opcCatalogo == '1') {
					Cd catalogoCd = new Cd(titulo, genero, valor, artista);
					catalogoCd.catalCd(listaCd);
				} else if(opcCatalogo == '2') {
					Dvd catalogoDvd = new Dvd(titulo, genero, valor, tipo);
					catalogoDvd.catalDvd(listaDvd);
				} else if(opcCatalogo == '3') {
					Livros catalogoLivros = new Livros(titulo, genero, valor, autor);
					catalogoLivros.catalLivro(listaLivros);
				} else {
					System.out.println("Você digitou uma opção inválida");
				}
				
				System.out.println("\n\nDeseja consultar outro catálogo? \n1 - Sim \n2 - Não ");
				opcConsulta = leia.next().charAt(0);
				if(opcConsulta == '1') {
					volta = true;
				} else if (opcConsulta == '2') {
					System.out.println("\nObrigade :)");
					volta = false;
				} else {
					System.out.println("Você digitou uma opção inválida");
					volta = false;
				}
				
				limpaTela();
				
			}
			else if(opcInicial == '3') {
				System.out.println("\nObrigade :)");
				break;
			} else {
				System.out.println("Você digitou uma opção inválida");
				volta = false;
			}
		} while(true);
	}
}
package classes;

import java.util.List;

public class Cd extends Produtos {
	
	//atributos
	private String artista;

	//construtor
	public Cd(String titulo, String artista) {
		super(titulo);
		this.artista = artista;
	}
	
	//sobrecarga
	public Cd(String titulo, String genero, double valor, String artista) {
		super(titulo, genero, valor);
		this.artista = artista;
	}

	//seletores
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	//método
	public void catalCd (List<Cd> lista) {
		for (Cd catalogo : lista) {
			System.out.println("[ Título: " + catalogo.getTitulo() + " ] [ Gênero: " + catalogo.getGenero() + " ] [ Valor: R$" + catalogo.getValor() + " ] [ Artista: " + catalogo.getArtista() + " ]");
		}
	}
}
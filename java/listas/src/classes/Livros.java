package classes;

import java.util.List;

public class Livros extends Produtos {
	
	//atributos
	private String autor;
		
	//construtor
	public Livros(String titulo, String autor) {
		super(titulo);
		this.autor = autor;
	}
	
	//sobrecarga
		public Livros(String titulo, String genero, double valor, String autor) {
			super(titulo, genero, valor);
			this.autor = autor;
		}

	//seletores
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//método
	public void catalLivro (List<Livros> lista) {
		for (Livros catalogo : lista) {
			System.out.println(catalogo.getTitulo() + catalogo.getGenero() + catalogo.getValor() + catalogo.getAutor());
		}
	}
}
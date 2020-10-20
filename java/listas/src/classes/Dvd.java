package classes;

import java.util.List;

public class Dvd extends Produtos {
	
	//atributos
	private String tipo; //filme, série, show
	
	//construtor
	public Dvd(String titulo, String tipo) {
		super(titulo);
		this.tipo = tipo;
	}
	
	//sobrecarga
		public Dvd(String titulo, String genero, double valor, String tipo) {
			super(titulo, genero, valor);
			this.tipo = tipo;
		}

	//seletores
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//método
	public void catalDvd (List<Dvd> lista) {
		for (Dvd catalogo : lista) {
			System.out.println("[ Título: " + catalogo.getTitulo() + " ] [ Gênero: " + catalogo.getGenero() + " ] [ Valor: R$" + catalogo.getValor() + " ] [ Artista: " + catalogo.getTitulo() + " ]");
		}
	}
}
package classes;

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
	@Override
	public void catalProd () {
		for (Livros catalogo : lista) {
			System.out.println(super.getTitulo() + super.getGenero() + super.getValor() + catalogo.getAutor());
		}
	}
}
package classes;

public abstract class Produtos {
	
	//atributos
	private String titulo, genero;
	private double valor;
	
	//construtor
	public Produtos(String titulo) {
		super();
		this.titulo = titulo;
	}

	//sobrecarga
	public Produtos(String titulo, String genero, double valor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.valor = valor;
	}

	//seletores
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//método
	public abstract void catalProd ();
}
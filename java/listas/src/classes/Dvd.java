package classes;

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
	@Override
	public void catalProd () {
		for (Dvd catalogo : lista) {
			System.out.println(super.getTitulo() + super.getGenero() + super.getValor() + catalogo.getTipo());
		}
	}
}
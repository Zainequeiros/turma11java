package classes;

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
	@Override
	public void catalProd () {
		for (Cd catalogo : lista) {
			System.out.println(super.getTitulo() + super.getGenero() + super.getValor() + catalogo.getArtista());
		}
	}
}
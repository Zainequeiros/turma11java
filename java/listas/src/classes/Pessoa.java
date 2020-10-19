package classes;

public class Pessoa {
	
	//atributos
	private String nome, enderešo, telefone;
	
	//construtor
	public Pessoa (String nome) {
		this.nome = nome;
	}

	//sobrecarga
	public Pessoa(String nome, String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}

	public Pessoa(String nome, String enderešo, String telefone) {
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}
	
	//seletores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
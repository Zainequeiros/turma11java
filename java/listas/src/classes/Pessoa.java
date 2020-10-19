package classes;

public class Pessoa {
	
	//atributos
	private String nome, endere�o, telefone;
	
	//construtor
	public Pessoa (String nome) {
		this.nome = nome;
	}

	//sobrecarga
	public Pessoa(String nome, String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
	}

	public Pessoa(String nome, String endere�o, String telefone) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	//seletores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
package classes;

public class Pessoa {
	
	//atributos
	private String nome, endereço, telefone;
	
	//construtor
	public Pessoa (String nome) {
		this.nome = nome;
	}

	//sobrecarga
	public Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
	}

	public Pessoa(String nome, String endereço, String telefone) {
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	//seletores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
package classes;

public class Animal {
	
	//atributos
	private String nome;
	private int idade;
	
	//construtor
	public Animal (String nome) {
		this.nome = nome;
	}
	
	//sobrecarga
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//método
	public void emiteSom () {
		System.out.println();
	}
	
	public String acaoAnimal () {
		return "";
	}

	//seletores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
package classes;

public class Pessoa {
	
	//atributos
	private String nome;
	private int anoNascimento;
	private char sexo;
	
	//construtor
	public Pessoa (String nome) {
		this.nome = nome;
	}

	//sobrecarga
	public Pessoa(String nome, int anoNascimento, char sexo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
	}

	//seletores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}	
}
package entidades;

public class Pessoa {
	//ATRIBUTOS
		public String nome;
		public char sexo;
		public int anoNascimento;
		public char tipo;
		
		//CONSTRUTOR (mesmo nome da classe)
		public Pessoa(String nome) {
			this.nome = nome;
			
		}
		
		//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
		public Pessoa(String nome, char sexo) {
			this.nome = nome;
			this.sexo = sexo;
			
		}
		
		//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
		public Pessoa(String nome, char sexo , int anoNascimento) {
			this.nome = nome;
			this.sexo = sexo;
			this.anoNascimento = anoNascimento;
			
		}
		//METODO (só usa dentro da classe)
		public int idade () {
			return 2020 - anoNascimento;
		}
	}
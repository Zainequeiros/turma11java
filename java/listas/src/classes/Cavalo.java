package classes;

public class Cavalo extends Animal {
	
	//construtor
		public Cavalo(String nome, int idade) {
			super (nome, idade);
		}

	@Override
	//metodos
	public void emiteSom () {
		System.out.println("Hiin in in");
	}
	
	public String acaoAnimal () {
		return "O cavalo corre";
	}
	
	//seletores
		public String getNome() {
			return super.getNome();
		}
		public void setNome(String nome) {
			super.setNome(nome);
		}

		public int getIdade() {
			return super.getIdade();
		}

		public void setIdade(int idade) {
			super.setIdade(idade);;
		}
}
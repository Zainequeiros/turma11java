package classes;

public class Preguica extends Animal {
	
	//construtor
		public Preguica (String nome, int idade) {
			super (nome, idade);
		}
	
	@Override
	//metodos
	public void emiteSom () {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	public String acaoAnimal () {
		return "A pregui�a sobe em �rvores";
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
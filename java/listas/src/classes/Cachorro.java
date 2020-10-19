package classes;

public class Cachorro extends Animal {
	
	//construtor
	public Cachorro(String nome, int idade) {
		super (nome, idade);
	}
	
	//método
	@Override
	public void emiteSom () {
		System.out.println("au, au");
	}
	
	public String acaoAnimal () {
		return "O cachorro corre";
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
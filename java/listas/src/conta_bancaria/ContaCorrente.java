package conta_bancaria;

public class ContaCorrente extends ContaBancaria{
	
	//ATRIBUTO
	private int talonario;		
		
	//CONSTRUTOR
	public ContaCorrente(int numero, double saldo, int talonario) {
		super(numero, saldo);
		this.talonario = talonario;
	}
	
	//MÉTODO
	public int emiteTalonario() {
		talonario = talonario++;
		return talonario;
	}
}
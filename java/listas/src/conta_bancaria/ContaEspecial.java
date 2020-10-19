package conta_bancaria;

public class ContaEspecial extends ContaCorrente {
	
	//ATRIBUTOS
	private double limite ;
		
	//CONSTRUTOR
	public ContaEspecial(int numero, double saldo, int talonario, double limite) {
		super(numero, saldo, talonario);
		this.limite = limite;
	}
				
	//M�TODO
	public double calculaJuros() {
		super.credite(super.getSaldo()*0.02);
		return super.getSaldo();
	}
}
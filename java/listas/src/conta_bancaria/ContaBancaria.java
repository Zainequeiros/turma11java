package conta_bancaria;

public class ContaBancaria {
	
	//ATRIBUTOS
	private int numero;
	private double saldo;
		
	//CONSTRUTOR
	public ContaBancaria (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
			
	//ENCAPSULAMENTO
	public int getNumero() {
		return numero;
	}
		
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
		
	//MÉTODOS
	public void emiteSaldo () {
		System.out.println("Seu Saldo é: ");
	}
		
	public double credite (double credito) {
		saldo = saldo + credito;
		return this.saldo;
	}
		
	public double debite (double debito) {
		saldo = saldo - debito;
		return this.saldo;
	}
}
package classes;

public class Fornecedor extends Pessoa {

	//atributos
	private double valorCredito, valorDivida;
	
	//construtores
	public Fornecedor(String nome) {
		super(nome);
	}
	
	//sobrecarga
	public Fornecedor(String nome, String endere�o, String telefone) {
		super(nome, endere�o, telefone);
	}

	public Fornecedor(String nome, String endere�o) {
		super(nome, endere�o);
	}

	//seletores
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//m�todos
	public double obterSaldo () {
		return (this.valorCredito - this.valorDivida);
	}
}
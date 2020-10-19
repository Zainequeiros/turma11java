package classes;

public class Fornecedor extends Pessoa {

	//atributos
	private double valorCredito, valorDivida;
	
	//construtores
	public Fornecedor(String nome) {
		super(nome);
	}
	
	//sobrecarga
	public Fornecedor(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
	}

	public Fornecedor(String nome, String endereço) {
		super(nome, endereço);
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
	
	//métodos
	public double obterSaldo () {
		return (this.valorCredito - this.valorDivida);
	}
}
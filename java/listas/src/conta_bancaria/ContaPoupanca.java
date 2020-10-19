package conta_bancaria;

public class ContaPoupanca extends ContaBancaria {
	
	//ATRIBUTOS
	private double juros;
	private double correcaoMone = 0.01;
	private int mesAniver ;
			
	//CONSTRUTOR
	public ContaPoupanca(int numero, double saldo, double juros, double correcaoMone, int mesAniver) {
		super(numero, saldo);
		this.juros = juros;
		this.correcaoMone = correcaoMone;
		this.mesAniver = mesAniver;
	}
		
	//MÉTODO
	public double jurosPoupanca () {
		return super.credite (super.getSaldo()*0.01);
	}
				
	public double aniversarioMes () {
		int mes = 0;
		if(mesAniver == mes) {
		super.credite( super.getSaldo() * correcaoMone);
	}
	return super.getSaldo();
	}
}
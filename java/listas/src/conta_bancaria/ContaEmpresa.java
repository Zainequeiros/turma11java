package conta_bancaria;

public class ContaEmpresa extends ContaBancaria{
	
	//ATRIBUTOS
	private double limiteEmpresa;
	private double limiteUsado;
		
	//CONSTRUTOR
	public ContaEmpresa(int numero, double saldo, double limiteEmpresa, double limiteUsado) {
		super(numero, saldo);
		this.limiteEmpresa = limiteEmpresa;
		this.limiteUsado = limiteUsado;
	}
		
	//MÉTODO
	public double emprestimoEmpresarial() {
		if(limiteUsado/limiteEmpresa <= 0.5) {
			super.credite(limiteEmpresa*2);
		} else {
			System.out.println("Empréstimo Negado!!");
		}
		return super.getSaldo();
	}
}
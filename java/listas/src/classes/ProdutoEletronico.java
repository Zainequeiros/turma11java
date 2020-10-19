package classes;

public class ProdutoEletronico {
	
	//atributos
	
	public String marca_produto;
	public String tipo_produto;
	public String cor;
	public double consumo_energia;
	
	//construtor
	
	public ProdutoEletronico (String marca_produto) {
		this.marca_produto = marca_produto;
	}

	//sobrecarga
	public ProdutoEletronico(String marca_produto, String tipo_produto) {
		this.marca_produto = marca_produto;
		this.tipo_produto = tipo_produto;
	}

	public ProdutoEletronico(String marca_produto, String tipo_produto, String cor) {
		this.marca_produto = marca_produto;
		this.tipo_produto = tipo_produto;
		this.cor = cor;
	}

	public ProdutoEletronico(String marca_produto, String tipo_produto, String cor, double consumo_energia) {
		this.marca_produto = marca_produto;
		this.tipo_produto = tipo_produto;
		this.cor = cor;
		this.consumo_energia = consumo_energia;
	}
	
	//método
	public void ligar () {
		System.out.println("Ligando" + this.tipo_produto);
	}
}
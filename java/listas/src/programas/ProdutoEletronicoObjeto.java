package programas;

import classes.ProdutoEletronico;

public class ProdutoEletronicoObjeto {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico ("Sony");
		ProdutoEletronico produto2 = new ProdutoEletronico ("Motorola", "celular");
		ProdutoEletronico produto3 = new ProdutoEletronico ("Samsung", "dvd", "preto");
		ProdutoEletronico produto4 = new ProdutoEletronico ("Philco", "rádio", "branco", 127.2);
		
		System.out.printf("A marca do seu produto é %s", produto1.marca_produto);
		System.out.printf("\nA marca do seu produto é %s e ele é um %s", produto2.marca_produto, produto2.tipo_produto);
		System.out.printf("\nA marca do seu produto é %s, ele é um %s e a cor dele é %s", produto3.marca_produto, produto3.tipo_produto, produto3.cor);
		System.out.printf("\nA marca do seu produto é %s, ele é um %s, a cor dele é %s e o consumo dele é %.1fw", produto4.marca_produto, produto4.tipo_produto, produto4.cor, produto4.consumo_energia);
		
	}
}
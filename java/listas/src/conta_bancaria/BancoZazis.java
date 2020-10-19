package conta_bancaria;

import java.util.Scanner;
import conta_bancaria.ContaBancaria;

//tela 1 - ações com usuário (abrir conta)
//tela 2 - escolher tipo de conta (4 opções)
//tela 3 - acessar opc conta (deb, cred, sald, emprest, cheque)
//tela 4 - finalização


public class BancoZazis {
	
	public static void limpaTela() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int x = 0; x < 50; x++) System.out.println();
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nomeCliente, senhaCliente;
		int cpfCliente, cnpjCliente, numeroConta;
		char opcaoInicial;
		
		//mensagem inicial
		System.out.print(" /$$$$$$$ /$$$$$$$$/$$      /$$       /$$    /$$/$$$$$$/$$   /$$/$$$$$$$ /$$$$$$$$        /$$$$$$  /$$$$$$        /$$$$$$$$ /$$$$$$ /$$$$$$$$/$$$$$$ /$$$$$$ \r\n"
				+ "");
		System.out.print("| $$__  $| $$_____| $$$    /$$$      | $$   | $|_  $$_| $$$ | $| $$__  $| $$_____/       /$$__  $$/$$__  $$      |_____ $$ /$$__  $|_____ $$|_  $$_//$$__  $$\r\n"
				+ "");
		System.out.print("| $$  \\ $| $$     | $$$$  /$$$$      | $$   | $$ | $$ | $$$$| $| $$  \\ $| $$            | $$  \\ $| $$  \\ $$           /$$/| $$  \\ $$    /$$/  | $$ | $$  \\__/\r\n"
				+ "");
		System.out.print("| $$$$$$$| $$$$$  | $$ $$/$$ $$      |  $$ / $$/ | $$ | $$ $$ $| $$  | $| $$$$$         | $$$$$$$| $$  | $$          /$$/ | $$$$$$$$   /$$/   | $$ |  $$$$$$ \r\n"
				+ "");
		System.out.print("| $$__  $| $$__/  | $$  $$$| $$       \\  $$ $$/  | $$ | $$  $$$| $$  | $| $$__/         | $$__  $| $$  | $$         /$$/  | $$__  $$  /$$/    | $$  \\____  $$\r\n"
				+ "");
		System.out.print("| $$  \\ $| $$     | $$\\  $ | $$        \\  $$$/   | $$ | $$\\  $$| $$  | $| $$            | $$  | $| $$  | $$        /$$/   | $$  | $$ /$$/     | $$  /$$  \\ $$\r\n"
				+ "");
		System.out.print("| $$$$$$$| $$$$$$$| $$ \\/  | $$         \\  $/   /$$$$$| $$ \\  $| $$$$$$$| $$$$$$$$      | $$  | $|  $$$$$$/       /$$$$$$$| $$  | $$/$$$$$$$$/$$$$$|  $$$$$$/\r\n"
				+ "");
		System.out.print("|_______/|________|__/     |__/          \\_/   |______|__/  \\__|_______/|________/      |__/  |__/\\______/       |________|__/  |__|________|______/\\______/ \r\n"
				+ "");
		
		limpaTela();
		
		//tela inicial
		System.out.println("Você já é nosso cliente?\n");
		System.out.println("1 - Sim ");
		System.out.println("2 - Não ");
		opcaoInicial = leia.next().charAt(0);
		
		limpaTela();
		
		if (opcaoInicial == 1) {
			System.out.println("Digite seu nome: ");
			System.out.println("Digite sua senha: ");
		} else if (opcaoInicial == 2) {
			System.out.println("Venha para o Zazis! \nFaça seu cadastro com a gente!");
			System.out.println("Digite seu nome: ");
			System.out.println("Digite seu CPF - Para pessoa física / DEgite seu CNPJ - Para pessoa jurídica");
			System.out.println("Digite sua senha: ");
		}
		
		leia.close();
	}
}
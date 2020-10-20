package conta_bancaria;

import java.util.Scanner;
import conta_bancaria.ContaBancaria;

public class BancoZazis {
	
	public static String senha;
	public static int numero;
	public static char conta;
	
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
		System.out.println("Digite o número da sua conta: ");
		numero = leia.nextInt();
		System.out.println("Digite sua senha: ");
		senha = leia.next();
		System.out.println("Digite o tipo da sua conta \n1 - Conta Poupança \n2 - Conta Corrente \n3 - Conta Especial \n4 - Conta Empresa");
		conta = leia.next().charAt(0);
		
		limpaTela();
			
		if (conta == '1') {
			
		}
		
		leia.close();
	}
}
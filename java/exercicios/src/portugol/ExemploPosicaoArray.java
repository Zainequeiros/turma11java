package portugol;

public class ExemploPosicaoArray {

	public static void main(String[] args) {
		
		//variaveis
		String times[] = {"Corinthians", "Palmeiras", "SPFC", "Santos"}; //0-3
		int pontos[] = {0, 0, 0, 0};
		int media [] = new int [4];
		String nomes[] = new String[4];
		char letra = ' ';
		String texto = "Zaine";
		
		System.out.println(pontos[3]);
		System.out.println(media[3]);
		System.out.println(nomes[3]);
		nomes[2] = "";
		System.out.println(nomes[2]);
		System.out.println(nomes[1]);
		System.out.println(letra);
		System.out.println(texto);
		System.out.println(texto.isBlank());
		System.out.println(texto.length());
	}
}
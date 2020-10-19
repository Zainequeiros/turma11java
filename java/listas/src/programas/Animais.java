package programas;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class Animais {

	public static void main(String[] args) {
		
		Cachorro doguineo = new Cachorro ("Leleco", 7);
		Cavalo upaupa = new Cavalo ("Pé de Pano", 14);
		Preguica preguicinha = new Preguica ("Dona Preguiça", 21);
		
		doguineo.emiteSom();
		upaupa.emiteSom();
		preguicinha.emiteSom();
	}
}
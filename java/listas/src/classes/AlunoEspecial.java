package classes;

public class AlunoEspecial  extends Aluno {
	
	private int acrescimo;
	public AlunoEspecial(String nome, int anoNascimento, char sexo, int matricula, double notaFinal, int acrescimo) {
		super(nome, anoNascimento, sexo, matricula, notaFinal);
		this.acrescimo = acrescimo;
	}
	public int getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(int acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	
	@Override
	public double ajusteNota()
	{
		super.setNotaFinal(super.getNotaFinal()+1+acrescimo);
		return super.getNotaFinal();
	}	
}
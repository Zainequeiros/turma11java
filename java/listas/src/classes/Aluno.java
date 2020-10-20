package classes;

public class Aluno extends Pessoa {
	private int matricula;
	private double notaFinal;
	private double notaAjustada;
	
	public Aluno(String nome, int anoNascimento, char sexo, int matricula, double notaFinal) {
		super(nome, anoNascimento, sexo);
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	// metodo da menção
	public String mencao() {
		String texto="";
		if(this.ajusteNota()<5)
		//if (notaFinal<5)
		{
			if (super.getSexo()=='F')
			{
				texto = "REPROVADA";
			}
			else if (super.getSexo()=='M')
			{
				texto = "REPROVADO";
			}
			
		} else if (this.ajusteNota()>=5)
		
		{
			texto =(super.getSexo()=='F')?"APROVADA":(super.getSexo()=='M')?"APROVADO":"APROVADX";
		}
			
		return texto;
	}
	
	public double ajusteNota()
	{
		notaAjustada = notaFinal+1;
		return notaAjustada;
	}	
}
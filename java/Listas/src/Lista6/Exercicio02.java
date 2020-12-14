package Lista6;

public class Exercicio02 
{
	public String corAviao;
	public String modeloAviao;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	public Exercicio02()
	{
	
	}
	public Exercicio02(String corAviao)
	{
		this.corAviao = corAviao;
	}
	public Exercicio02(String corAviao, String modeloAviao)
	{
		this.corAviao = corAviao;
		this.modeloAviao = modeloAviao;
	}
	public Exercicio02(String corAviao, String modeloAviao, double velocidadeAtual)
	{
		this.corAviao = corAviao;
		this.modeloAviao = modeloAviao;
		this.velocidadeAtual = velocidadeAtual;
	}
	public Exercicio02(String corAviao, String modeloAviao, double velocidadeAtual, double velocidadeMaxima)
	{
		this.corAviao = corAviao;
		this.modeloAviao = modeloAviao;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
}

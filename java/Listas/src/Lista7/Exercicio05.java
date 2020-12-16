package Lista7;

public class Exercicio05 extends Exercicio01{

	protected double valorProducao;
	protected double comissao = 1.03;
	protected double valorComAjuste;
	
	

	//Construtores
	
	public Exercicio05() 
	{
		super();
	}
	
	public Exercicio05(double valorProducao)
	{
		super();
		this.valorProducao = valorProducao;
	}

	public Exercicio05(double valorProducao, double comissao) 
	{
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	//Método
	public double setvalorAjustado()
	{		
		  return(this.valorProducao * this.comissao);	
	}

}

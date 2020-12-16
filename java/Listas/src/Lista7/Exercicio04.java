package Lista7;

public class Exercicio04 extends Exercicio01{

	protected double ajudaDeCusto;

	
	//Construtores
	
	public Exercicio04() 
	{
		super();
	}
	
	public Exercicio04(double ajudaDeCusto)
	{
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}

	
	//Método
	public void setajudaGasto(double gastos) 
	{
		if(gastos > ajudaDeCusto)
		{
			double sobraGasto = (gastos - this.ajudaDeCusto);
			this.ajudaDeCusto = 0;
			System.out.println("VOCÊ TERÁ QUE ARCAR COM O RESTANTE DOS GASTOS!");
			System.out.println("GASTOS RESTANTES: "+sobraGasto);
		}
		else 
		{
			this.ajudaDeCusto = this.ajudaDeCusto - gastos;
		}
	}

}

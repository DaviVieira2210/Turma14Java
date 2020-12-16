
public class Terceiro extends Funcionario{

	private double valorTerceiro;

	
	
	//Construtor
	
	public Terceiro(double valorTerceiro) 
	{
		super();
		this.valorTerceiro = valorTerceiro;
	}


	//Getters and Setters
	public double getValorTerceiro() {
		return valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}
	

	@Override
	//Método
		public double setPagamentoSalario()
		{
			return ((super.getHorasMensais() * super.getValorHora()) + this.valorTerceiro);		
		}
	
}

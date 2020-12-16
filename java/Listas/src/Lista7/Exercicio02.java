package Lista7;

public class Exercicio02 extends Exercicio01 
{
	
	private double valorDivida;
	private double valorCredito;
	protected String nomeFornecedor;


	//Getters And Setters
	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	//Contrutores

	public Exercicio02(double valorDivida, double valorCredito) {
		super();
		this.valorDivida = valorDivida;
		this.valorCredito = valorCredito;
	}
	
	public Exercicio02(double valorDivida) {
		super();
		this.valorDivida = valorDivida;
	}
	
	public Exercicio02() {
		super();
	}	
	
	//Método
	public double obterSaldo () 
	{
		return (this.valorCredito - this.valorDivida);
		
	}
	
}
package Lista6;

public class Exercicio01 {

	public String nomeCliente;
	public String cpf;
	public char genero;
	
	
	public Exercicio01()
	{
	
	}
	

	public Exercicio01(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}
	
	public Exercicio01(String nomeCliente, String cpf)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
	}
	
	public Exercicio01(String nomeCliente, String cpf, char genero)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.genero = genero;
	}
}

package Bancos;

public class Conta {

	public int numeroConta;
	public double saldo;
	public String cpf;
	
	public Conta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}
	public Conta(int numeroConta, String cpf)
	{
		this.cpf=cpf;
	}
}	

package Bancos;

public class Conta {

	public int numeroConta;
	public double saldo;
	public String cpf;
	

	public Conta()
	{
	   super();
	}
	public Conta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	public Conta(int numeroConta, double saldo) 
	{
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public Conta(int numeroConta, double saldo, String cpf)
	{
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf=cpf;
	}
	
	//Metodos
	
	public void debito(double valorDebito)
	{
		this.saldo = this.saldo - valorDebito;
	}
	public void credito(double valorCredito)
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	
	
	
	
	
	
	
}	

package Bancos;

public abstract class Conta {
	private int numeroConta;
	private double saldo;
	private String cpf;
	public double debito;
	public double credito;
	
	//construtores - regras de construção da classe
	public Conta() {//padrao
		
	}
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//sobrecarga
	public Conta(int numeroConta, String cpf) {
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	
	//métodos
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void debito(double valorDebito) {
		this.saldo -= valorDebito;
	}
	public void credito(double valorCredito) {
		this.saldo += valorCredito;
	}
	
	
	
}

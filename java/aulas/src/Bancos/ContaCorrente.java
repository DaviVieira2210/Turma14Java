package Bancos;

public class ContaCorrente extends Conta 
{
	protected int numeroTalaoCheque;

	
	//construtor
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}
	public ContaCorrente(int numeroConta, String cpf, int numeroTalaoCheque) {
		super(numeroConta, cpf);
		this.numeroTalaoCheque = numeroTalaoCheque;
	}

	//ENCAPSULAMENTO
	
	public int getNumeroTalaoCheque() {
		return numeroTalaoCheque;
	}

	public void setNumeroTalaoCheque(int numeroTalaoCheque) {
		this.numeroTalaoCheque = numeroTalaoCheque;
	}
	
	
	
}
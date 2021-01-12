package Bancos;

public class ContaUniversitaria extends Conta{
	private double valorLimite;
	private double limiteUniversitarioCadastrado;

	public ContaUniversitaria(int numeroConta, double limite) {
		super(numeroConta);
		this.limiteUniversitarioCadastrado = limite;
		this.valorLimite = limite;
	}
	
	//métodos
	public double getLimite() {
		return valorLimite;
	}

	public void setLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
	public boolean testarSaldo(double valor) {
		boolean teste;
		if(valor <= super.getSaldo()) {
			teste = true;
		} else if(valor <= (this.valorLimite + super.getSaldo())) {
			double valorCredito = valor - super.getSaldo();
			super.credito(valorCredito);
			
			this.valorLimite-=valorCredito;
			
			teste=true;
		} else {
			teste = false;
		}
		return teste;
	}
	
	public void restituiLimiteCadastrado() {
		if(valorLimite < limiteUniversitarioCadastrado) {
			if(super.getSaldo()>0 && super.getSaldo() >= (limiteUniversitarioCadastrado - valorLimite)) {
				double valorDebito = limiteUniversitarioCadastrado - valorLimite;
				super.debito(valorDebito);
				valorLimite += valorDebito; 
			} else if(super.getSaldo()>0 && super.getSaldo()<(limiteUniversitarioCadastrado - valorLimite)) {
				double valorDebito = getSaldo();
				super.debito(valorDebito);
				valorLimite+=valorDebito;
			}
		}
	}
}
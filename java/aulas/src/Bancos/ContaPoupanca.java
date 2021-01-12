package Bancos;

public class ContaPoupanca extends Conta {
	//atributo
			private int dataAniversarioConta;
			
				
			//CONSTRUTOR
			public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
				super(numeroConta, cpf);
				this.dataAniversarioConta = dataAniversarioConta;
			}
			
			
			//ENCAPSULAMENTO - GETTER AND SETTERS
			
			public int getDataAniversarioConta() {
				return dataAniversarioConta;
			}

			

			public void setDataAniversarioConta(int dataAniversarioConta) {
				this.dataAniversarioConta = dataAniversarioConta;
			}
			
			
			//MÉTODO
			public void correcaoPoupanca(int dataAtual) {
				
				if (dataAtual == this.dataAniversarioConta && this.getSaldo() > 0) 
				{				
					super.credito((super.getSaldo()*0.005));		
					System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA! O SEU SALDO RENDEU!");
					System.out.printf("SALDO ATUAL: R$ %.2f", getSaldo());
					System.out.println("\n");
		
				}
				else if(dataAtual == this.dataAniversarioConta && this.getSaldo() == 0)
				{
					System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA!");
					System.out.println("INFELIZMENTE NÃO HOUVE RENDIMENTO POIS SEU SALDO É R$0,00");
				}
				else
				{
					System.out.printf("SALDO ATUAL: R$ %.2f",this.getSaldo());
					System.out.println("\n");
					System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
				}
					
			}
}

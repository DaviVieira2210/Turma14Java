package Bancos;
import java.util.Scanner;
public class BancoTeste {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0; //escopo global
		double debito;
		double credito;
		double saldo = 0;
		char continuaMenu;
		double movimentos[] = null;
		char continuaLoop;
		int aniversarioConta = 0;
		
		System.out.println("BANCO DO DAVI!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupan�a");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua op��o: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta)
				{
					case '1':
					{	
						
							System.out.println("Digite a data de abertura da conta: ");
							int dataAniversario = leia.nextInt();
							ContaPoupanca poupanca = new ContaPoupanca(numeroConta,cpfConta,dataAniversario);
						
								System.out.println("DIGITE O DIA DE HOJE: ");
								int aniversarioConfirmacao = leia.nextInt();
								for(int i=0; i<3; i++){
									
									System.out.println("MOVIMENTA��O "+ (i+1)+ " - [D]D�BITO OU [C] CR�DITO");
									char debitoCredito = leia.next().toUpperCase().charAt(0);
								
									
									if(debitoCredito == 'D') {
										System.out.println("DIGITE O VALOR DO D�BITO: R$");
										debito = leia.nextDouble();
										if(saldo >= debito) {
											if(i == 2){
												movimentos[i]= (-debito);
												saldo += movimentos[i];
												
													if(aniversarioConta == aniversarioConfirmacao && saldo > 0){
														saldo = saldo * 1.005;
														System.out.println("PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA! O SEU SALDO RENDEU!");
														System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
														pula();
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);

													}else if(aniversarioConta == aniversarioConfirmacao && saldo == 0){
													
														System.out.println("PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA!");
														System.out.println("INFELIZMENTE N�O HOUVE RENDIMENTO POIS SEU SALDO � R$0,00");
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);
													
													}else {
														pula();
														System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);
													}
											}
																		
											else{
												movimentos[i]= (-debito);
												saldo += movimentos[i];
												pula();
												System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
												System.out.println("DESEJA CONTINUAR? S/N");
												continuaLoop = leia.next().toUpperCase().charAt(0);
													if(continuaLoop == 'N'){
														break;	
													}
												}
										}else if(saldo < debito) {
											pula();
											System.out.println("SALDO INSULFICIENTE");
											System.out.println("DESEJA CONTINUAR? S/N");
											continuaLoop = leia.next().toUpperCase().charAt(0);
												if(i == 2) {
													pula();
													System.out.println("SALDO INSULFICIENTE");
													System.out.println("DESEJA CONTINUAR? S/N");
													continuaLoop = leia.next().toUpperCase().charAt(0);
													System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
													continuaMenu = leia.next().toUpperCase().charAt(0);
												}
												if(continuaLoop == 'N'){
													break;
												}
										}
									}else if(debitoCredito == 'C') {
											if(i == 2) {
												System.out.println("DIGITE O VALOR DO CR�DITO: R$");
												credito = leia.nextDouble();
												movimentos[i] = credito;
												saldo += movimentos[i]; 
													if(aniversarioConta == aniversarioConfirmacao && saldo > 0){	
														saldo = saldo * 1.005;
														System.out.println("PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA! O SEU SALDO RENDEU!");
														System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
														pula();
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);	
													}else if(aniversarioConta == aniversarioConfirmacao && saldo == 0){
														System.out.println("PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA!");
														System.out.println("INFELIZMENTE N�O HOUVE RENDIMENTO POIS SEU SALDO � R$0,00");
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);
													}else {		
														System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
														pula();
														System.out.println("MOVIMENTA��ES ENCERRADAS.");
														linha();
														System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
														continuaMenu = leia.next().toUpperCase().charAt(0);
													}

											}else {
												System.out.println("DIGITE O VALOR DO CR�DITO: R$");
												credito = leia.nextDouble();
												movimentos[i] = credito;
												saldo += movimentos[i]; 
												System.out.println("DESEJA CONTINUAR? S/N");
												continuaLoop = leia.next().toUpperCase().charAt(0);
													if(continuaLoop == 'N'){
														break;								
													}
											}
									  }									
								}
							}
					
					break;	
					case '2':
					{
						System.out.println("Digite o n�mero de tal�es desejados: ");
						int numeroTalaoCeque = leia.nextInt();
						ContaCorrente corrente = new ContaCorrente(numeroConta,cpfConta,numeroTalaoCeque);
					}
				}
				
				
			}
			else if (op == '2')
			{
				System.out.println("wip");
			}
			else
			{
				
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}
		
		} while(true);
				
	}
	static void linha() {
		int tamanho = 19;
		for (int x = 1; x <= tamanho; x++)
			System.out.print("-");
	}

	static void pula() {
		System.out.println();
	}
	
}
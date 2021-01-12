package Bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		final int mov = 10;
		char op;
		int numeroConta=0, opcaoMenu =0;
		char continuaMenu='0';
		char continuaMov ='N';
		
		
		
			System.out.println("G1-BANK");
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - CONTA POUPANÇA");
				System.out.println("2 - CONTA CORRENTE");
				System.out.println("3 - CONTA ESPECIAL");
				System.out.println("4 - CONTA EMPRESA");
				System.out.println("5 - CONTA UNIVERSITÁRIA");
				System.out.print("DIGITE O NÚMERO DA OPÇÃO DESEJADA: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				
				
				switch (opconta)
				{
					case '1': //poupanca
						double movimentos[] = new double[mov];
						char continuaLoop='0';
						char debitoOuCredito;
						
						System.out.println("DIGITE A DATA DE ABERTURA DA CONTA:_");
						int aniversarioConta = leia.nextInt();
						
						ContaPoupanca contapop = new ContaPoupanca(numeroConta, cpfConta, aniversarioConta);
						
						System.out.println("DIGITE O DIA DE HOJE: ");
						int dataAtual = leia.nextInt();
						
						do {
							menuInicial();
							opcaoMenu = leia.next().charAt(0);
						switch(opcaoMenu) {
						case '1':
							for (int i = 0; i < mov; i++) {
								System.out.println("MOVIMENTAÇÃO " + (i + 1) + " - [D]DÉBITO OU [C] CRÉDITO");
								debitoOuCredito = leia.next().toUpperCase().charAt(0);

								if (debitoOuCredito == 'D') {//DEBITO
									System.out.println("DIGITE O VALOR DO DÉBITO: R$");
									double valorDebito = leia.nextDouble();
									
									if (contapop.getSaldo() >= valorDebito) {
										contapop.debito(valorDebito);
										if (i == (mov-1)) {
											movimentos[i] = contapop.getSaldo() -contapop.debito;

											if (contapop.getDataAniversarioConta() == dataAtual && contapop.getSaldo() > 0) {
												contapop.getSaldo();
												contapop.correcaoPoupanca(dataAtual);
												System.out.println(
														"PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA! O SEU SALDO RENDEU!");
												System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
												pula();
												System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
												continuaMenu = leia.next().toUpperCase().charAt(0);

											} else if (contapop.getDataAniversarioConta() == dataAtual
													&& contapop.getSaldo() == 0) {
												
												System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA!");
												System.out.println("INFELIZMENTE NÃO HOUVE RENDIMENTO POIS SEU SALDO É R$0,00");
												System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
												continuaMenu = leia.next().toUpperCase().charAt(0);
												if(continuaMenu == 'S') {
													break;
												}

											} else {
												pula();
												System.out.printf("SALDO ATUAL: R$ %.2f\n", contapop.getSaldo());
												System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
												continuaMenu = leia.next().toUpperCase().charAt(0);
												if(continuaMenu == 'S') {
													break;
												}
											}
										} else {
											movimentos[i] = contapop.getSaldo() - contapop.debito;
											pula();
											System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
											System.out.println("\nDESEJA CONTINUAR? S/N");
											continuaLoop = leia.next().toUpperCase().charAt(0);
											if (continuaLoop == 'N') {
												break;
											}
										}

									} else if (contapop.getSaldo() < valorDebito) {
										if (i == (mov-1)) {
											pula();
											System.out.println("SALDO INSULFICIENTE");
											
											System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
											continuaMenu = leia.next().toUpperCase().charAt(0);
											if(continuaMenu == 'S') {
												break;
											}
										} else {
											System.out.println("\nDESEJA CONTINUAR? S/N");
											continuaLoop = leia.next().toUpperCase().charAt(0);
											if (continuaLoop == 'N') {
												break;
											}
										}
									}
								} else if (debitoOuCredito == 'C') {//credito
									if (i == (mov-1)) {
										System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
										contapop.credito(leia.nextDouble());
										movimentos[i] += contapop.credito;
										
										contapop.correcaoPoupanca(dataAtual);
										System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
										
										System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);
										if(continuaMenu == 'S') {
											break;
										}

									} else {
										System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
										contapop.credito(leia.nextDouble());
										movimentos[i] += contapop.getSaldo();
										System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
										System.out.println("\nDESEJA CONTINUAR? S/N");
										continuaLoop = leia.next().toUpperCase().charAt(0);
										if (continuaLoop == 'N') {
											break;
										}
									}
								}
					}
						break;
						case '2':
							System.out.println("NÚMERO DA CONTA: "+ contapop.getNumeroConta());
							System.out.println("SALTO ATUAL: "+ contapop.getSaldo());
							System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
							continuaMenu = leia.next().toUpperCase().charAt(0);
						break;
						
						case '3':
							System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
						break;
						}
				}while(continuaLoop == 'N' || continuaMenu == 'S');

					break;
					
					case '2': //corrente
						//aqui vai a conta corrente!
						System.out.println("W.I.P. - Ainda estamos trabalhando...");
					break;
					
					case '3': //especial
						//aqui vai a conta especial!
						System.out.println("W.I.P. - Ainda estamos trabalhando...");
					break;
					
					case '4': //empresa
						//aqui vai a conta empresa!
						System.out.println("W.I.P. - Ainda estamos trabalhando...");
					break;
					
					case '5': //universitaria
						System.out.println("QAUL O VALOR DO LIMITE?");
						ContaUniversitaria contaU = new ContaUniversitaria(numeroConta, leia.nextDouble());
						do {
						menuInicial();
						opcaoMenu = leia.next().charAt(0);
						
						switch(opcaoMenu) {
							case '1':
								for(int i=0; i<mov; i++) {
								System.out.println("MOVIMENTO " + (i+1));
								System.out.println("[C]-CRÉDITO / [D]-DÉBITO:_");
								op = leia.next().toUpperCase().charAt(0);
								
								if(op == 'C') {
									if(i == (mov-1)) {
										System.out.println("DIGITE O VALOR A SER CREDITADO:_");
										double valorCredito = leia.nextDouble();
										contaU.credito(valorCredito);
										contaU.restituiLimiteCadastrado();
										System.out.println("SALDO ATUAL: "+ contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: "+ contaU.getLimite());
									} else {
										System.out.println("DIGITE O VALOR A SER CREITADO:_");
										double valorCredito = leia.nextDouble();
										contaU.credito(valorCredito);
										contaU.restituiLimiteCadastrado();
										System.out.println("SALDO ATUAL: "+ contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: "+ contaU.getLimite());
										System.out.println("\nDESEJA CONTINUAR AS MOVIMENTAÇÕES? S/N");
										continuaMov = leia.next().toUpperCase().charAt(0);
										if(continuaMov == 'N') {
										break;
										}
									}
									
								} else if(op == 'D') {
									if(i == (mov-1)) {
										System.out.println("DIGITE O VALOR A SER DEBITADO:_");
										double valorDebito = leia.nextDouble();
										contaU.testarSaldo(valorDebito);
										contaU.debito(valorDebito);
										System.out.println("SALDO ATUAL: "+ contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: "+ contaU.getLimite());
									} else {
										System.out.println("DIGITE O VALOR A SER DEBITADO:_");
										double valorDebito = leia.nextDouble();
										contaU.testarSaldo(valorDebito);
										contaU.debito(valorDebito);
										System.out.println("SALDO ATUAL: "+ contaU.getSaldo());
										System.out.println("LIMITE DISPONÍVEL: "+ contaU.getLimite());
										System.out.println("\nDESEJA CONTINUAR AS MOVIMENTAÇÕES? S/N");
										continuaMov = leia.next().toUpperCase().charAt(0);
										if(continuaMov == 'N') {
											break;
										}
									}
									
								}
								}
						
							break;
						
							case '2':
								System.out.println("NÚMERO DA CONTA: "+ contaU.getNumeroConta());
								System.out.println("SALTO ATUAL: "+ contaU.getSaldo());
								System.out.println("LIMITE DISPONÍVEL: R$" + contaU.getLimite());
								System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							break;
							
							case '3':
								System.out.println("OBRIGADO POR UTILIZAR O G1-BANK!");
							break;
						}
				}while(continuaMov == 'N');
					break;
				
				}
			}
			else if (op == '2')
			{
				System.out.println("W.I.P - Ainda estamos trabalhando...");
			}
			else
			{
				
			}
			
		
		
		leia.close();		
	}
	
	public static void menuInicial() {
		linha(15);
		pula();
		System.out.println("[1] - MOVIMENTAÇÃO");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - SAIR");
		linha(15);			
		
	}
	
	public static void linha(int tamanho) {
		for(int x=0; x<tamanho; x++) {
			System.out.print("💸");
		}
	}
	
	static void pula() {
		System.out.println();
	}

}
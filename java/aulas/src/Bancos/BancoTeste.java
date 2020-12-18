package Bancos;

import java.util.Scanner;

public class BancoTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaPoupanca contapop = new ContaPoupanca(1, "6565", 22);

		char op;
		char saida;
		int numeroConta = 0;
		double debito = 0, credito=0, saldo = 0;
		char continuaMenu = 0;
		double movimentos[] = new double[3];
		char continuaLoop;
		char debitoOuCredito;

		do {
			System.out.println("G1-BANK");

			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1') {
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
				switch (opconta) {
				case '1': {

					System.out.println("Digite a data de abertura da conta: ");
					contapop.setDataAniversarioConta(leia.nextInt());

					System.out.println("DIGITE O DIA DE HOJE: ");
					int dataAtual = leia.nextInt();
					for (int i = 0; i < 3; i++) {

						System.out.println("MOVIMENTA��O " + (i + 1) + " - [D]D�BITO OU [C] CR�DITO");
						debitoOuCredito = leia.next().toUpperCase().charAt(0);

						if (debitoOuCredito == 'D') {
							System.out.println("DIGITE O VALOR DO D�BITO: R$");
							contapop.debito(leia.nextDouble());
							if (contapop.getSaldo() >= contapop.debito) {

								if (i == 2) {
									movimentos[i] = (-contapop.debito);
									movimentos[i] = contapop.getSaldo();

									if (contapop.getDataAniversarioConta() == dataAtual && contapop.getSaldo() > 0) {
										contapop.getSaldo();
										contapop.correcaoPoupanca(i);
										System.out.println(
												"PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA! O SEU SALDO RENDEU!");
										System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
										pula();
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);

									} else if (contapop.getDataAniversarioConta() == dataAtual
											&& contapop.getSaldo() == 0) {
										
										System.out.println("PARAB�NS HOJE � O ANIVERS�RIO DA SUA CONTA!");
										System.out.println("INFELIZMENTE N�O HOUVE RENDIMENTO POIS SEU SALDO � R$0,00");
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);

									} else {
										pula();
										System.out.printf("SALDO ATUAL: R$ %.2f\n", contapop.getSaldo());
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);
									}
								}
									
								else {
									movimentos[i] = (-contapop.debito);
									movimentos[i] += contapop.getSaldo();
									pula();
									System.out.printf("SALDO ATUAL: R$ %.2f", contapop.getSaldo());
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
									if (continuaLoop == 'N') {
										break;
									}
								}

							} else if (contapop.getSaldo() < contapop.debito) {
								pula();
								System.out.println("SALDO INSULFICIENTE");
								System.out.println("DESEJA CONTINUAR? S/N");
								continuaLoop = leia.next().toUpperCase().charAt(0);
								if (i == 2) {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								}
							if (continuaLoop == 'N') {
								break;
							}
						}

						} else if (debitoOuCredito == 'C') {
							if (i == 2) {
								System.out.println("DIGITE O VALOR DO CR�DITO: R$");
								contapop.credito(leia.nextDouble());
								movimentos[i] += contapop.credito;
								
								contapop.correcaoPoupanca(dataAtual);

							} else {
								System.out.println("DIGITE O VALOR DO CR�DITO: R$");
								contapop.credito(leia.nextDouble());
								movimentos[i] += contapop.getSaldo();
								System.out.println("DESEJA CONTINUAR? S/N");
								continuaLoop = leia.next().toUpperCase().charAt(0);
								if (continuaLoop == 'N') {
									break;
								}
							}
						}
					}
				}

				break;
				case '2': {
					System.out.println("Digite o n�mero de tal�es desejados: ");
					int numeroTalaoCeque = leia.nextInt();
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta, numeroTalaoCeque);
				}
			}
		} 
			else if (op == '2') 
			{
				System.out.println("WIP");
			} 
			else if(op == '3')
			{
				System.out.println("OBRIGADO POR ESCOLHER O G1-BANK!");
			}

		} while (continuaMenu == 'S');
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
package Banco;

import java.util.Scanner;

public class contaPoupanca {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//int numeroConta=2;
		//int dataAniversario;
		//String cpf;
		//String nome;
		//char tipo = 0;
		//int dataAniversarioConta = 22, dataComparacao;
		//String cpfClientes[] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"};
		//String contas[] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"};
		char debitoCredito = 0;
		char continuaLoop = 0;
		double movimentos[] = new double[3];
		double credito=0, debito = 0;
		char resposta;
		double saldo=0;
		String nomeCliente = "Davi Vieira";
		String numeroConta = "01";
		char continuaMenu = 0;
		

		linha();
		pula();
		System.out.println("[1] - MOVIMENTAÇÃO");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - SAIR");
		linha();
		resposta = leia.next().charAt(0);
		
		
		switch(resposta){
		
		
			
			case '1': 
			{		
				for(int i=0; i<3; i++){
					
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 2){
								movimentos[i]= (-debito);
								saldo -= movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							}else{
							movimentos[i]= (-debito);
							saldo += movimentos[i];
							System.out.println("SALDO ATUAL: R$ "+saldo);
							System.out.println("DESEJA CONTINUAR? S/N");
							continuaLoop = leia.next().toUpperCase().charAt(0);
							}
						}else if(saldo < debito) {
							pula();
							System.out.println("SALDO INSULFICIENTE");
							System.out.println("DESEJA CONTINUAR? S/N");
							continuaLoop = leia.next().toUpperCase().charAt(0);
						}
					}else if(debitoCredito == 'C') {
							if(i == 2) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i]; 
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha();
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							}
						System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
						credito = leia.nextDouble();
						movimentos[i] = credito;
						saldo += movimentos[i]; 
						System.out.println("DESEJA CONTINUAR? S/N");
						continuaLoop = leia.next().toUpperCase().charAt(0);
					}									
				}
			break;
			}

			case '2' : System.out.println("NOME DO CLIENTE: "+ nomeCliente);
					   System.out.println("NÚMERO DA CONTA: "+ numeroConta);
				       System.out.println("SALTO ATUAL: "+ saldo);	
			break;
			}
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
	


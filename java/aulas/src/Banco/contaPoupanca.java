package Banco;

import java.util.Scanner;

public class contaPoupanca {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroConta=2;
		double saldo=0;
		int dataAniversario;
		String cpf;
		char resposta;
		String nome;
		double credito=0, debito = 0;
		char tipo = 0;
		double movimentos[] = {0,1,2,3};
		int dataAniversarioConta = 22, dataComparacao;
		String cpfClientes[] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"};
		String contas[] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"};
		char contuinua = 0;
		char opcaoContinua;


		System.out.println("SALDO ATUAL: R$ "+saldo);
		System.out.println("TIPO DE CONTA: "+contas[1]);
		System.out.println("DIGITE [S] SIM OU [N] NÃO PARA CONTINUAR:");
		resposta = leia.next().toUpperCase().charAt(0);

		if(resposta == 'S')
		{
			pula();
			System.out.println("OK, VAMOS PROSSEGUIR!");
			pula();
		}

		do {
		
			for(int x=0; x<2; x++)
			{
				System.out.println("[D]DÉBITO OU [C]CRÉDITO:");
				tipo = leia.next().toUpperCase().charAt(0);
			}
				if(tipo == 'D' || tipo == 'C')
				{
					pula();
					System.out.println("DIGITE O VALOR DO DÉBITO: R$");
					debito = leia.nextDouble();				
				}
					if(saldo >= debito)
					{
					movimentos[x]=(saldo - debito);
					}
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("DESEJA CONTINUAR? [S]Sim [N]Não");
			opcaoContinua = leia.next().toUpperCase().charAt(0);
		}while(opcaoContinua == 'S');

		

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

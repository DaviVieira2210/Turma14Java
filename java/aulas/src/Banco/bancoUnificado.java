package Banco;

import java.util.Random;
import java.util.Scanner;

public class bancoUnificado {
	public static void main(String[] args) {
		final int CONST = 40;
		
		int contas[] = new int[CONST];
		int tipoContas[] = new int[CONST];
		String nomesClientes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
		char generoClientes[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
		String contaTipo = "";
		int numeroConta = 0;
		char opcaoMenu= '0', voltaMenu='0';
		String cliente = "";
			
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		//faz vetor contas
		for(int i=0; i<CONST; i++) {
			contas[i] = (i+1);
		}
		
		//faz vetor tipoConta
		for(int i=0; i<CONST; i++) {
			tipoContas[i] = random.nextInt(3)+1;
		}
		
		//começa programa
		do {
			iniciar();
			numeroConta = leia.nextInt();
			
			if(numeroConta > CONST) {
				System.out.println("ESTA CONTA NÃO EXISTE.\nPOR FAVOR, DIGITE UM NÚMERO VÁLIDO DE CONTA.");
				voltaMenu='S';
			}
			
			for(int i=0; i<CONST; i++) {
				if(numeroConta == (i+1)) {
					System.out.printf("\nConta: %d",contas[i]);
					System.out.printf("\nCliente: %s", nomesClientes[i]);
					cliente = nomesClientes[i];
					if(tipoContas[i] == 1) {
						contaTipo = "POUPANÇA";
					} else if(tipoContas[i] == 4) {
						contaTipo = "CORRENTE";
					} else if(tipoContas[i] == 2) {
						contaTipo = "ESPECIAL";
					}else if(tipoContas[i] == 5) {
						contaTipo = "EMPRESA";
					} else if(tipoContas[i] == 3) {
						contaTipo = "UNIVERSITÁRIA";
					}
					System.out.printf("\nTipo de conta: %s", contaTipo);
					System.out.print("\nCONFIRMA OS DADOS? [S]-SIM | [N]-NÃO: ");
					opcaoMenu = leia.next().toUpperCase().charAt(0);
				}
			}
			
			if(opcaoMenu == 'S') {
				for(int i=0; i<CONST; i++) {
					if(numeroConta == (i+1)) {
						if(generoClientes[i] == 'M') {
							System.out.printf("\nSeja bem-vindo, %s!!!\n", nomesClientes[i]);
						} else {
							System.out.printf("\nSeja bem-vinda, %s!!!\n", nomesClientes[i]);
						}
					}
				}
				
				switch(contaTipo) {
				// !!!  CHAMADA DE CONTAS POR FUNCAO !!!
					case "POUPANÇA":
						contaPopanca(leia, random, cliente, numeroConta);
						System.out.println("DESEJA RECOMEÇAR? [S]-SIM | [N]-NÃO:_");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						break;
						
					case "CORRENTE":
						//funcao contaCorrente()
						System.out.println("DESEJA RECOMEÇAR? [S]-SIM | [N]-NÃO:_");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						break;
						
					case "ESPECIAL":
						contaEspecial(leia, cliente, numeroConta);
						System.out.println("DESEJA RECOMEÇAR? [S]-SIM | [N]-NÃO:_");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						break;
						
					case "EMPRESA":
						//funcao ocntaEmpresa()
						System.out.println("DESEJA RECOMEÇAR? [S]-SIM | [N]-NÃO:_");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						break;
						
					case "UNIVERSITÁRIA":
						contaUniversitaria(leia, cliente, numeroConta);
						System.out.println("DESEJA RECOMEÇAR? [S]-SIM | [N]-NÃO:_");
						voltaMenu = leia.next().toUpperCase().charAt(0);
						break;
				}
			} else {
				voltaMenu='S';
			}
			}while(voltaMenu=='S');
	}
	//==================================================================================
	// --- FUNCOES ---
	
	//1-CONTA POUPANÇA
	public static void contaPopanca(Scanner leia, Random random, String cliente, int conta) {
	double movimentos[] = new double[10];
	int aniversarioConta[] = new int[40];
	
		
		int aniversarioConfirmacao=0;
		int contaAniversario = 0;
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0;
		char continuaMenu = 0;
		
		//popula vetor aniversarioConta
		for(int i=0; i<40; i++) {
			aniversarioConta[i] = random.nextInt(31)+1;
			contaAniversario = aniversarioConta[i];
		}

		
		do{
		switch(menuInicial(leia)){

		
			case '1': 
			{						
				System.out.println("DIGITE O DIA DE HOJE: ");
				aniversarioConfirmacao = leia.nextInt();
				for(int i=0; i<10; i++){
					
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 9){
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								
									if(contaAniversario == aniversarioConfirmacao && saldo > 0){
										saldo = saldo * 1.005;
										System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA! O SEU SALDO RENDEU!");
										System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
										pula();
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);

									}else if(contaAniversario == aniversarioConfirmacao && saldo == 0){
									
										System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA!");
										System.out.println("INFELIZMENTE NÃO HOUVE RENDIMENTO POIS SEU SALDO É R$0,00");
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
								if(i == 9) {
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
							if(i == 9) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i]; 
									if(contaAniversario == aniversarioConfirmacao && saldo > 0){	
										saldo = saldo * 1.005;
										System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA! O SEU SALDO RENDEU!");
										System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
										pula();
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);	
									}else if(contaAniversario == aniversarioConfirmacao && saldo == 0){
										System.out.println("PARABÉNS HOJE É O ANIVERSÁRIO DA SUA CONTA!");
										System.out.println("INFELIZMENTE NÃO HOUVE RENDIMENTO POIS SEU SALDO É R$0,00");
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);
									}else {		
										System.out.printf("SALDO ATUAL: R$ %.2f",saldo);
										pula();
										System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
										linha(15);
										System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
										continuaMenu = leia.next().toUpperCase().charAt(0);
									}

							}else {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
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
			break;
			}

			case '2' : System.out.println("NOME DO CLIENTE: "+ cliente);
					   System.out.println("NÚMERO DA CONTA: "+ conta);
					   System.out.println("ANIVERSÁRIO DA CONTA: "+contaAniversario);
				       System.out.printf("SALTO ATUAL: %.2f", saldo);	
					   pula();
				       System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				       continuaMenu = leia.next().toUpperCase().charAt(0);
				       break;
			
			case '3' :
				System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
				continuaMenu = 'N';
				continuaLoop = 'S';
				break;
			}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
		
		}
	//2-CONTA CORRENTE
	
	//3-CONTA ESPECIAL
	public static void contaEspecial(Scanner leia, String cliente, int conta) {
		double movimentos[] = new double[10];
		
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0, limiteSaldo = 10000.0;
		char continuaMenu = 0;
		
		do{
		switch(menuInicial(leia)){
			case '1': //inicia movimentacao 
			{	
				for(int i=0; i<10; i++){
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {//debito
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 9){//ultima movimentacao - pergunta retorna menu
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}else{
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA CONTINUAR? S/N"); //s - continua mov | n- volta menu
								continuaLoop = leia.next().toUpperCase().charAt(0);
									if(continuaLoop == 'N'){
										break;	
									}
							}
						}else if(saldo < debito) {	//usa limite
							if((saldo+limiteSaldo) >= debito) {
								if(i == 9){		//ultima movimentacao - pergunta retorna menu
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							} else {
								if(i == 9){		//ultima movimentacao - pergunta retorna menu
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							}
							
						}
					}else if(debitoCredito == 'C') {//credito
							if(i == 9) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i];
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha(15);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							}
						System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
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
			break;
			}

			case '2' : 
				System.out.println("NOME DO CLIENTE: "+ cliente);
				System.out.println("NÚMERO DA CONTA: "+ conta);
				System.out.println("SALTO ATUAL: "+ saldo);
				System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				continuaMenu = leia.next().toUpperCase().charAt(0);
		       break;
			
			case '3' : 
				System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
				continuaMenu = 'N';
				continuaLoop = 'S';
				break;
			
		}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
	}
	
	//4-CONTA EMPRESA
	
	//5-CONTA UNIVERSITARIA
	public static void contaUniversitaria(Scanner leia, String cliente, int conta) {
		double movimentos[] = new double[10];
		
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0, limiteSaldo = 1000.0;
		char continuaMenu = 0;
		
		
		do{
		switch(menuInicial(leia)){
		
			case '1': //inicia movimentacao 
			{	
				for(int i=0; i<10; i++){
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {//debito
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 9){//ultima movimentacao - pergunta retorna menu
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}else{
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("DESEJA CONTINUAR? S/N"); //s - continua mov | n- volta menu
								continuaLoop = leia.next().toUpperCase().charAt(0);
									if(continuaLoop == 'N'){
										break;	
									}
							}
						}else if(saldo < debito) {	//usa limite
							if(limiteSaldo >= debito) {
								if(i == 9){		//ultima movimentacao - pergunta retorna menu
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							} else {
								if(i == 9){		//ultima movimentacao - pergunta retorna menu
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							}
						}
					}else if(debitoCredito == 'C') {//credito
							if(i == 9) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i];
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha(20);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							} else {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
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
			break;
			}

			case '2' : 
				System.out.println("NOME DO CLIENTE: "+ cliente);
				System.out.println("NÚMERO DA CONTA: "+ conta);
				System.out.println("SALTO ATUAL: "+ saldo);
				System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				continuaMenu = leia.next().toUpperCase().charAt(0);
		       break;
			
			case '3' : 
				System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
				continuaMenu = 'N';
				continuaLoop = 'S';
				break;
			
		}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
	}
	
	//menu inicial das contas
	public static char menuInicial(Scanner leia) {
		linha(15);
		pula();
		System.out.println("[1] - MOVIMENTAÇÃO");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - SAIR");
		linha(15);			
		char resposta = leia.next().charAt(0);
		
		return resposta;
	}
	
	//iniciar
	public static void iniciar() {
		linha(15);
		System.out.println();
		System.out.println("   <=== G1-BANK ===>   ");
		linha(15);
		
		System.out.println("\nDIGITE O NÚMERO DA CONTA:_ ");
	}

	static void pula() {
		System.out.println("\n");
	}
	
	//faz linha
	public static void linha(int tamanho) {
		for(int x=0; x<tamanho; x++) {
			System.out.print("💸");
		}
	}
	
}


package Loja;

import java.util.Scanner;

public class CadLoja5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int genero = 0;
		int tipo = 0;
		String nomeCliente;
		int opcaoContinua = 0;
		String nomeProdutos[] = {"CAMISETA", "BOLA DE FUTEBOL", "BOLA DE BASQUETE", "BOLA DE TÊNIS", "BONÉ", "RAQUETE", "SHORT", "REAGATA", "CHUTEIRA", "MEIÃO"};
		int estoque[] = new int[10];
		double precoUnitarios[] = {65,65,50,20,30,80,120,35,80,40};
		String codigos[] = new String [10];
		String escolhaProduto;
		
		
		do {

			linha();
			pula();
			System.out.println("          𝕊𝕦𝕣𝕗 𝔻𝕒𝕧𝕚'𝕤");
			System.out.println("꧁༺ Qualidade para você ༻꧂");
			linha();
			pula();

			pula();
			System.out.println("           MENU");
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			pula();
			linha();
			tipo = leia.nextInt();

			if (tipo == 1) {
				System.out.println("NOME DO CLIENTE: ");
				nomeCliente = leia.next();
				System.out.println("GENERO DO CLIENTE [1] Masculino [2] Feminino:");
				genero = leia.nextInt();
				if (genero == 1) {
					System.out.println("Seja bem-vindo à loja Sr. " + nomeCliente+"!");
				} else if (genero == 2) {
					System.out.println("Seja bem-vinda à loja Sra." + nomeCliente+"!");
				}
				linha();
				pula();
				System.out.println("CÓDIGO\t\tPREÇO\t\tESTOQUE\t\tPRODUTO");
				for(int i=0; i<10; i++)
				{			
					estoque[i] = 10;
					codigos[i]=((i<9)? "DSV-00" + (i+1): "DSV-0"+(i+1));
					System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[i],precoUnitarios[i],estoque[i],nomeProdutos[i]);
					
				}
				System.out.println("Digite o código do produto desejado: ");
				escolhaProduto = leia.next();
				
				
				
				System.out.println("\nDeseja continuar? [1]Sim [2]Não");
				opcaoContinua = leia.nextInt();
				if(opcaoContinua == 2)
				{
					System.out.println("FIM DE PROGRAMA!");
				}

			} else if (tipo == 2) {
				System.out.println("WIP");
				System.out.println("Deseja continuar? [1]Sim [2]Não");
				opcaoContinua = leia.nextInt();
				if(opcaoContinua == 2)
				{
					System.out.println("FIM DE PROGRAMA!");
				}
			} else if (tipo == 3) {
				System.out.println("Volte sempre!!");
			}
		} while (opcaoContinua == 1);
	}	

	public static void linha() {
		
		int tamanho = 15;
		for(int x = 1;x<=tamanho;x++)	
		System.out.print("-");
	}

	public static void pula() {
		System.out.println();
	}
}


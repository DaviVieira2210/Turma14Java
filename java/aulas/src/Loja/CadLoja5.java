package Loja;

import java.util.Scanner;

public class CadLoja5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int genero = 0;
		int tipo = 0;
		String nomeCliente;
		int opcaoContinua = 0;

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
		System.out.print("🏄");
	}

	public static void pula() {
		System.out.println();
	}
}

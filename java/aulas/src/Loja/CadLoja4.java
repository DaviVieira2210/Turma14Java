package Loja;

import java.util.Scanner;

public class CadLoja4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int genero = 0;
		int tipo = 0;
		String nomeCliente;
		
		linha();
		System.out.println("              𝕊𝕦𝕣𝕗 𝔻𝕒𝕧𝕚'𝕤");
		linha();
		pula();	
		
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		tipo = leia.nextInt();
		
		if(tipo == 1)
		{
		System.out.println("NOME DO CLIENTE: ");
		nomeCliente = leia.next();
		System.out.println("GENERO DO CLIENTE [1] Masculino [2] Feminino:");
		genero = leia.nextInt();
		if(genero == 1)
		{
		System.out.println("Seja bem-vindo à loja Sr. " + nomeCliente);
		}
		else if(genero == 2)
		{
		System.out.println("Seja bem-vinda à loja Sra."+ nomeCliente);
		}		
		}					
		else if(tipo ==2)
		{
		System.out.println("WIP");
		}
		else if(tipo == 3)
		{
		System.out.println("Volte sempre!!");
		}
	}
	public static void linha()
	{
	System.out.println("🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄🏄");
	}
	public static void pula()
	{
	System.out.println();
	}
}

package LojasTeste;

import java.util.Scanner;

public class CadLoja3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int genero;
		int tipo = 0;
		String nomeCliente;
		
		linha();
		System.out.println("              �?���?���?���?�� �?���?���?���?��'�?��");
		linha();
		pula();				
		
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		tipo = leia.nextInt();
				
		switch(tipo)
		{
		case 1 : System.out.println("DIGITE O SEU NOME: ");
		nomeCliente = leia.next();
		System.out.println("GENERO DO CLIENTE [1] Masculino [2] Feminino:");
		genero = leia.nextInt();
		
		if(genero == 1)
		{
		System.out.println("Seja bem-vindo à loja Sr. "+nomeCliente+"!!");
		}
		else if(genero == 2)
		{
		System.out.println("Seja bem-vinda à loja Sra. "+nomeCliente+"!!");
		}
		break;	
		case 2 : System.out.println("WIP");
		break;
		case 3 : System.out.println("Volte sempre!!");
		break;
		}
		
		
	}
	public static void linha()
	{
	System.out.println("�?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?�");
	}
	public static void pula()
	{
	System.out.println("\n");
	}
}

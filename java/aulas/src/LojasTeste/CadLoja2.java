package LojasTeste;

import java.util.Scanner;

public class CadLoja2 {
	
	static String nomeCliente;
	static String nomePessoa;
	static Scanner leia = new Scanner (System.in);
	char genero;
	
	public static void main(String[] args) {
		
		
		menuPrincipal();	
		
	}
	public static void linha()
	{
	System.out.println("�?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?�");
	}
	public static void pula()
	{
	System.out.println();	
	}
	
	
	
	
	public static void menuPrincipal()
	{
	
	int tipo = 0;
	int genero = 0;
	
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
	nomePessoa = leia.next();
	System.out.println("GENERO DO CLIENTE [1] Masculino [2] Feminino:");
	genero = leia.nextInt();
	
	if(genero == 1)
	{
	System.out.println("Seja bem-vindo à loja Sr. "+ nomePessoa+ "!!");
	}
	else if(genero == 2)
	{
	System.out.println("Seja bem-vinda à loja Sra. "+ nomePessoa+ "!!");
	}
	
	break;	
	case 2 : System.out.println("WIP");
	break;	
	case 3 : System.out.println("Volte sempre...");
	break;
	}
	
	}
}


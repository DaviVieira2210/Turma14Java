package Banco;

import java.util.Scanner;

public class bancoUnificado {
	
	public static void main(String[] args) {
		
		char opcaoMenu= '0', voltaMenu='0';		
		Scanner leia = new Scanner(System.in);
		do {
			menuPrincipal();
			opcaoMenu = leia.next().charAt(0);
		
			if(opcaoMenu == '1') {//poupança
				System.out.println("foi!");
			
				System.out.println("Dseja voltar ao Menu Principal? [S]-SIM | [N]-NÃO:_");
				voltaMenu=leia.next().toUpperCase().charAt(0);
			}else if(opcaoMenu == '2') {//corrente
			
				System.out.println("Dseja voltar ao Menu Principal? [S]-SIM | [N]-NÃO:_");
				voltaMenu=leia.next().toUpperCase().charAt(0);
			}else if(opcaoMenu == '3') {//especial
			
				System.out.println("Dseja voltar ao Menu Principal? [S]-SIM | [N]-NÃO:_");
				voltaMenu=leia.next().toUpperCase().charAt(0);
			} else if(opcaoMenu == '4') {//empresa
			
				System.out.println("Dseja voltar ao Menu Principal? [S]-SIM | [N]-NÃO:_");
				voltaMenu=leia.next().toUpperCase().charAt(0);
			} else if(opcaoMenu == '5') {//universitaria
			
				System.out.println("Dseja voltar ao Menu Principal? [S]-SIM | [N]-NÃO:_");
				voltaMenu=leia.next().toUpperCase().charAt(0);
			} else if(opcaoMenu == '6') {
				
				System.out.println("Fim de programa!");		
			}else {
				do {
					System.out.println("Por favor, escolha uma opçao válida: ");
					opcaoMenu = leia.next().charAt(0);
				}while(opcaoMenu != '1' && opcaoMenu != '2' && opcaoMenu != '3' && opcaoMenu != '4' && opcaoMenu != '5');
			}
		}while(voltaMenu=='S');
	}
	
	public static void menuPrincipal() {
		linha(20);
		System.out.println();
		System.out.println(" <=== G1 BANK ===> ");
		linha(20);
		System.out.println();
		System.out.println("[1] - CONTA POUPANÇA");
		System.out.println("[2] - CONTA CORRENTE");
		System.out.println("[3] - CONTA ESPECIAL");
		System.out.println("[4] - CONTA EMPRESA");
		System.out.println("[5] - CONTA UNIVERSITÁRIA");
		System.out.println("[6] - SAIR");
		System.out.println("DIGITE A OPÇAO:_");
	}
	
	//faz linha
	public static void linha(int tamanho) {
		for(int x=0; x<tamanho; x++) {
			System.out.print("-");
		}
	}
}



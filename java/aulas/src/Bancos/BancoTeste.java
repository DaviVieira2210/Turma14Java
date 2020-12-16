package Bancos;
import java.util.Scanner;
public class BancoTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA REFERÊNCIA");
		int conta;
		
		System.out.println("DIGITE O NÚMERO DA CONTA:");
		conta = leia.nextInt();
		
		Conta procedimento1 = new Conta(conta);
		
		System.out.println("DIGITE O NÚMERO DA CONTA NOVAMENTE:");
		conta = leia.nextInt();
		
		Conta procedimento2 = new Conta(conta);
	}

}

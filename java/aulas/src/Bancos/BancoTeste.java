package Bancos;
import java.util.Scanner;
public class BancoTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA REFER�NCIA");
		int conta;
		
		System.out.println("DIGITE O N�MERO DA CONTA:");
		conta = leia.nextInt();
		
		Conta procedimento1 = new Conta(conta);
		
		System.out.println("DIGITE O N�MERO DA CONTA NOVAMENTE:");
		conta = leia.nextInt();
		
		Conta procedimento2 = new Conta(conta);
	}

}

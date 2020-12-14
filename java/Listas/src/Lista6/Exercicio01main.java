package Lista6;
import java.util.Scanner;
public class Exercicio01main 
{

	public static void main(String[] args)
	{
				
		Scanner leia = new Scanner (System.in);
		Exercicio01 cliente = new Exercicio01();

		System.out.println("Digite o seu nome: ");
		cliente.nomeCliente = leia.next();
		System.out.println("Digite o seu CPF: ");
		cliente.cpf = leia.next();
		System.out.println("Digite o seu genero [M]Masculino [F]Feminino [O]Outro");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("DADOS DO CLIENTE");
		
		if(cliente.genero == 'M')
		{
		System.out.println("Olá, Sr. "+cliente.nomeCliente);
		System.out.println("Seu CPF é: "+cliente.cpf);
		}
		if(cliente.genero == 'F')
		{
		System.out.println("Olá, Sra. "+cliente.nomeCliente);
		System.out.println("Seu CPF é: "+cliente.cpf);
		}
		if(cliente.genero == 'O')
		{
		System.out.println("Olá, "+cliente.nomeCliente);
		System.out.println("Seu CPF é: "+cliente.cpf);
		}		
	}
	
	
	
}

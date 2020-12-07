
import java.util.Scanner;
public class Oimundo
{
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in); //instanciar = criar
		
		//variaveis
		String nome;
		int anoNascimento;
		
		System.out.println("DIGITE O NOME DO USUARIO:");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento:");
		anoNascimento = leia.nextInt();
		System.out.println("Nome: "+nome );
		System.out.println("Idade: "+(2020-anoNascimento));
		
		
			
		leia.close(); //fecha o teclado
	}
	
	
}
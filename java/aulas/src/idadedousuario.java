import java.util.Scanner;

public class idadedousuario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
	
		int anoNascimento;
	
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		
		System.out.println("Você tem aproximadamente "+ano(anoNascimento)+" ano(s)!");
		
		
	}
	
	public static int ano(int anoNascimento)
	{
	int ano = 2020;
	int idade;
	idade = ano-anoNascimento;
	
	return idade;
	}
}

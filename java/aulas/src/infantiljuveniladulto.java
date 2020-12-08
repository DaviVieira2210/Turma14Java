import java.util.Scanner;

public class infantiljuveniladulto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
	
		int anoNascimento;
	
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		
		if(ano(anoNascimento) <18){
		System.out.println("Oi, você tem aproximadamente "+ano(anoNascimento)+" ano(s) e é da categoria infanto-juvenil" );
		}
		else if(ano(anoNascimento) <=60){
		System.out.println("Oi, você tem aproximadamente "+ano(anoNascimento)+" ano(s) e é da categoria Adulto" );
		}
		else if(ano(anoNascimento) >60){
		System.out.println("Oi, você tem aproximadamente: "+ano(anoNascimento)+" ano(s) e é da categoria Idoso" );
		}
	}
	
	public static int ano(int anoNascimento)
	{
	int ano = 2020;
	int idade;
	idade = ano-anoNascimento;
	
	return idade;
	}
}

package Lista2;

	import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner (System.in);

	
	int numero = 0;
	
	
	System.out.println("Digite um numero: ");
	numero = leia.nextInt();
	
	if((numero%2)==0 && numero <0)
	{
	System.out.println("Voc� digitou um n�mero par negativo!!");
	}
	else if((numero%2)!=0 && numero <0)
	{
	System.out.println("Voc� digitou um n�mero �mpar negativo!!");
	}
	else if(numero == 0)
	{
	System.out.println("Vc digitou o zero!!");
	}
	else if((numero%2)==0 && numero >0)
	{
	System.out.println("Voc� digitou um n�mero par positivo!!");
	}
	else if((numero%2)!=0 && numero >0)
	{
	System.out.println("Voc� digitou um n�mero �mpar positivo!!");
	}
	
	}
}
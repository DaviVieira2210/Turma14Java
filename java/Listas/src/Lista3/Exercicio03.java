package Lista3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int soma = 0;
		int x = 0;
		
		System.out.println("DIGITE UM NUMERO: ");
		numero = leia.nextInt();
		
		do 
		{
			x = x+1;
			soma = 	x + soma;	
			
		}while(x<numero);
		System.out.println(soma);
	}
}

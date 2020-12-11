package Lista5;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("DIGITE UM  NÚMERO: ");
		numero = leia.nextInt();
		
		
		if(numero < 0)
		{
			System.out.println("APENAS NÚMEROS POSITIVOS!");
		}
		else if(numero >= 0 && numero <= 25)
		{
			System.out.println("ESTE NÚMERO ESTÁ NO INTERVALO DE [0-25]");
		}
		else if(numero >= 26 && numero <= 50)
		{
			System.out.println("ESTE NÚMERO ESTÁ NO INTERVALO DE [26-50]");
		}
		else if(numero >= 51 && numero <= 75)
		{
			System.out.println("ESTE NÚMERO ESTÁ NO INTERVALO DE [51-75]");
		}
		else if(numero >= 76 && numero <= 100)
		{
			System.out.println("ESTE NÚMERO ESTÁ NO INTERVALO DE [76-100]");
		}
		else if(numero > 100)
		{
			System.out.println("O NÚMERO NÃO ENTRA NO INTERVALO");
		}
		
		
	}
}

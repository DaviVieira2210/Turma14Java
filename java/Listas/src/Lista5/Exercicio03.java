package Lista5;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("DIGITE UM  N�MERO: ");
		numero = leia.nextInt();
		
		
		if(numero < 0)
		{
			System.out.println("APENAS N�MEROS POSITIVOS!");
		}
		else if(numero >= 0 && numero <= 25)
		{
			System.out.println("ESTE N�MERO EST� NO INTERVALO DE [0-25]");
		}
		else if(numero >= 26 && numero <= 50)
		{
			System.out.println("ESTE N�MERO EST� NO INTERVALO DE [26-50]");
		}
		else if(numero >= 51 && numero <= 75)
		{
			System.out.println("ESTE N�MERO EST� NO INTERVALO DE [51-75]");
		}
		else if(numero >= 76 && numero <= 100)
		{
			System.out.println("ESTE N�MERO EST� NO INTERVALO DE [76-100]");
		}
		else if(numero > 100)
		{
			System.out.println("O N�MERO N�O ENTRA NO INTERVALO");
		}
		
		
	}
}

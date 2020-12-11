package Lista4;

import java.util.Scanner;

public class Exercicioteste2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		int numeros[] = new int[6];
		int numeroUsuario = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i=0; i<6; i++)
		{
			System.out.println("DIGITE UM NÚMERO:  ");
			numeroUsuario = leia.nextInt();
			numeros[i] = numeroUsuario;	
			if(numeroUsuario%2 == 0)
			{
			System.out.println("O número par digitado foi: " + numeroUsuario);	
			somaPares += numeros[i];
			}
			else if(numeroUsuario%2 != 0)
			{
			System.out.println("O número ímpar digitado foi: " + numeroUsuario);
			somaImpares += numeros[i];
			}
		}
		System.out.println("A soma total dos números pares é: "+ somaPares);
		System.out.println("A soma total dos números ímpares é: "+ somaImpares);
		
	}
}

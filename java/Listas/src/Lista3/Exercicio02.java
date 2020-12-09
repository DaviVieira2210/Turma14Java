package Lista3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("DIGITE UM NÚMERO: ");
		numero = leia.nextInt();	
		
		do {
			numero=(numero*3);
			System.out.println(numero);
		}while(numero<100);

	}
}

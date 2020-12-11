package Lista5;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso = 0;
		double altura = 0.0;
		double indiceMassaCorporal;
		
		System.out.println("DIGITE A SUA ALTURA: ");
		altura = leia.nextDouble();
		System.out.println("DIGITE O SEU PESO: ");
		peso = leia.nextInt();
		
		indiceMassaCorporal = peso / (altura*2);

		System.out.printf("%.2f", indiceMassaCorporal);

		if(indiceMassaCorporal < 18.5)
		{
			System.out.println(" - Abaixo do peso");
		}
		else if(indiceMassaCorporal >= 18.5 && indiceMassaCorporal <= 25)
		{
			System.out.println(" - Peso normal");
		}
		else if(indiceMassaCorporal >= 25 && indiceMassaCorporal <= 35)
		{
			System.out.println(" - Acima do peso");
		}
		else if(indiceMassaCorporal > 30)
		{
			System.out.println(" - Obeso");
		}
	}
}

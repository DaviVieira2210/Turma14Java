package Exercicios;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Variáveis
		
		int tempoAnos;
		int tempoMeses;
		int tempoDias;
		
		
		System.out.println("Idade em anos, meses e dias\nAnos");
		tempoAnos = leia.nextInt();
		System.out.println("Meses: ");
		tempoMeses = leia.nextInt();
		System.out.println("Dias: ");
		tempoDias = leia.nextInt();				
		
		int tempoDiasTotal = ((tempoAnos*365)+(tempoMeses*30)+tempoDias);
		System.out.print("Sua idade em dias é: "+ tempoDiasTotal);
		tempoDiasTotal = leia.nextInt();
	}
	
}

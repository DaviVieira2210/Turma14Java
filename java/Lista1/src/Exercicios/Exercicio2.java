package Exercicios;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int fixo = 365;
		int dias, resultado, meses, anos;
		
		System.out.println("Coloque seus dias de vida: ");
		dias = leia.nextInt();
		
		resultado = dias/fixo;
		
		System.out.println(resultado);
		
		meses = resultado/12;
		
		dias = (dias%365)%30;
		System.out.print("Ano(s), "+meses+" mese(s) e "+dias+" dias de vida");
		
	}
}

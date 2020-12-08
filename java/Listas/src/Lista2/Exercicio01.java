package Lista2;

	import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double multa = 4.00;	
		double pesoTomate;		
		double excessoPeso;		
		double formula1;
		double formula2;
		
		System.out.println("insira o peso: ");
		pesoTomate = leia.nextDouble();
		
		formula1 = (pesoTomate-50)*4.0;
		formula2 = (pesoTomate-50);
		
		if(pesoTomate <=50)
		{
		System.out.println("Não hávera multas, pois o peso não foi exedido!!");
		}
		else if(pesoTomate >50)
		{
		System.out.println("O peso foi exedido em "+formula2+ "KG, sua multa será de "+ formula1+ " R$.");
		}
	}
}

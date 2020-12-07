import java.util.Scanner;

public class Celciusparafaren {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		double grausCelsius;
		double grausFahrenheit;
		
		System.out.println("Qual a temperatura°C de hoje? ");
		grausCelsius = leia.nextDouble();
		
		grausFahrenheit = (((grausCelsius*9)/5)+32);
		
		System.out.println("A tempereatura atual em Fahrenheit é: "+ Math.round(grausFahrenheit));
	}
	
}

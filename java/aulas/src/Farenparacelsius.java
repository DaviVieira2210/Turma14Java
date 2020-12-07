import java.util.Scanner;

public class Farenparacelsius {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double grausCelsius;
		double grausFahrenheit;
		
		System.out.println("qual a temperatura°F de hoje? ");
		grausFahrenheit = leia.nextDouble();
		
		grausCelsius = ((grausFahrenheit-32)/1.8);
		
		System.out.println("A temperatura de hoje em °C é: "+ Math.round(grausCelsius));
	}
}

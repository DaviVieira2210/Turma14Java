package Lista1;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double valorCarro;
		double valorConsumidor;
		double valorDistribuidor;
		double valorImposto;
		
		System.out.println("Qual o valor do carro? ");
		valorCarro = leia.nextDouble();
		
		valorDistribuidor = valorCarro * 0.28;
		
		valorImposto = valorCarro * 0.45;
		
		valorConsumidor = valorCarro + valorImposto + valorDistribuidor;
		
		System.out.println("O valor total do carro é: "+ Math.round(valorConsumidor));		
		
	}
}

package Lista6;
import java.util.Scanner;
public class Exercicio02main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Exercicio02 aviao = new Exercicio02("Branco", "Boeing 737");
		
		System.out.println("Digite a velocidade atual do avi�o: ");
		aviao.velocidadeAtual = leia.nextDouble();
		System.out.println("Digite a velocidade m�xima do aviao :");
		aviao.velocidadeMaxima = leia.nextDouble();
		
		System.out.println("A cor do avi�o �: "+aviao.corAviao);
		System.out.println("O modelo do avi�o �: "+aviao.modeloAviao);
		System.out.println("A velocidade atual do avi�o �: "+aviao.velocidadeAtual+" Km|h");
		System.out.println("A velocidade m�xima do avi�o �: "+aviao.velocidadeMaxima+" Km|h");
	}
}

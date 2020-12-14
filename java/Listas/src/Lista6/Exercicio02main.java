package Lista6;
import java.util.Scanner;
public class Exercicio02main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Exercicio02 aviao = new Exercicio02("Branco", "Boeing 737");
		
		System.out.println("Digite a velocidade atual do avião: ");
		aviao.velocidadeAtual = leia.nextDouble();
		System.out.println("Digite a velocidade máxima do aviao :");
		aviao.velocidadeMaxima = leia.nextDouble();
		
		System.out.println("A cor do avião é: "+aviao.corAviao);
		System.out.println("O modelo do avião é: "+aviao.modeloAviao);
		System.out.println("A velocidade atual do avião é: "+aviao.velocidadeAtual+" Km|h");
		System.out.println("A velocidade máxima do avião é: "+aviao.velocidadeMaxima+" Km|h");
	}
}

package Lista6;
import java.util.Scanner;
public class Exercicio03main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double resultado = 0;
		
		
		Exercicio03 produto1 = new Exercicio03 ("Mouse Gamer", 250.00,"Teclado e Mouse",50, "DVS01");
		Exercicio03 produto2 = new Exercicio03 ("Teclado Gamer", 550.00,"Teclado e Mouse",25, "DVS02");
		Exercicio03 produto3 = new Exercicio03 ("Cadeira Gamer", 1550.00,"Cadeiras",10, "DVS03");
		Exercicio03 produto4 = new Exercicio03 ("RTX 3090", 15550.00,"Placas de Vídeo",7, "DVS04");
		
		
		System.out.println("CÓDIGO DE PRODUTOS");
		System.out.println(produto1.nomeProduto+"  -  "+produto1.codigoProduto);
		System.out.println(produto2.nomeProduto+"  -  "+produto2.codigoProduto);
		System.out.println(produto3.nomeProduto+"  -  "+produto3.codigoProduto);
		System.out.println(produto4.nomeProduto+"  -  "+produto4.codigoProduto);
		
		System.out.println("\nDIGITE UM CÓDIGO DE PRODUTO:");
		System.out.print("DVS0");
		codigo = leia.nextInt();
		
		System.out.println("DIGITE A QUANTIDADE:");
		
		quantidade = leia.nextInt();
		
		
		if(codigo == 1)
		{			
			resultado = produto1.precoProduto * quantidade;
			System.out.printf("O PREÇO TOTAL É: R$%.2f",resultado);
		}
		else if(codigo == 2)
		{
			resultado = produto2.precoProduto * quantidade;
			System.out.printf("O PREÇO TOTAL É: R$%.2f",resultado);
		}
		else if(codigo == 3)
		{
			resultado = produto3.precoProduto * quantidade;
			System.out.printf("O PREÇO TOTAL É: R$%.2f",resultado);
		}
		else if(codigo == 4)
		{
			resultado = produto4.precoProduto * quantidade;
			System.out.printf("O PREÇO TOTAL É: R$%.2f",resultado);
		}
		else {
			System.out.println("BUND");
		}
	}
}

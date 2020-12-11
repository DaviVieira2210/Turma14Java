package Lista5;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double valorProduto;
		char formaPagamento;
		double dinheiro;
		double cheque;
		double cartaoCredito;
		double precoEtiquetaNormal;
		double precoEtiquetaParcelado;
		double valorFinal=0.0;
		double valorParcela;
		
		linha();
		pula();
		System.out.println("     MERCADINHO DAVI'S");
		linha();
		pula();
		System.out.println("DIGITE O VALOR DO PRODUTO: R$");
		valorProduto = leia.nextDouble();
		pula();
		System.out.println("QUAL SERÁ A FORMA DE PAGAMENTO?");
		pula();
		System.out.println("[D]►DINHERO");
		System.out.println("[C]►CHEQUE");
		System.out.println("[A]►À VISTA NO CRÉDITO");
		System.out.println("[2]►PARCELADO EM DUAS VEZES");
		System.out.println("[3]►PARCELADO EM TRÊS VEZES");
		pula();
		System.out.println("ESCOLHA UMA FORMA DE PAGAMENTO: ");
		formaPagamento = leia.next().toUpperCase().charAt(0);
		
		
		if(formaPagamento == 'D')
		{
			valorFinal = valorProduto - valorProduto * 0.2;
		}
		else if(formaPagamento == 'C')
		{
			valorFinal = valorProduto - valorProduto * 0.2;
		}
		else if(formaPagamento == 'A')
		{
			valorFinal = valorProduto - valorProduto * 0.15;
		}
		else if(formaPagamento == '2')
		{
			valorFinal = valorProduto;
		}
		else if(formaPagamento == '3')
		{
			valorFinal = valorProduto + valorProduto * 0.1 * 3;
			valorParcela = valorFinal / 3;
			System.out.printf("O VALOR DAS PARCELAS MENSAIS: R$%.2f", valorParcela);
		}
		pula();
		System.out.println("O VALOR TOTAL DO PRODUTO É R$ "+ valorFinal);
		valorFinal = leia.nextDouble();
		pula();
	}
	public static void linha() {
		
		int tamanho = 15;
		for(int x = 1;x<=tamanho;x++)	
		System.out.print("🛒");
	}
	public static void pula() {
		System.out.println();
	}
}

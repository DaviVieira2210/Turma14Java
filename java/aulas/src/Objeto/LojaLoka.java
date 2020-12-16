package Objeto;
import java.util.Scanner;
public class LojaLoka
{
	public static void main(String[] args)
	{
		
		Pessoa clienteAvulso = new Pessoa();
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		Produto produto = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Produto produto4 = new Produto();
		
		
		produto.nomeProduto = "Vestido";
		produto.qtdeProduto = 3;
		
		
		
		clienteAvulso.nome = "EDNILSON";
		clienteAvulso.genero = 'M';
		clienteAvulso.anoNascimento = 1974;
		
		/*public String produto = "Vestido";
		public int qtde = 3;
		public double valor = 100.00;
		
		String produto2 = "Blusa";
		public int qtde2 = 1 ;
		public double valor2 = 50.00;
		
		String produto3 = "Camiseta";
		public int qtde3 = 20;
		public double valor3 = 20.00;*/
		
		
		
		//String produto = "Vestido";
		//int qtde = 10;
		//double valorProduto = 100.00;
		
		// a classe se chamar Produto
		//nomeProduto
		//qtdeEstoque
		//valorUnitario
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camiseta - 20,00 - 20 em estoque
		// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
		
		
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("Bom dia %s !!!\n", cliente.nome);
		//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
		//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);
		
	/*	System.out.println("Qual produto deseja comprar? ");
		produto = leia.next();
		System.out.println(produto.produto);
		System.out.println(produto.produto2);
		System.out.println(produto.produto3);*/
		
		
		
	}
}
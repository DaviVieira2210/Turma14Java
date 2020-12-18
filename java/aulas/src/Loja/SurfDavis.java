package Loja;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SurfDavis{

	public static void main(String[] args) {
		
		String codigo;
		int quantidade;
		Double totalPagamento = 0.00;
		char opcaoCompra;
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Cliente();
		
		List<Produto> listaProdutos = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		
		listaProdutos.add(new Produto("CAMISETA ADIDAS", "DSV01", 95.00, 10));
		listaProdutos.add(new Produto("SHORT TACTEL", "DSV02", 59.99, 10));
		listaProdutos.add(new Produto("MIZUNO PROPHECY 9", "DSV03", 999.99, 10));
		listaProdutos.add(new Produto("BONÉ LACOSTE", "DSV04", 259.99, 10));
		listaProdutos.add(new Produto("MALA NIKE", "DSV05	", 179.99, 10));
		listaProdutos.add(new Produto("BOLA DE BASQUETE", "DSV06", 99.90, 10));
		listaProdutos.add(new Produto("RAQUETE DE TÊNIS", "DSV07", 1299.00, 10));
		listaProdutos.add(new Produto("BOLA DE FUTEBOL", "DSV08", 259.99, 10));
		listaProdutos.add(new Produto("VISEIRA", "DSV09", 129.99, 10));
		listaProdutos.add(new Produto("ÓCULOS DE SOL", "DSV10", 50.00, 10));

		
			linha();
			System.out.println(" \n        SURF DAVI'S");
			System.out.println("�?༺ Qualidade para você ༻꧂");
			linha();
			pula();
			System.out.println("           MENU");
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			linha();
			int tipo = leia.nextInt();

			if (tipo == 1) {
				System.out.println("DIGITE O SEU NOME: ");
				cliente.setNome(leia.next());
				System.out.println("DIGITE O SEU CPF: ");
				String cpf = leia.next();
				System.out.println("DIGITE A SEU ANO DE NASCIMENTO: ");
			  	cliente.setAnoNascimento(leia.nextInt());
				System.out.println("GENERO DO CLIENTE [M]-Masculino [F]-Feminino [O]-Outros :");
				cliente.setGenero(leia.next().toUpperCase().charAt(0));				
				if (cliente.getGenero() == 'M') 
				{
					System.out.println("SEJA BEM-VINDO À LOJA SURF DAVI'S SR. " + cliente.getNome()+"!");
				} 
				else if(cliente.getGenero() == 'F') 
				{
					System.out.println("SEJA BEM-VINDA À LOJA SURF DAVI'S SRA. " + cliente.getNome()+"!");
				}
				else if(cliente.getGenero() == 'O')
				{
					System.out.println("SEJA BEM-VINDE À LOJA SURF DAVI'S. "+ cliente.getNome()+"!");
				}
				linha();
				pula();
				Cliente cliente1 = new Cliente(cliente.getNome(), cpf, cliente.getAnoNascimento());
				
				trataGenero(cliente.getNome(), cliente.getGenero());
				imprimiListaProdutos(listaProdutos);
				
				do {
				System.out.println("DIGITE O CÓDIGO DO PRODUDO DESEJADO: ");
				codigo = leia.next().toUpperCase();
				System.out.println("DIGITE A QUANTIDADE DESEJADA: ");
				quantidade = leia.nextInt();
				linha();
				for(Produto produtos : listaProdutos){
					if(codigo.equals(produtos.getCodigo()));
						if(quantidade <= produtos.getQtdeProdutoEstoque()) {
							totalPagamento += produtos.venda(quantidade);
							carrinho.add(new Produto(produtos.getNomeProduto(), produtos.getCodigo(), produtos.getPrecoUnitario(), quantidade));
						}else {
							System.out.println("QUANTIDADE INDISPONÍVEL");
						}
					}
				System.out.println("DESEJA CONTINUAR COMPRANDO? [S]-SIM [N]-NÃO");
				opcaoCompra = leia.next().toUpperCase().charAt(0);
				}while(opcaoCompra == 'N');	
			}		
		}

	private static void trataGenero(String nome, char genero) {
		// TODO Auto-generated method stub
		
	}

	private static void imprimiListaProdutos(List<Produto> listaProdutos) {
		// TODO Auto-generated method stub
		
	}

	public static void linha() {
		
		int tamanho = 15;
		for(int x = 1;x<=tamanho;x++)	
		System.out.print("🏄");
	}

	public static void pula() {
		System.out.println("\n");
	}
}
	
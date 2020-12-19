package Loja;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurfDavis{

	public static void main(String[] args) {
		
		String codigo, cpf = null;
		int quantidade, tipo, anoNascimento = 0, formaPagamento;
		Double precoTotal = 0.00, parcelas = 0.00;
		char opcaoCompra;
		
		Scanner leia = new Scanner(System.in);
		Cliente person = new Cliente();
		
		List<Produto> listaProdutos = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();

		listaProdutos.add(new Produto("CAMISETA NIKE", "DSV01", 115.99, 10));
		listaProdutos.add(new Produto("SHORT TACTEL", "DSV02", 119.99, 10));
		listaProdutos.add(new Produto("MIZUNO PRO 6 ", "DSV03", 999.99, 10));
		listaProdutos.add(new Produto("BONÉ LACOSTE", "DSV04", 259.99, 10));
		listaProdutos.add(new Produto("MALA - NIKE", "DSV05", 179.99, 10));
		listaProdutos.add(new Produto("BOLA/BASQUETE", "DSV06", 149.99, 10));
		listaProdutos.add(new Produto("RAQUETE/TÊNIS", "DSV07", 1299.00, 10));
		listaProdutos.add(new Produto("BOLA/FUTEBOL", "DSV08", 259.99, 10));
		listaProdutos.add(new Produto("VISEIRA BLACK", "DSV09", 129.99, 10));
		listaProdutos.add(new Produto("ÓCULOS DE SOL", "DSV10", 145.99, 10));

		
			linha();
			System.out.println(" \n\t   SURF DAVI'S");
			System.out.println("\t🌊 𝙦𝙪𝙖𝙡𝙞𝙩𝙮 𝙛𝙤𝙧 𝙮𝙤𝙪 🌊");
			linha();
			pula();
			System.out.println("           MENU");
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			linha();
			tipo = leia.nextInt();
	
			if (tipo == 1) {
				//Cliente client = new Cliente(person.getNome(), cpf, anoNascimento);
				System.out.println("Digite o seu nome: ");
				person.setNome(leia.next());
				System.out.println("Digite o seu CPF: ");
				cpf = leia.next();
				person.corrigeCpf(cpf);
				System.out.println("Digite o seu ano de nascimento: ");
				person.setAnoNascimento(leia.nextInt()); 
				System.out.println("Sua idade: "+person.voltaIdade(2020)+" anos");
				System.out.println("[M]-Masculino [F]-Feminino [O]-Outros :");
				person.setGenero(leia.next().toUpperCase().charAt(0));						
				if (person.getGenero() == 'M') 
				{
					System.out.println("Seja Bem-Vindo à loja SURF DAVI'S Sr. " + person.getNome()+"!");
				} 
				else if(person.getGenero() == 'F') 
				{
					System.out.println("Seja Bem-Vinda à loja SURF DAVI'S Sra. " + person.getNome()+"!");
				}
				else if(person.getGenero() == 'O')
				{
					System.out.println("Seja Bem-Vinde à loja SURF DAVI'S Sr*. "+ person.getNome()+"!");
				}
				pula();
				linha();
				pula();			
				System.out.println("\tLISTA DE PRODUTOS 🌊");
				System.out.println("   PRODUTO\tCODIGO\t  PREÇO\t    UNDS");
				
				for(int i=0;i<10;i++)
				{	
				System.out.println(listaProdutos.get(-1+(i+1)));				
				}	
				
				do {
				System.out.println("Digite o código do produto desejado: ");
				codigo = leia.next().toUpperCase();							
				System.out.println("Digite a quantidade desejada: ");
				quantidade = leia.nextInt();
				linha();
				for(Produto prod: listaProdutos)
				{
					if(codigo.equals(prod.getCodigo()))
					{
						pula();
						System.out.print("UNID "+prod.getNomeProduto());
						System.out.printf("  R$%.2f",prod.getPrecoUnitario());
						precoTotal = prod.getPrecoUnitario() * quantidade;
						System.out.printf("PREÇO TOTAL: R$%.2f", precoTotal);
						pula();
						
					}
				}
				System.out.println("[1] - PAGAMENTO A VISTA - 10%");
				System.out.println("[2] - DEBITO - VALOR SIMPLES");
				System.out.println("[3] - CREDITO COM 5% A MAIS");
				System.out.println("[4] - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS");
				formaPagamento = leia.nextInt();
				
				if(formaPagamento == 1)
				{
					precoTotal -= precoTotal * 0.10;
					System.out.println("PAGAMENTO À VISTA");
				}
				else if(formaPagamento == 2)
				{
					precoTotal = precoTotal;
					System.out.println("PAGAMENTO À DEBITO");
					System.out.println("PREÇO TOTAL R$%.2f"+ precoTotal);
				}
				else if(formaPagamento == 3)
				{
					precoTotal = precoTotal * 1.05;
					System.out.println("CREDITO COM 5% A MAIS");
					System.out.println("PREÇO TOTAL R$%.2f"+ precoTotal);
				}
				else if(formaPagamento == 4)
				{
					precoTotal += precoTotal * 0.1 * 3;
					parcelas = precoTotal / 3;
					System.out.println("CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS");
					System.out.println("PREÇO TOTAL DAS PARCELASR$%.2f"+parcelas );
				}
				System.out.printf("Valor dos Impostos: R$%.2f",precoTotal*0.09);
				
				
				
				
				linha();
				pula();
				System.out.println("Deseja continuar Comprando? [S]-SIM [N]-NÃO");
				opcaoCompra = leia.next().toUpperCase().charAt(0);
				if(opcaoCompra == 'N')
				{	
					linha();
					pula();
					System.out.println("\tCARRINHO DE COMPRAS");
					
					
				}
				}while(opcaoCompra == 'S');	
			}
			else if(tipo == 2)
			{
				System.out.println("working in progress");
			}
			else if(tipo == 3)
			{
				System.out.println("Obrigado por escolher à SURF DAVI'S");
				System.out.println("Volte sempre!");
			}
		}
	public static void linha() {
		
		int tamanho = 18;
		for(int x = 1;x<=tamanho;x++)	
		System.out.print("🏄");
	}
	public static void pula() {
		System.out.println("\n");
	}
}
	
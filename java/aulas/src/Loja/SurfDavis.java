package Loja;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurfDavis{

	public static void main(String[] args) {
		
		Double precoTotal = 0.00, parcelas = 0.00;
		String codigo, cpf = null;
		int quantidade = 0, tipo, anoNascimento = 0, formaPagamento;
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
		listaProdutos.add(new Produto("RAQUETE/TÊNIS", "DSV07", 129.00, 10));
		listaProdutos.add(new Produto("BOLA/FUTEBOL", "DSV08", 259.99, 10));
		listaProdutos.add(new Produto("VISEIRA BLACK", "DSV09", 129.99, 10));
		listaProdutos.add(new Produto("ÓCULOS DE SOL", "DSV10", 145.99, 10));

		
			linha();
			System.out.println("\n\t\tSURF DAVI'S");
			System.out.println("\t   🌊 𝙦𝙪𝙖𝙡𝙞𝙩𝙮 𝙛𝙤𝙧 𝙮𝙤𝙪 🌊");
			linha();
			pula();
			System.out.println("\t\t   MENU");
			System.out.println("	[1] - COMPRAR PRODUTOS");
			System.out.println("	[2] - GERENCIAR ESTOQUE");
			System.out.println("	[3] - SAIR");
			linha();
			tipo = leia.nextInt();
	
			if (tipo == 1) {
				//Cliente client = new Cliente(person.getNome(), cpf, anoNascimento);
				System.out.println("DIGITE SEU NOME: ");
				person.setNome(leia.next());
				System.out.println("DIGITE O SEU CPF: ");
				cpf = leia.next();
				person.corrigeCpf(cpf);
				System.out.println("DIGITE O SEU ANO DE NASCIMENTO: ");
				person.setAnoNascimento(leia.nextInt()); 
				System.out.println("SUA IDADE: "+person.voltaIdade(2020)+" ANOS");
				System.out.println("[M]-Masculino [F]-Feminino [O]-Outros :");
				person.setGenero(leia.next().toUpperCase().charAt(0));						
				if (person.getGenero() == 'M') 
				{
					System.out.println("SEJA BEM-VINDO À LOJA SURF DAVI'S SR. " + person.getNome()+"!");
				} 
				else if(person.getGenero() == 'F') 
				{
					System.out.println("SEJA BEM-VINDA À LOJA SURF DAVI'S SRA."+ person.getNome()+"!");
				}
				else if(person.getGenero() == 'O')
				{
					System.out.println("SEJA BEM-VINDE À LOJA SURF DAVI'S SR.* "+ person.getNome()+"!");
				}
				pula();
				linha();
				pula();			
				System.out.println("\tLISTA DE PRODUTOS 🌊");
				System.out.println("   PRODUTO\tCODIGO\t  PREÇO\t   UNDS");
				do {
				for(Produto prod: listaProdutos)
				{	
				System.out.printf("|%s\t|%s\t|R$%.2f  |%d\n",prod.getNomeProduto(), prod.getCodigo(), prod.getPrecoUnitario(), 
						prod.getQtdeProdutoEstoque());				
				}	
				
				
				System.out.println("DIGITE O CÓDIGO DO PROODUTO DESEJADO: ");
				codigo = leia.next().toUpperCase();							
				System.out.println("DIGITE A QUANTIDADE DESEJADA: ");
				quantidade = leia.nextInt();
				linha();								
				pula();
				System.out.println("DESEJA CONTINUAR COMPRANDO? [S]-SIM [N]-NÃO");
				opcaoCompra = leia.next().toUpperCase().charAt(0);
				if(opcaoCompra == 'N')
				{	
					linha();
					pula();
					System.out.println("\tCARRINHO DE COMPRAS");
					for(Produto prod: listaProdutos)
					{
						if(quantidade > prod.getQtdeProdutoEstoque())
						{
							System.out.println("QUANTIDADE INDISPONÍVEL");
							System.out.println("DESEJA CONTINUAR COMPRANDO? [S]-SIM [N]-NÃO");
							opcaoCompra = leia.next().toUpperCase().charAt(0);
						}
						if(codigo.equals(prod.getCodigo()))
						{
							System.out.print("PREÇO UNITÁRIO: "+prod.getNomeProduto());
							System.out.printf("  R$%.2f\n",prod.getPrecoUnitario());
							precoTotal = prod.getPrecoUnitario() * quantidade;
							System.out.printf("PREÇO TOTAL: R$%.2f", precoTotal);
							pula();
							carrinho.add(new Produto(prod.getNomeProduto(), prod.getCodigo(), prod.getPrecoUnitario(), prod.getQtdeProdutoEstoque()));
						}
					}
					System.out.println("[1] - PAGAMENTO À VISTA - DESCONTO DE 10%");
					System.out.println("[2] - DEBITO - VALOR SIMPLES");
					System.out.println("[3] - CREDITO - ACRESCIMO DE 5%");
					System.out.println("[4] - CREDITO [ATÉ 3 VEZES] - JUROS DE 10%");
					formaPagamento = leia.nextInt();
					
					if(formaPagamento == 1)
					{
						System.out.println("CPF NA NOTA? S/N");
						char cpfnota = leia.next().toUpperCase().charAt(0);
						if(cpfnota == 'S')
						{
							System.out.println("╔═════════════════════════╗");
							System.out.println("║ NOTA FISCAL Nº 18202012 ║");
							System.out.println("║                         ║ ");
							System.out.printf ("║ CPF CLIENTE:%s          ║\n",cpf);
							precoTotal -= precoTotal * 0.10;
							System.out.println("║PAGAMENTO À VISTA        ║");
							System.out.printf(" ║PREÇO TOTAL R$%.2f       ║", precoTotal);
							System.out.printf(" ║IMPOSTOS: R$%.2f         ║\n",precoTotal*0.09);
							System.out.println("║                         ║");
							System.out.println("║      ║|║|║║||║║|║║||    ║");
							System.out.println("║       568754456745      ║");
							System.out.println("╚═════════════════════════╝");
						}
					}
					else if(formaPagamento == 2)
					{
						precoTotal = precoTotal;
						System.out.println("PAGAMENTO NO DEBITO");
						System.out.printf("PREÇO TOTAL R$%.2f\n", precoTotal);
					}
					else if(formaPagamento == 3)
					{
						precoTotal = precoTotal * 1.05;
						System.out.println("PAGAMENTO NO CRÉDITO");
						System.out.printf("PREÇO TOTAL R$%.2f\n", precoTotal);
						
					}
					else if(formaPagamento == 4)
					{
						System.out.println("CREDITO EM ATÉ 3 VEZES");
						System.out.println("DESEJA PARCELAR EM QUANTAS VEZES?");
						int parcelaVezes = leia.nextInt();
						if(parcelaVezes <= 3 && parcelaVezes >0)
						{
							precoTotal += precoTotal * 0.1 * parcelaVezes;
							parcelas = precoTotal / parcelaVezes;
							System.out.printf("PREÇO TOTAL DAS PARCELASR$%.2f\n",parcelas);
						}
						else if(parcelaVezes <=0)
						{
							System.out.println("NÚMERO DE PARCELAS INVÁLIDO");
							System.out.println("DESEJA CONTINUAR COMPRANDO? [S]-SIM [N]-NÃO");
							opcaoCompra = leia.next().toUpperCase().charAt(0);
						}
								
					}
					System.out.printf("IMPOSTOS: R$%.2f",precoTotal*0.09);
					
					
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
		
		int tamanho = 20;
		for(int x = 1;x<=tamanho;x++)	
		System.out.print("🏄");
	}
	public static void pula() {
		System.out.println("\n");
	}
}
	
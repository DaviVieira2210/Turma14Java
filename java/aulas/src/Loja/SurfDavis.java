package Loja;
import java.util.Scanner;
public class SurfDavis{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Cliente();
		Cliente clnt = new Cliente();
		Produto prod = new Produto();
		
		Produto camiseta = new Produto("CAMISETA ADIDAS", "DSV01", 95.00, 10);
		Produto shortTactel = new Produto("SHORT TACTEL", "DSV02", 59.99, 10);
		Produto tenis = new Produto("MIZUNO PROPHECY 9", "DSV03", 999.99, 10);
		Produto bone = new Produto("BONÉ LACOSTE", "DSV04", 259.99, 10);
		Produto mala = new Produto("MALA NIKE", "DSV05	", 179.99, 10);
		Produto bolabasquete = new Produto("BOLA DE BASQUETE", "DSV06", 99.90, 10);
		Produto raquete = new Produto("RAQUETE DE TÊNIS", "DSV07", 1299.00, 10);
		Produto bolafutebol = new Produto("BOLA DE FUTEBOL", "DSV08", 259.99, 10);
		Produto viseira = new Produto("VISEIRA", "DSV09", 129.99, 10);
		Produto oculos = new Produto("ÓCULOS DE SOL", "DSV10", 50.00, 10);

		
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
				clnt.CorrigeCpf(leia.next());
				System.out.println("DIGITE A SEU ANO DE NASCIMENTO: ");
				clnt.setAnoNascimento(leia.nextInt());
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
				
				System.out.println("\tNOME\t\tCÓDIGO\tPREÇO\tQTDE");
				System.out.printf("%s\t\t%s\t%.2f\t%d\n",camiseta.getNomeProduto(), camiseta.getCodigo(), camiseta.getPrecoUnitario(), camiseta.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t%s\t%.2f\t%d\n",shortTactel.getNomeProduto(), shortTactel.getCodigo(), shortTactel.getPrecoUnitario(), shortTactel.getQtdeProdutoEstoque());
				System.out.printf("%s\t%s\t%.2f\t%d\n",tenis.getNomeProduto(), tenis.getCodigo(), tenis.getPrecoUnitario(), tenis.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t%s\t%.2f\t%d\n",bone.getNomeProduto(), bone.getCodigo(), bone.getPrecoUnitario(), bone.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t%s%.2f\t%d\n",mala.getNomeProduto(), mala.getCodigo(), mala.getPrecoUnitario(), mala.getQtdeProdutoEstoque());
				System.out.printf("%s\t%s\t%.2f\t%d\n",bolabasquete.getNomeProduto(), bolabasquete.getCodigo(), bolabasquete.getPrecoUnitario(), bolabasquete.getQtdeProdutoEstoque());
				System.out.printf("%s\t%s\t%.2f\t%d\n",raquete.getNomeProduto(), raquete.getCodigo(), raquete.getPrecoUnitario(), raquete.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t%s\t%.2f\t%d\n",bolafutebol.getNomeProduto(), bolafutebol.getCodigo(), bolafutebol.getPrecoUnitario(), bolafutebol.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t\t%s\t%.2f\t%d\n",viseira.getNomeProduto(), viseira.getCodigo(), viseira.getPrecoUnitario(), viseira.getQtdeProdutoEstoque());
				System.out.printf("%s\t\t%s\t%.2f\t%d\n",oculos.getNomeProduto(), oculos.getCodigo(), oculos.getPrecoUnitario(), oculos.getQtdeProdutoEstoque());
				
				System.out.println("DIGITE O CÓDIGO DO PRODUDO DESEJADO: ");
				prod.setCodigo(leia.next());
				System.out.println("DIGITE A QUANTIDADE DESEJADA: ");
				
				
			}
			
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
	
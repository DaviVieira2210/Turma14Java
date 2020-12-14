package Lista6;

public class Exercicio03 {

	public String nomeProduto;
	public static double precoProduto;
	public String categoria;
	public int qtde;
	public String codigoProduto;

	
	public Exercicio03()
	{
		super();
	}
	public Exercicio03(String nomeProduto)
	{
		super();
		this.nomeProduto = nomeProduto;
	}
	public Exercicio03(String nomeProduto, double precoProduto) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}
	public Exercicio03(String nomeProduto, double precoProduto, String categoria) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.categoria = categoria;
	}

	public Exercicio03(String nomeProduto, double precoProduto, String categoria, int qtde) 
	{
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.categoria = categoria;
		this.qtde = qtde;
	}
	public Exercicio03(String nomeProduto, double precoProduto, String categoria, int qtde, String codigoProduto)
	{
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.categoria = categoria;
		this.qtde = qtde;
		this.codigoProduto = codigoProduto;
	}

}

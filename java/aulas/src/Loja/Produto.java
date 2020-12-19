package Loja;

public class Produto 
{
	//ATRIBUTOS
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	//Construtor
	public Produto(String nomeProduto, String codigo, double precoUnitario) 
	{
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}
	
	//Sobrecarga
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	//Encapsulamento
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	//Métodos
	public void tiraEstoque(int saida) 
	{
		if (testarEstoque(saida))
		{
			//this.qtdeProdutoEstoque = this.qtdeProdutoEstoque - saida;
			this.qtdeProdutoEstoque -= saida;
		}
		else 
		{
			System.out.println("ESTOQUE INDISPONIVEL");
		}
		
	}
	
	public void adicionaEstoque(int entrada) 
	{
		
		this.qtdeProdutoEstoque += entrada;
	}
	
	public boolean testarEstoque(int valor) 
	{
		
		if (valor > this.qtdeProdutoEstoque) 
		{
			return false;
		}
		else if (valor == 0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque == 0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque < 0)
		{
			return false;
		}
		else	
		{
			return true;
		}
		
	}
	
	
	public double venda(int qtdeVendida) 
	{
		
		if (testarEstoque(qtdeVendida))
		{
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		
		} 
		else 
		{
			System.out.println("Venda negada!!!");
			return 0;
		}
	
	
	}

	@Override
	public String toString() {
		return "|"+nomeProduto + "\t|" + codigo + "\t|R$" + precoUnitario
				+ "   |" + qtdeProdutoEstoque ;
	}
	
	
}
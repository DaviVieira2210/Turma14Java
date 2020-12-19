package Loja;

public class Cliente extends Pessoa{

	private String cpf;


	
	//Contrutores
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	public Cliente(String nome, char genero, int anoNascimento) {
		super(nome, genero, anoNascimento);
		
	}
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public Cliente() {
		super();
	}

	
	//Getters and Setters
	

	public Cliente(String nome, String cpf, int anoNascimento) {
		// TODO Auto-generated constructor stub
	}
	public String getCpf() {
		return cpf;
	}
	public void CorrigeCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	//Método Corrige cpf
	
	public void corrigeCpf(String cpf)
	{
		if(cpf == "0")
		{
			System.out.println("O CPF digitado está incorreto!");
		}
	}
}

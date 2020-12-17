package Loja;

public class Cliente extends Pessoa{

	private String cpf;


	
	//Contrutores
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public Cliente() {
		super();
	}

	
	//Getters and Setters
	

	public String getCpf() {
		return cpf;
	}
	public void CorrigeCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	//Método
	
	//Corrige cpf


}

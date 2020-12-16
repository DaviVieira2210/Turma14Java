package Lista7;

public class Exercicio01 {

	protected String nomePessoa;
	protected int idadePessoa;
	protected char genero;
	protected String endereço;
	protected String telefone;
	
	
	
	
	public Exercicio01() {
		super();
	}

	public Exercicio01(String nomePessoa) {
		super();
		this.nomePessoa = nomePessoa;
	}

	public Exercicio01(String nomePessoa, int idadePessoa) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
	}

	public Exercicio01(String nomePessoa, int idadePessoa, char genero) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.genero = genero;
	}

	public Exercicio01(String nomePessoa, int idadePessoa, char genero, String endereço) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.genero = genero;
		this.endereço = endereço;
	}

	public Exercicio01(String nomePessoa, int idadePessoa, char genero, String endereço, String telefone) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.genero = genero;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	
}

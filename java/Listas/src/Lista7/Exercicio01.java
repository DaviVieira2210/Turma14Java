package Lista7;

public class Exercicio01 {

	protected String nomePessoa;
	protected int idadePessoa;
	protected char genero;
	protected String endere�o;
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

	public Exercicio01(String nomePessoa, int idadePessoa, char genero, String endere�o) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.genero = genero;
		this.endere�o = endere�o;
	}

	public Exercicio01(String nomePessoa, int idadePessoa, char genero, String endere�o, String telefone) {
		super();
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.genero = genero;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	
}

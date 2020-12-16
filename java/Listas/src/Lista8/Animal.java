package Lista8;

public class Animal {
	
	private String cor;
	private String nome;
	private int idade;
	private boolean emitiSom;
	private char testeCorre;
	
	
	//Getters and Setters
	
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean isEmitiSom() {
		return emitiSom;
	}


	public void setEmitiSom(boolean emitiSom) {
		this.emitiSom = emitiSom;
	}
	
	
	//Construtor
	
	public Animal(String cor, String nome, int idade, boolean emitiSom)
	{
		super();
		this.cor = cor;
		this.nome = nome;
		this.idade = idade;
		this.emitiSom = emitiSom;
	}

	//Método1
	public boolean setanimalcorre (char testeCorre)
	{
		boolean corre = false;
		if(testeCorre == 'S' )
		{			
			corre = true;
			System.out.println("O ANIMAL CORRE? "+ corre);
		}
		else if(testeCorre == 'N')
		{			
			corre = false;
			System.out.println("O ANIMAL CORRE?"+ corre);
		}
	return corre;
	}
	//Método2
	public boolean animalEmitiSom(char emitiSom)
	{
		boolean som = false;
		if(emitiSom == 'S')
		{			
			som = true;
			System.out.println("O ANIMAL PRODUZ SOM?"+ som);
		}
		else if(emitiSom == 'N')
		{			
			som = false;
			System.out.println("O ANIMAL PRODUZ SOM?"+ som);
		}
		return som;
	}
	
	
}

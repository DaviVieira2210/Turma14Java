package Loja;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Pessoa {
	
	Calendar ano = GregorianCalendar.getInstance();
	
	private String nome;
	private char genero;
	private int anoNascimento;
	private int anoAtual = ano.get(Calendar.YEAR);

	
	//Construtores
	
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}


	public Pessoa(String nome, char genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public Pessoa(char genero)
	{
		super();
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	public Pessoa() {
		super();
	}




	
	
	//Getters and Setters
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento)
	{
		this.anoNascimento = anoNascimento;
	}


	/*public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}*/
	
	//Método
	
	public int voltaIdade(int anoAtual)
    {

        return anoAtual - this.anoNascimento;
    }
	
}

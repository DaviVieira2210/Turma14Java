package Lista7;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio05main extends Exercicio05 {

	 static Locale real = new Locale("pt", "BR");
	 static NumberFormat n = NumberFormat.getCurrencyInstance(real);
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String sexo;
		
		
		Exercicio05 opera = new Exercicio05();
		
		System.out.println("DIGITE O SEU NOME: ");
		opera.nomePessoa = leia.next();
		System.out.println("DIGITE A SUA IDADE: ");
		opera.idadePessoa = leia.nextInt();
		System.out.println("QUAL É O SEU GENERO? M/F/O");
		opera.genero = leia.next().toUpperCase().charAt(0);
		if(opera.genero == 'M')
		{
			sexo = "MASCULINO";
		}
		else if(opera.genero == 'F')
		{
			sexo = "FEMININO";
		}
		else if(opera.genero == 'O')
		{
			sexo = "OUTROS";
		}
		System.out.println("DIGITE O VALOR TOTAL DA PRODUÇÃO: ");
		opera.valorProducao = leia.nextDouble();
		
		System.out.println("VALOR TOTAL COM AJUSTE: "+ n.format(opera.setvalorAjustado()));
	}
}

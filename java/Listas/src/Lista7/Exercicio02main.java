package Lista7;
import java.util.Scanner;
public class Exercicio02main extends Exercicio02{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String sexo = null;
		String nomeFornecedor;
		
		Exercicio02 forn = new Exercicio02 ();
		
		forn.setValorDivida(20000.00);
		forn.setValorCredito(25000.00);		
		
		System.out.println("DIGITE O NOME DO FORNECEDOR: ");
		forn.nomeFornecedor = leia.next();
		System.out.println("DIGITE O SEU NOME: ");
		forn.nomePessoa = leia.next();
		System.out.println("QUAL � O SEU GENERO? M/F/O");
		forn.genero = leia.next().toUpperCase().charAt(0);
		if(forn.genero == 'M')
		{
			sexo = "MASCULINO";
		}
		else if(forn.genero == 'F')
		{
			sexo = "FEMININO";
		}
		else if(forn.genero == 'O')
		{
			sexo = "OUTROS";
		}
		System.out.println("DIGITE O SEU ENDERE�O: ");
		forn.endere�o = leia.next();
		System.out.println("DIGITE O SEU TELEFONE: ");
		forn.telefone = leia.next();
		
		System.out.println("\nDADOS DE USU�RIO");
		System.out.println("NOME: "+forn.nomePessoa);
		System.out.println("G�NERO: "+sexo);
		System.out.println("ENDERE�O: "+forn.endere�o);
		System.out.println("TELEFONE: "+forn.telefone);
		System.out.println("\nDADOS DO FORNECEDOR");
		System.out.printf("O VALOR DA DIFEREN�A � DE: R$%.2f\n",forn.obterSaldo());
		
	}
	
}

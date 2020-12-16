package Lista7;
import java.util.Scanner;
public class Exercicio04main extends Exercicio04{
	
	public static void main(String[] args) {
		
		Exercicio04 adm = new Exercicio04();
		
		Scanner leia = new Scanner(System.in);	
		
		String sexo;
		double gastos=0;
		
		adm.ajudaDeCusto = 500.00;
		
		
		System.out.println("DIGITE O SEU NOME: ");
		adm.nomePessoa = leia.next();
		System.out.println("QUAL É O SEU GENERO? M/F/O");
		adm.genero = leia.next().toUpperCase().charAt(0);
		if(adm.genero == 'M')
		{
			sexo = "MASCULINO";
		}
		else if(adm.genero == 'F')
		{
			sexo = "FEMININO";
		}
		else if(adm.genero == 'O')
		{
			sexo = "OUTROS";
		}
		System.out.println("DIGITE O VALOR DOS SEUS GASTOS: R$");
		gastos = leia.nextDouble();
		adm.setajudaGasto(gastos);
		System.out.println(adm.ajudaDeCusto);
	}
	
}

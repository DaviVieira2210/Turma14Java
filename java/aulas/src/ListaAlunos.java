import java.util.Scanner;
public class ListaAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int matricula[] = new int[40];
		
		String alunos[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
				"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
				"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
				"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
				"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
				"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
				"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
				'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
		
		
		
		
		for(int i=0;i<40;i++)
		{
		if(sexoAlunos[i] == 'M')
		{
		matricula[i]= i+1;
		System.out.println("Matrícula: "+matricula[i]+" - O aluno "+ alunos[i]);			
		}
		else if(sexoAlunos[i] == 'F')
		{
		matricula[i]= matricula[i]+i+1;
		System.out.println("Matrícula: "+matricula[i]+" - A aluna "+ alunos[i]);	
		}
	}
	}
	
}

package Lista8;

public class Preguica extends Animal{

	//Construtor
	
			public Preguica(String cor, String nome, int idade, boolean emitiSom)
			{
				super(cor, nome, idade, emitiSom);
			}
		@Override
		//Método
				public boolean setanimalcorre (char testeCorre)
				{
					boolean corre = false;
					if(testeCorre == 'S' )
					{
						System.out.println("ESTE ANIMAL SOBE EM ARVORES? ");
						corre = true;
					}
					else if(testeCorre == 'N')
					{
						System.out.println("ESTE ANIMAL SOBE EM ARVORES: "+corre);
						corre = false;
					}
				return corre;
				}
		@Override
		//Método2
				public boolean animalEmitiSom(char emitiSom)
				{
					boolean som = false;
					if(emitiSom == 'S')
					{			
						som = true;
						System.out.println("ZZZZZZ: ESTE É O SOM PRODUZIDO PELO ANIMAL?  ");
					}
					else 
					{			
						System.out.println("ESTE ANIMAL NÃO PRODUZ SOM! ");
					}
					return som;
				}	
}

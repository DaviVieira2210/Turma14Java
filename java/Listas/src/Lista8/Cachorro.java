package Lista8;

public class Cachorro extends Animal{


	//Construtor
	
	public Cachorro(String cor, String nome, int idade, boolean emitiSom)
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
				System.out.println("ESTE ANIMAL CORRE?");
				corre = true;
			}
			else if(testeCorre == 'N')
			{
				System.out.println("ESTE ANIMAL NÃO CORRE!");
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
				
				System.out.println("ESTE ANIMAL LATE? ");
				som = true;
			}
			else if(emitiSom == 'N')
			{			
				som = false;
				System.out.println("ESTE ANIMAL NÃO PRODUZ SOM! ");
			}
			return som;
		}
	}

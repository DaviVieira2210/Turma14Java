package Lista8;

public class Cavalo extends Animal{

	//Construtor
	
		public Cavalo(String cor, String nome, int idade, boolean emitiSom)
		{
			super(cor, nome, idade, emitiSom);
		}
	@Override
	//M�todo
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
					System.out.println("ESTE ANIMAL N�O CORRE!");
					corre = false;
				}
			return corre;
			}
	@Override
	//M�todo2
			public boolean animalEmitiSom(char emitiSom)
			{
				boolean som = false;
				if(emitiSom == 'S')
				{			
					som = true;
					System.out.println("ESTE ANIMAL RELINCHA? ");
				}
				else if(emitiSom == 'N')
				{			
					som = false;
					System.out.println("ESTE ANIMAL N�O PRODUZ SOM! ");
				}
				return som;
			}	
}

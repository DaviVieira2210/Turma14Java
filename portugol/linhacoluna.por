programa
{
	inclua biblioteca Util --> plusUltra
	
	funcao inicio()
	{
		
		const inteiro LINHA=4, COLUNA=6
		inteiro N1[LINHA][COLUNA]
		inteiro N2[LINHA][COLUNA]  
		inteiro M1[LINHA][COLUNA]
		inteiro M2[LINHA][COLUNA]
		
		
		escreva("Números de N1:\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
		para (inteiro coluna=0; coluna<COLUNA; coluna++)
		{				
		N1[linha][coluna]=plusUltra.sorteia(3, 4)
		escreva(N1[linha][coluna]," ")				
		}
		pular()
		}
		linhas()
		escreva("\n")
		escreva("Números de N2:\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
		para (inteiro coluna=0; coluna<COLUNA; coluna++)
		{		
		N2[linha][coluna]=plusUltra.sorteia(1, 2)
		escreva(N2[linha][coluna]," ")	
		}
		pular()		
		}
		linhas()
		escreva("\n")
		escreva("Números de M1:\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
		para (inteiro coluna=0; coluna<COLUNA; coluna++)
		{
		M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna]," ")	
		}
		pular()
		}
		linhas()
		escreva("\n")
		escreva("Números de M2:\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
		para (inteiro coluna=0; coluna<COLUNA; coluna++)
		{	
		M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
		escreva(M2[linha][coluna]," ")				
		}
		pular()
		}
	
	     }
	     funcao pular()
	     {
	     escreva("\n")
		}
		funcao linhas()
		{
		escreva("-------------")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
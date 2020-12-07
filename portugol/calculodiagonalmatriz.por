programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LINHA = 3, COLUNA =3

		inteiro valorUsuario[LINHA][COLUNA]
		inteiro calculoDiagonal=0, calculoValores=0

		para(inteiro linha=0; linha<LINHA; linha++)
		{
		para(inteiro coluna=0; coluna<COLUNA;coluna++)
		{			
		escreva("Digite o valor: ")
		leia(valorUsuario[linha][coluna])		
		//escreva(valorUsuario [linha][coluna]+" ")
		
		calculoValores=calculoValores+valorUsuario[linha][coluna]
		
		calculoDiagonal=valorUsuario[0][0]+valorUsuario[1][1]+valorUsuario[2][2]

		}
		
	}
	     escreva("\n")
		escreva("A soma dos valores é: " + calculoValores + "\nA soma das diagonais é: " + calculoDiagonal)
   }
	    escreva("\n")
 }


	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
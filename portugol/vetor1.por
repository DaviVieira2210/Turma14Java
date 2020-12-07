programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro numeroDado[6]
		inteiro vezesLancado[10]
		inteiro soma=0
		inteiro media=0
		inteiro contador=0
		inteiro maiorNum=0	

	para(inteiro x=1; x<10; x++)
	{	
			
	escreva("\nEsses foram números os números: ")	
	vezesLancado[x] = Util.sorteia(1,6)	
	escreva(vezesLancado[x])
	soma = soma+vezesLancado[x]
		
	se(vezesLancado[x] > maiorNum)
	{
	maiorNum=vezesLancado[x]
	}		
	}
	para(inteiro x=1;x<10; x++)
	{
	se(vezesLancado[x] == maiorNum)
	{
	contador++
	}	
	}	
	media= (soma/10)
	escreva("\nA média é: ",media)
	escreva("\nO maior número é: ", maiorNum)
	escreva("\nO maior número apareceu: ", contador)	
	}
	
	funcao pula()
	{
	escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
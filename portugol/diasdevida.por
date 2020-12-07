programa
{
	
	funcao inicio()
	{

 	const inteiro fixo = 365
 	inteiro dias, resultado, meses, anos

 	escreva(" Coloque seus dias de vida: ")
 	
 	 leia(dias)
 	 
 	  resultado = dias/fixo
 	  
 	   escreva(resultado)
 	   
 	    meses = resultado / 12

 	    dias = (dias%365)%30
 	
 	     escreva(" Ano(s), "+meses+" mes(es) e "+dias+" dias de vida")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
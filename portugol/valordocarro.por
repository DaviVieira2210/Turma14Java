programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
	real valorCarro
 	real valorConsumidor
 	real valorDistribuidor
 	real valorImposto

 	escreva("Qual o valor do carro? ")
 	
 	 leia(valorCarro)
 	 
 	  valorDistribuidor = valorCarro * 0.28
 	  
 	   valorImposto = valorCarro * 0.45
 	   
 	    valorConsumidor = valorCarro + valorImposto + valorDistribuidor
 	    
 	     escreva("O valor total do carro é " ,Matematica.arredondar(valorConsumidor,2))
 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
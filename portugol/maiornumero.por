programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maiorNumero=0



		para(inteiro x = 0;x<=4;x++)
		{
		escreva("Digite um número: ")
		leia(pontuacao[x])
		}
		para(inteiro x = 0;x<=4;x++)
		{
		escreva("\nNúmero digitado: ", pontuacao[x])
		
		se(pontuacao[x]>maiorNumero)
		{
		maiorNumero = pontuacao[x]
		}
	   }	
	   escreva("\n")
	   escreva("------------------------")
	   escreva("\nO maior número é: ", maiorNumero, "\n")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
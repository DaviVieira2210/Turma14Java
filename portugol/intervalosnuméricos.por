programa
{
	
	funcao inicio()
	{
		/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes 
		 intervalos: [0-25], [26-50], [51-75] e [76-100].
		 A entrada de dados deve terminar quando for lido um número negativo.*/

		 inteiro numero


		escreva("DIGITE UM NÚMERO: ")
		leia(numero)

		se(numero < 0)
		{
		escreva("APENAS NÚMEROS POSITIVOS!")
		}
		senao se(numero >= 0 e numero <= 25)
		{
		escreva("ESTE NÚMERO ESTÁ NO INTERVALO DE [0-25]")
		}
		senao se(numero >= 26 e numero <= 50)
		{
		escreva("ESTE NÚMERO ESTÁ NO INTERVALO DE [26-50]")
		}
		senao se(numero >= 51 e numero <= 75)
		{
		escreva("ESTE NÚMERO ESTÁ NO INTERVALO DE [51-75]")
		}
		senao se(numero >= 76 e numero <= 100)
		{
		escreva("ESTE NÚMERO ESTÁ NO INTERVALO DE [76-100]")
		}
		senao se(numero > 100)
		{
		escreva("O NÚMERO NÃO ENTRA NO INTERVALO")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
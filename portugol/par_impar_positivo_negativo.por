programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um numero: ")
		leia(numero)

		{
		se ( (numero%2) == 0 e numero < 0)
		{
			escreva("Você digitou um número par negativo!!")
		}
		senao se ( (numero%2) != 0 e numero < 0)
		{
			escreva("Você digitou um número ímpar negativo!!")
		}
		senao se (numero ==0)
		{
			escreva("Vc digitou o zero!!")
		}
		senao se	( (numero%2) == 0 e numero > 0)
		{
			escreva("Você digitou um número par positivo!!")
			
		}
		senao se ( (numero%2) != 0 e numero > 0)
		{
			escreva("Você digitou um número ímpar positivo!!")
			
		    }
	    }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
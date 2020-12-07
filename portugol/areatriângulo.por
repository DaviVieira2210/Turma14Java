programa
{
	
	funcao inicio()
	{
		
		real base
		real area
		real altura

		escreva("Digite a altura: ")
		leia (altura)
		escreva("Digite a base: ")
		leia (base)
		
		se(altura == 0 ou base == 0)
		{
		escreva("\nImpossível calcular a área se a altura ou base forem 0\n")
		}

		area = (base * altura)/2
		escreva("\nA área deste triângulo é: ", area)	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
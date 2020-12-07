programa
{
	
	funcao inicio()
	{

		const real MULTA = 4.00
		real pesoTomate, excessoPeso, formula1, formula2

		
		escreva("Insira o peso: ")
		leia(pesoTomate)

		formula1 = (pesoTomate-50)*4.0
		formula2 = (pesoTomate-50)

		se(pesoTomate <= 50)
		{
		escreva("Não hávera multas, pois o peso não foi exedido!!")
		}
		senao se(pesoTomate > 50)
		{
		escreva("O peso foi exedido em ",formula2, "KG, sua multa será de ", formula1, " R$.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
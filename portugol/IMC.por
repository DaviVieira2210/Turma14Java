programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
		 * A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso*/
		
		inteiro peso = 0
		real altura = 0.0
		real indiceMassaCorporal
		
		escreva("Indique o número da sua altura?:")
          leia(altura)
          escreva("Indique o núemro do seu peso?:")
		leia(peso)
		
		indiceMassaCorporal = peso / (altura*2)

		escreva(mat.arredondar(indiceMassaCorporal, 2))

		se(indiceMassaCorporal < 18.5)
		{
		escreva(" - Abaixo do peso")
		}
		senao se(indiceMassaCorporal >= 18.5 e indiceMassaCorporal <= 25)
		{
		escreva(" - Peso normal")
		}
		senao se(indiceMassaCorporal >= 25 e indiceMassaCorporal <= 35)
		{
		escreva(" - Acima do peso")
		}
		senao se(indiceMassaCorporal > 30)
		{
		escreva(" - Obeso")
		
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
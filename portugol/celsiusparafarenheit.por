programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

        real grausCelsius 

        real grausFahrenheit 

        escreva("Qual a temperatura°C de hoje? ")
        
        leia(grausCelsius)

        grausFahrenheit = (((grausCelsius*9)/5)+32)

        escreva("A tempereatura atual em Fahrenheit é: " +Matematica.arredondar(grausFahrenheit,3))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro numeroConta = 1
		real saldo = 0.0
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		inteiro dataAniversario = 22, dataComparacao
		cadeia resposta 
		caracter opcao
		
		escreva("BANCO G1")
		escreva("\n")
		escreva("CONFIRME OS SEUS DADOS: ")
		escreva("\n")
		escreva("----------------------")
		escreva("\nNúmero da Conta: ", numeroConta)
		escreva("\nNúmero do CPF: ", cpf)
		escreva("\n")
		escreva("----------------------")
		escreva("\nDigite o dia do seu aniversário: ")
		leia(dataComparacao)
		escreva("----------------------")
		escreva("\nSeus dados estão corretos? ")
		leia(resposta)
	

		se(resposta == "SIM" ou resposta == "sim" ou resposta == "Sim" )
		{
		escreva("VAMOS PROSSEGUIR!\n")
		}
		senao
		{
		escreva("VÁ ATÉ A AGÊNCIA MAIS PRÓXIMA!")   
		escreva("\n")  
		}
		
		//Movimentos do dia
		
		para(inteiro x=0;x<10;x++)
		{
		escreva("Movimentação do dia " + (x+1), ": ")
		leia(movimentos[x])
		saldo = saldo + movimentos[x]
		se(saldo < 0)
		{
		escreva("VOCÊ NÃO TEM SALDO DISPONÍVEL!!")
		pare
		}
		}
		se(dataAniversario == dataComparacao)
		{
		saldo = saldo * 1.005 
		}
		senao se (dataAniversario != dataComparacao)
		{
		escreva("-------------------------")
		escreva("\n")
		escreva("Não dia do seu aniversário será aplicado 0,5% ao seu saldo!")
		}
		
		escreva("\n")
		escreva("-------------------------")
		escreva("\nSEU SALDO ATUAL É DE: R$",mat.arredondar(saldo, 2))
		escreva("\n")
		escreva("-------------------------")
	}   
}
       
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
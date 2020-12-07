programa
{
												
	funcao inicio()
	{
		
		//VARIAVEIS E VETORES
		inteiro numeroConta = 001
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real credito=0.00, debito=0.00
		real limiteSaldo =1000.00     			
		cadeia resposta
		caracter tipo
		real movimentos[2]
		
		
		//tela de entrada
		escreva("CONFIRME OS SEUS DADOS: ")
		escreva("\n")
		escreva("----------------------")
		escreva("\nNúmero da Conta: ", numeroConta)
		escreva("\nNúmero do CPF: ", cpf)
		escreva("\nSeu saldo é:", saldo)
		
		
		para (inteiro x=0; x<2; x++)
		{
			escreva("\n1-Débito ou 2-Crédito:" )
			leia (tipo)
			se(tipo == '1')//debito
			{
				escreva("\nEscreva o valor de Débito:")
				leia (debito)
		
				se(saldo >= debito)
				{
					movimentos[x]=(saldo - debito)
					escreva("\nVocê ainda possui um limite de R$", limiteSaldo)
				}
				senao
				{
					se(debito > (limiteSaldo + saldo))
					{
						escreva("Você não possui limite para esta transação")
						movimentos[x] = saldo
					}
					senao
					{
						escreva("\n!!Saldo insuficiente!!")
						escreva("\nVocê ainda possui: R$", limiteSaldo, " de limite")	
						escreva("\nDeseja utilizar o limite? [1]Sim [2]Não")
						leia(tipo)
					
						se(tipo == '1')
						{
							limiteSaldo += (saldo - debito)
							escreva("\nVocê ainda possui R$", limiteSaldo, " de limite")
						}
						senao se(tipo == '2')
						{
							escreva("Operação não realizada")
							movimentos[x] = saldo
							escreva(saldo)
						}	
					}
				}
				
			}			
			senao se (tipo=='2')//credito
			{
				escreva("\nDigite o valor de crédito:")
				leia (credito)	
				movimentos[x]=(saldo + credito)
			}
			saldo = movimentos[x]
			escreva ("\nSaldo Atual: R$", saldo)			
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 853; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
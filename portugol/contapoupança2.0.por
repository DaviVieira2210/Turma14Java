programa
{
	inclua biblioteca Matematica --> mat

	
		funcao linha()
		{
		escreva("-------------------")
		}
		funcao pular()
		{
		escreva("\n")
		}
		
		
	funcao inicio()
	{
		const inteiro numeroConta=1
		real saldo=0.0
		inteiro dataAniversario
		cadeia cpf 
		cadeia resposta
		cadeia nome 
		real credito, debito
		caracter tipo
		real movimentos[2]
		inteiro dataAniversarioConta = 22, dataComparacao

		escreva("BANCO G1")
		pular()
		linha()
		pular()
		escreva("DIGITE SEU CPF: ")
		leia(cpf)
		escreva("DIGITE SEU NOME COMPLETO: ")
		leia(nome)

		limpa()
		escreva("CONFIRME SEUS DADOS ")
		pular()
		escreva("CPF: ",cpf)
		pular()
		escreva("NOME: ",nome)
		pular()
		escreva("NÚMERO DA CONTA: ", numeroConta)
		pular()
		escreva("DATA DE ANIVERSÁRIO DA CONTA: ", dataAniversarioConta)
		pular()
		linha()
		pular()
		escreva("SEUS DADOS ESTÃO CORRETOS? ")
		leia(resposta)

		se(resposta == "SIM" ou resposta == "sim" ou resposta == "Sim")
		{
		pular()
		limpa()
		escreva("OK, VAMOS PROSSEGUIR!!")
		pular()
		
		}
		senao 
		{
		escreva("VÁ ATÉ A AGÊNCIA MAIS PRÓXIMA!!")
		}	
		para (inteiro x=0; x <2; x++)
	     	{
				pular()	
				escreva("[D]-Débito ou [C]-Crédito: " )
				leia (tipo)
		se(tipo == 'D')
			{
				pular()
				escreva("Escreva o valor de Débito:")
				leia (debito)
		se(saldo >= debito)
			{
				movimentos[x]=(saldo - debito)
			}
		senao
			{
				pular()
	    			escreva("SALDO INSUFICIENTE!!")
			}		
			}
			senao se (tipo=='C')
			{
				pular()
				escreva("Digite o valor de crédito:")
				leia (credito)	
				movimentos[x]=(saldo + credito)
			}
				saldo = movimentos[x]
				pular()
				escreva ("Saldo Atual: R$ ", mat.arredondar(saldo,2))
				pular()
			}
		escreva("\nDIGITE O ANIVERSÁRIO DA CONTA: ")
		leia(dataComparacao)
		se(dataAniversarioConta == dataComparacao)
		{
			saldo = saldo * 1.005 
			escreva("\nSua conta rendeu. Seu novo saldo é: ", mat.arredondar(saldo,2))
		}
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
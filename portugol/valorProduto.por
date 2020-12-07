programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valorProduto
		caracter formaPagamento
		real dinheiro
		real cheque
		real cartaoCredito
		real precoEtiquetaNormal
		real precoEtiquetaParcelado
		real valorFinal=0.0
		real valorParcela

		escreva("MERCADINHO DAVI'S")
		pular()
		linha()
		pular()
		escreva("DIGITE O VALOR DO PRODUTO: ")
		leia(valorProduto)
		pular()
		escreva("QUAL SERÁ A FORMA DE PAGAMENTO?")
		pular()
		escreva("[D]►DINHERO")
		pular()
		escreva("[C]►CHEQUE")
		pular()
		escreva("[A]►À VISTA NO CRÉDITO")
		pular()
		escreva("[2]►PARCELADO EM DUAS VEZES")
		pular()
		escreva("[3]►PARCELADO EM TRÊS VEZES")
		pular()
		escreva("ESCOLHA UMA FORMA DE PAGAMENTO: ")
		leia(formaPagamento)

		se(formaPagamento == 'D')
		{
		valorFinal = valorProduto - valorProduto * 0.2
		}
		senao se(formaPagamento == 'C')
		{
		valorFinal = valorProduto - valorProduto * 0.2
		}
		senao se(formaPagamento == 'A')
		{
		valorFinal = valorProduto - valorProduto * 0.15
		}
		senao se(formaPagamento == '2')
		{
		valorFinal = valorProduto 
		}
		senao se(formaPagamento == '3')
		{
		valorFinal = valorProduto + valorProduto * 0.1 * 3
		valorParcela = valorFinal / 3
		escreva("O VALOR DAS PARCELAS MENSAIS SERÃO: ",mat.arredondar(valorParcela,2))
		}
		pular()
		escreva("O VALOR TOTAL DO PRODUTO É R$ ", valorFinal)
		leia(valorFinal)
		pular()
		
		
	}
		funcao linha()
		{
		escreva("-------------------")
		}
		funcao pular()
		{
		escreva("\n")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia clientes[5] = {"Breno Noccioli", "Davi Vieira", "Fernanda Agapito", "Lucas Gonçalves", "Micaely Lima"}
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		caracter opcao
		caracter continua = '0'
		
		faca{
		//seleciona cliente
		escreva("SELECIONE SUA CONTA: ")
		
		para(inteiro i=0; i<5; i++){
			escreva("\n[" + (i+1) + "] - " + clientes[i])
		}
		escreva("\n")
		leia(opcao)

		escolha(opcao){
			caso '1':
				contaUniversitaria()
			pare

			caso '2':
				contaPoupanca()
			pare

			caso '3':
				contaEspecial()
			pare

			caso '4':
				contaCorrente()
			pare

			caso '5':
				contaEmpresarial()
			pare

			caso contrario:
			escreva("\nOPCAO INVALIDA!")
		}

		escreva("\nDeseja voltar ao menu inicial? [S] SIM [N] NAO ")
		leia(continua)
		}enquanto(continua == 'S' ou continua =='s')
	}
	//funcoes por conta

	funcao linha()
		{
		escreva("-------------------")
		}
		
	funcao pular()
		{
		escreva("\n")
		}
		
	//conta universitaria
	funcao contaUniversitaria(){
		inteiro numeroConta = 01
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		real credito = 0.0, debito = 0.0, saldoComEmprestimo = 0.0
		real emprestimoEstudantil = 1000.00, solicitaEmprestimo = 0.0
		caracter resposta, continua='0'
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		
		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpfClientes[0])
		escreva("\nTipo de Conta: " + contas[0])
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)

		
		se(resposta == 'S' ou resposta == 's'){
			faca{
			//percorre vetor movimentos
			para(inteiro x=0; x<2; x++){
				escreva("\nTRANSACAO " + (x+1) + "  - [C] Credito | [D] Debito: ")
				leia(resposta) //define natureza da transacao
				se(resposta == 'C' ou resposta =='c'){
					escreva("\nDIGITE O VALOR A SER CREDITADO: ")
					leia(credito)
					saldo+=credito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				} senao{
					escreva("\nDIGITE O VALOR A SER DEBITADO: ")
					leia(debito)
					saldo-=debito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				}

				se(saldo >= 0){ //oferece emprestimo
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				} senao {
					escreva("\nSEU SALDO ESTA NEGATIVO!")
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				}
			}
			
				//continuar
				escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
				leia(continua)
			
			}enquanto(continua == 'S' ou continua == 's')
		}
		senao
		{
			escreva("\nDigite o numero da conta: ")
			escreva("\nDigite o CPF: ")
		}
	}

	
	//conta poupanca
	funcao contaPoupanca(){
		const inteiro numeroConta=02
		real saldo=0.0
		inteiro dataAniversario
		cadeia cpf
		cadeia resposta
		cadeia nome
		real credito, debito
		caracter tipo
		real movimentos[2]
		inteiro dataAniversarioConta = 22, dataComparacao
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		caracter continua = '0'
		
		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpfClientes[1])
		escreva("\nTipo de Conta: " + contas[1])
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)
		se(resposta == "S" ou resposta == "s")
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

		faca{
		para (inteiro x=0; x <2; x++)
	     {
		pular()	
		escreva("[D]-Débito ou [C]-Crédito: " )
		leia (tipo)
		se(tipo == 'D' ou tipo == 'd')
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
	     movimentos[x] = saldo
		}		
		}
		senao se (tipo=='C' ou tipo == 'c')
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
		//continuar
		escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
		leia(continua)
	}enquanto(continua == 'S' ou continua == 's')
	}

	//conta Especial
	funcao contaEspecial(){
		//VARIAVEIS E VETORES
		inteiro numeroConta = 03
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real credito=0.00, debito=0.00
		real limiteSaldo =1000.00     			
		cadeia resposta
		caracter tipo
		real movimentos[2]
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-440", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		caracter continua = '0'
		
		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpfClientes[2])
		escreva("\nTipo de Conta: " + contas[2])
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)
		
		faca{
		para (inteiro x=0; x<2; x++)
		{
			escreva("\n [D] Débito ou [C] Crédito:" )
			leia (tipo)
			se(tipo == 'D' ou tipo == 'd')//debito
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
						escreva("\nDeseja utilizar o limite? [S] Sim [N] Não")
						leia(tipo)
					
						se(tipo == 'S' ou tipo == 's')
						{
							limiteSaldo += (saldo - debito)
							escreva("\nVocê ainda possui R$", limiteSaldo, " de limite")
						}
						senao se(tipo == 'N' ou tipo == 'n')
						{
							escreva("Operação não realizada")
							movimentos[x] = saldo
							escreva(saldo)
						}	
					}
				}
				
			}			
			senao se (tipo =='C' ou tipo == 'c')//credito
			{
				escreva("\nDigite o valor de crédito:")
				leia (credito)	
				movimentos[x]=(saldo + credito)
			}
			saldo = movimentos[x]
			escreva ("\nSaldo Atual: R$", saldo)			
		
		}
		//continuar
		escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
		leia(continua)
		}enquanto(continua == 'S' ou continua == 's')	
	}
	
	//conta corrente
	funcao contaCorrente(){
		inteiro numeroConta = 04
		real saldo = 0.0
		cadeia CPF = "123.123.123.12"
		inteiro movimentos[2]
		real debito= 0.0, credito=0.0
		caracter tipo
		inteiro numeroTalao = 0
		inteiro totalTalao = 10
		inteiro retirarTalao = 0
		cadeia resposta
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-44", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		caracter continua = '0'
		
		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpfClientes[3])
		escreva("\nTipo de Conta: " + contas[3])
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)

		faca{
		se(resposta == "S" ou resposta == "s")
		{
			escreva("\nVamos prosseguir!")
		para (inteiro x=0; x <2; x++)
	     	{
				pular()	
				escreva("[D]-Débito ou [C]-Crédito: " )
				leia (tipo)
		se(tipo == 'D' ou tipo == 'd')
		{
			pular()
			escreva("\nEscreva o valor de Débito:")
			leia (debito)
					
			se(saldo >= debito)
			{
				movimentos[x]=(saldo - debito)
			}
			senao
			{
				pular()
	    			escreva("\nSALDO INSUFICIENTE!!")
	    			movimentos[x]= saldo
			}		
		}
		senao se (tipo=='C' ou tipo == 'c')
		{
			pular()
			escreva("\nDigite o valor de crédito:")
			leia (credito)	
			movimentos[x]=(saldo + credito)
		}
				saldo = movimentos[x]
				pular()
				escreva ("Saldo Atual: R$ ", mat.arredondar(saldo,2))
				pular()
			
			escreva("\nVocê ainda tem: ",totalTalao, " folhas de cheque disponiveis")
			
			
			escreva("\nDeseja solicitar um novo talão? [S] SIM [N] NAO ")
			leia(tipo)
				se(tipo == 'S' ou tipo == 's'){
					escreva("\nQuantas folhas você deseja retirar?")
					leia(retirarTalao)
					numeroTalao += retirarTalao
					totalTalao -= retirarTalao
					escreva("\nVocê ainda tem: ",totalTalao, " folhas de cheque disponiveis")
					escreva ("\nVocê já retirou: ", numeroTalao, " Folhas")
				}
				
				}
			}
			senao
			{
			escreva("Digite o número da conta: ")
			escreva("Digite o CPF: ")
			}

			escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
			leia(continua)
		}enquanto(continua == 'S' ou continua == 's')	
	}


	//conta Empresarial
	funcao contaEmpresarial(){
		inteiro numeroConta = 05
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		real credito = 0.0, debito = 0.0, saldoComEmprestimo = 0.0
		real emprestimoEstudantil = 1000.00, solicitaEmprestimo = 0.0
		caracter resposta, continua='0'
		cadeia cpfClientes[5] = {"111.111.111-11", "222.222.222-22", "333.333.333-33", "444.444.444-44", "555.555.555-55"}
		cadeia contas[5] = {"UNIVERSITARIA", "POUPANCA", "ESPECIAL", "CORRENTE", "EMPRESA"}
		
		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpfClientes[4])
		escreva("\nTipo de Conta: " + contas[4])
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)

		
		se(resposta == 'S' ou resposta == 's'){
			faca{
			//percorre vetor movimentos
			para(inteiro x=0; x<2; x++){
				escreva("\nTRANSACAO " + (x+1) + "  - [C] Credito | [D] Debito: ")
				leia(resposta) //define natureza da transacao
				se(resposta == 'C' ou resposta =='c'){
					escreva("\nDIGITE O VALOR A SER CREDITADO: ")
					leia(credito)
					saldo+=credito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				} senao{
					escreva("\nDIGITE O VALOR A SER DEBITADO: ")
					leia(debito)
					saldo-=debito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				}

				se(saldo >= 0){ //oferece emprestimo
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				} senao {
					escreva("\nSEU SALDO ESTA NEGATIVO!")
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				}
			}
			
				//continuar
				escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
				leia(continua)
			
			}enquanto(continua == 'S' ou continua == 's')
		}
		senao
		{
			escreva("\nDigite o numero da conta: ")
			escreva("\nDigite o CPF: ")
		}
	}

}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
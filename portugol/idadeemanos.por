	programa
{

    funcao inicio()
    {
        inteiro tempoAnos
        inteiro tempoMeses
        inteiro tempoDias

        escreva ("idade em anos, meses e dia\nAnos:")
        
         leia (tempoAnos)

          escreva ("Meses:")
          
           leia (tempoMeses)

            escreva ("Dias:")
            
             leia (tempoDias)

              inteiro tempoDiasTotal = (tempoAnos*365+tempoMeses*30+tempoDias)
              
               escreva ("Congratulations, sua idade em dias é: ",tempoDiasTotal)

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
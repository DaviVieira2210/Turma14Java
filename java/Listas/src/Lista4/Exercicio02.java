package Lista4;

import java.util.Random;

public class Exercicio02 {

    public static void main(String[] args) {
    	
    	Random sorteia = new Random();
    	
        int lancamentos [] = new int [10];
        double media = 0.0;
		int maiorLancamento = 0;
		int contaLancamento = 0;
		int soma = 0;


        for(int i = 0; i < 10; i++){
        	lancamentos[i] = sorteia.nextInt(6)+1;//(int) (Math.random() * 6+1); //Importei a biblioteca Util para sortear um número entre 1 e 10 
            System.out.println("\nNumero sorteado: "+ lancamentos[i]);
            soma += lancamentos[i];
            media = (soma/10)   ;
            
            if(lancamentos[i]>maiorLancamento)
            {
            	maiorLancamento = lancamentos[i];	
            }
        }	
        for(int i = 0; i < 10; i++) {
        	if(maiorLancamento == lancamentos[i])
        	{        	
        		contaLancamento++;	
        	}
        }
        System.out.println("\nMédia: " + Math.round(media));
        System.out.println("O maior valor foi: "+ maiorLancamento);
        System.out.println("O maior valor apareceu: "+ contaLancamento);
    }
}

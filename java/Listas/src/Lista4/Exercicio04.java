package Lista4;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        final int TAMANHO = 3;
        int matriz [][] =  new int [TAMANHO][TAMANHO];
        int linha, coluna;
        int totalNumeros=0, totalDiagonal=0;
        Scanner leia = new Scanner(System.in);
                
                
        for (linha = 0; linha < TAMANHO; linha++){
                    for (coluna = 0; coluna < TAMANHO; coluna++){
                        System.out.println("Digite o valor da posição: [" + linha + "][" + coluna + "]");
                        matriz[linha][coluna] = leia.nextInt();
                        
                        totalNumeros = totalNumeros + matriz[linha][coluna];
                        if(linha == coluna){
                              
                                totalDiagonal += matriz[linha][coluna];        
                        }    
                    }
                    
                    System.out.print("\n");
                }
                System.out.print("\nMATRIZ ATUAL\n");
                
                for(linha = 0; linha < TAMANHO ; linha++){
                    for(coluna = 0; coluna < TAMANHO; coluna++){
                        System.out.println(matriz[linha][coluna] + " ");        
                    }
                    
                    System.out.print("\n");
                }
                
                
                System.out.printf("\nTotal de valores é %d:", totalNumeros);
                System.out.printf("\nTotal da diagonal é %d:", totalDiagonal);
                

    }

}
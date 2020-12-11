package Lista4;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int valores [] = new int [5];
        int valor = 0;
        
        for(int x = 0; x < 5; x++) {
            System.out.println("Insira o valor " + x );
            valores[x] = leia.nextInt();
            
            if(x == 0) {
                valor = valores[x];
            }
            if(valores[x] > valor) {
                valor = valores[x];
            }
        }
        System.out.println("\nMaior valor: " + valor);
    }

}
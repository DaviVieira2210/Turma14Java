package Lista2;

import java.util.Scanner;

public class Exercicio06
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.println("DIGITE A SUA IDADE : ");
        numero = leia.nextInt();
        if(numero<0)
        {
            System.out.println(" Numero invalido ");
        }
        else if (numero<5)
        {
            System.out.println("  Um bebe volte daqui alguns anos ");
        }
        else if(numero<8)
        {
            System.out.println(" INFANTIL A ");
        }
       else if(numero<12)
    {
        System.out.println(" INFANTIL B ");
    }
       else if(numero<14)
       {
           System.out.println(" JUVENIL A ");
       }
       else if(numero<18)
       {
           System.out.println(" JUVENIL B ");
       }
       else if(numero>17)
       {
           System.out.println(" ADULTO");
       }
        
    }
}
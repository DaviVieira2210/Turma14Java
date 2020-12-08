package Lista2;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        int dadosUser;
        System.out.println("DIGITE UM NUMERO : ");
        dadosUser =  leia.nextInt();
        if(dadosUser<100)
        {
            System.out.println(" Não vou exibir nada ");
        }
        else
        {
            System.out.println("ESTE DAQUI EU EXIBO "+dadosUser);
        }
    }

}
package Lista2;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        int base,altura;
        final int formula = 2;
        System.out.println(" INSIRIA A BASE : ");
        base = leia.nextInt();
        System.out.println(" INSIRA A ALTURA : ");
        altura = leia.nextInt();
        if (base>0 && altura>0)
        {
            System.out.println("A AREA DO TRIANGULO É : " + (base+altura)/2);
        }
        else
        {
            System.out.println("VOCE INSERIU UM VALOR NEGATIVO INSIRA UM POSITIVO");
        }
        
}

}
package Lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        int TempoSegundo;
        int horas, segundos, minutos;
        
        
        System.out.println("Quantos tempo em segundos?");
        TempoSegundo = entrada.nextInt();
        
        
        //processamentos
        horas = TempoSegundo/ 3600;
        minutos = (TempoSegundo % 3600) /60;
        segundos = (TempoSegundo % 3600) % 60;
        
        System.out.println("Hora(s): " + horas + " Minuto(s): " + minutos + " Segundo(s): " + segundos);
        
	}
	
}

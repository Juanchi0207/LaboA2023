package Unidad0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;
        dia = entrada.nextLine();
        switch (dia){
            case "lunes":
                System.out.println("Dia laboral");
                break;
            case "martes":
                System.out.println("Dia laboral");
                break;
            case "miecroles":
                System.out.println("Dia laboral");
                break;
            case "jueves":
                System.out.println("Dia laboral");
                break;
            case "viernes":
                System.out.println("Dia laboral");
                break;
            case "sabado":
                System.out.println("Dia no laboral");
                break;
            case "domingo":
                System.out.println("Dia no laboral");
                break;
        }


    }
}

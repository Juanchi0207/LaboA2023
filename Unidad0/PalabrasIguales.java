package Unidad0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra1=entrada.nextLine();
        System.out.println("Ingrese otra palabra: ");
        String palabra2=entrada.nextLine();
        if(palabra2.equals(palabra1)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
}

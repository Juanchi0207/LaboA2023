package Unidad0;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean condicion=true;
        while (condicion==true){
            System.out.println("Digite un numero: ");
            numero= entrada.nextInt();
            if(numero != -1) {
                System.out.println(numero);
            }
            else {
                condicion=false;
            }
        }
    }
}

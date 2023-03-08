package Unidad0;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1;
        num1 = entrada.nextInt();
        int num2;
        num2 = entrada.nextInt();

        if (num1>num2){
            System.out.println("El numero 1 es mayor al segundo");
        }
        else {
            System.out.println("El numero 2 es mayor al primero");
        }
    }
}

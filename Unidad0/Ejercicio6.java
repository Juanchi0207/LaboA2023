package Unidad0;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean condicion=true;
        int mayor=0,menor=0,sumaPositivos=0,sumaNegativos=0;
        while (condicion){
            System.out.println("Digite un numero: ");
            numero= entrada.nextInt();
                if(numero != -1) {
                    System.out.println(numero);
                    if(numero>mayor){
                        mayor=numero;
                    }
                    if(numero<menor){
                        menor=numero;
                    }
                    if(numero>0){
                        sumaPositivos=sumaPositivos+numero;
                    }
                    else{
                        sumaNegativos=sumaNegativos+numero;
                    }
                }
                else {
                   condicion=false;
                }
        }
        System.out.println("El numero mas grande ingresado es: " + mayor);
        System.out.println("El numero mas chico ingresado es: " + menor);
        System.out.println("La suma de los positivos ingresados es: " + sumaPositivos);
        System.out.println("La suma de los negativos ingresados es: " + sumaNegativos);
    }
}

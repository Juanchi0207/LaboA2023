package Unidad0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String frase = "ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        Scanner entrada = new Scanner(System.in);
        String letra;
        letra= entrada.nextLine();
        String nueva_frase=frase.replace("e", letra);
        System.out.println(nueva_frase);
    }
    }


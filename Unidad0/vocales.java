package Unidad0;

public class vocales {
    public static void main(String[] args) {
        String frase = "ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==('a') || frase.charAt(i)==('e') || frase.charAt(i)==('i') || frase.charAt(i)==('o') || frase.charAt(i)==('u')){
                vocales = vocales + 1;
            }
        }
        System.out.println(vocales);
    }
}
import java.util.ArrayList;

public class Ej2_U2 {
    public static void main(String[] args) {
        ArrayList<String> cosas = new ArrayList<String>();
        char letra = 'c' ;
        cosas.add("casa");
        cosas.add("carro");
        cosas.add("Hola");

        for(String nombres:cosas){
            if (letra == nombres.charAt(0)) {
                System.out.println(nombres);
        }

    }

}
    }


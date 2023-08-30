package Cine;

public class Sala {
    private int identificador;
    private static int contador=1;
    private static int butacas=45;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getButacas() {
        return butacas;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Sala.contador = contador;
    }

    public static void setButacas(int butacas) {
        Sala.butacas = butacas;
    }

    public Sala() {
        this.identificador = contador;
        contador++;
    }
}

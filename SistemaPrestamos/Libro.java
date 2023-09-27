package SistemaPrestamos;

import java.util.HashMap;
import java.util.Map;

public class Libro extends Escritos implements Prestable{
    private HashMap<Integer, Integer> pagsXcapitulo;

    public Libro(int codigo, String titulo, int anioPublicacion, HashMap<Integer, Integer> pagsXcapitulo) {
        super(codigo, titulo, anioPublicacion);
        this.pagsXcapitulo = pagsXcapitulo;
    }

    public HashMap<Integer, Integer> getPagsXcapitulo() {
        return pagsXcapitulo;
    }

    public void setPagsXcapitulo(HashMap<Integer, Integer> pagsXcapitulo) {
        this.pagsXcapitulo = pagsXcapitulo;
    }

    @Override
    public boolean prestar() {
        if (pagsXcapitulo.size() % 2 == 0){
            System.out.println("El libro" + getTitulo() + "\n" + "no sera prestado");
            return false;

        }
        else {
            System.out.println("El libro " + getTitulo() + " sera prestado");
            return true;
        }

    }

    @Override
    public boolean agregarElemento() {
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        else {
            System.out.println("El artículo ingresado no puede ingresar al circuito de préstamos");
            return false;
        }
    }

    @Override
    public String toString() {
        String aux="";
        for (Map.Entry<Integer, Integer> capitulo:pagsXcapitulo.entrySet()){
            aux=aux + "Capitulo: " + capitulo.getKey() + "  Paginas: "+ capitulo.getValue() + "\n";
        }
        return "LIBRO" + "\n"+
                "codigo: " + getCodigo() + "\n" +
                "titulo: " + getTitulo() + "\n" +
                "año publicacion: " + getAnioPublicacion() + "\n" +
                "pagsXcapitulo: " + aux
                ;

    }
}

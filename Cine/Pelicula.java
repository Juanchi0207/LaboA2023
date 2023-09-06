package Cine;

public class Pelicula {
    private String titulo;
    private double duracion;
    private Genero genero;
    private int identificador;
    private static int contador=0;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pelicula.contador = contador;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Pelicula(String titulo, double duracion, Genero genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        contador++;
        this.identificador=contador;

    }
}

package Biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private Generos genero;
    private String nombrePDF;
    private int descargas=100;

    public Libro(String titulo, Autor autor, Generos genero, String nombrePDF, int descargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombrePDF = nombrePDF;
        this.descargas = descargas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }
}

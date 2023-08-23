import personas.Persona;

public class Cancion {
    private Persona autor;
    private String titulo;

    public Cancion(Persona autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public Cancion(){
       // this.autor= new Persona(" ", " ");
        this.titulo=" ";
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

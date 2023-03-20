public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int cantidad_paginas;
    private String editorial;
    private Fecha fecha_publicacion;

    public Libro(String titulo, Persona autor, int ISBN, int cantidad_paginas, String editorial, Fecha fecha_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidad_paginas = cantidad_paginas;
        this.editorial = editorial;
        this.fecha_publicacion = fecha_publicacion;
    }
    public Libro() {
        this.titulo = "Crimen y Castigo";
        this.autor = new Persona();
        this.ISBN = 35749461;
        this.cantidad_paginas = 190;
        this.editorial = "KEL";
        this.fecha_publicacion = new Fecha(3,5,2018);
    }
    public Libro(String titulo, Persona autor, int ISBN, int cantidad_paginas, Fecha fecha_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidad_paginas = cantidad_paginas;
        this.editorial = "KEL";
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantidad_paginas(int cantidad_paginas) {
        this.cantidad_paginas = cantidad_paginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFecha_publicacion(Fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getCantidad_paginas() {
        return cantidad_paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Fecha getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void mostrarDatos(){
        System.out.println(getEditorial());
        System.out.println(getAutor());
        System.out.println(getTitulo());
        System.out.println(getISBN());
        System.out.println(getCantidad_paginas());
        System.out.println(getFecha_publicacion());

    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDatos();
        }
    }





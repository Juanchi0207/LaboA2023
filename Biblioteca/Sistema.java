package Biblioteca;

import java.util.HashSet;

public class Sistema {
    private  HashSet<Libro>libros;
    private HashSet<Usuario>usuarios;


    public Sistema(HashSet<Libro> libros, HashSet<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarLibro(Libro l1){
        this.libros.add(l1);
    }
    public void borrarLibro(Libro l1){
        this.libros.remove(l1);
    }
    public void modificarLibro(Libro l1, Libro l2){
        this.libros.remove(l1);
        this.libros.add(l2);
    }

    public void prestamoLibro(Usuario u1, Libro l1){
        boolean estado=false;
        Libro libroLista=null;
        for (Libro libro:libros){
            if (libro==l1){
                libroLista=libro;
            }
        }
        try {
            if (libroLista.getDescargas() > 0) {
                try {
                    if (u1.getMembresia().equals("BRONCE") && u1.getLibrosPrestados().size() < 5) {
                        u1.getLibrosPrestados().add(l1);
                        estado = true;
                    } else if (u1.getMembresia().equals("PLATA") && u1.getLibrosPrestados().size() < 15) {
                        u1.getLibrosPrestados().add(l1);
                        estado = true;
                    } else if (u1.getMembresia().equals("ORO") && u1.getLibrosPrestados().size() < 50) {
                        u1.getLibrosPrestados().add(l1);
                        estado = true;
                    } else {
                        throw new MembresiaException("Alcanzaste el limite de libros puesto por tu membresia");
                    }
                } catch (MembresiaException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                throw new LimiteDePrestamosAlcanzadoException("La cantidad de descargas llego a su maximo");
            }
        } catch (LimiteDePrestamosAlcanzadoException e) {
            throw new RuntimeException(e);
        }
        if (estado){
            for (Libro libro:libros){
                if (libro==l1){
                    libro.setDescargas(libro.getDescargas()-1);
                }
            }
        }
    }

    public void devolverLibro(Libro l1,Usuario u1){
        for (Libro libro:libros){
            if (libro==l1){
                libro.setDescargas(libro.getDescargas()+1);
                u1.getLibrosPrestados().remove(l1);
            }
        }
    }


}

package Biblioteca;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private HashSet<Libro>librosPrestados;
    private Membresia membresia;

    public Usuario(String nombre, int dni, LocalDate fecha_nacimiento, String mail, HashSet<Libro> librosPrestados, Membresia membresia) {
        super(nombre, dni, fecha_nacimiento, mail);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}

package SistemaPrestamos;

import personas.Persona;

import java.util.HashSet;

public class Usuario extends Persona {
    private HashSet<Prestable>objetosEnPrestamo;

    public Usuario(String nombre, String apellido, int dni, HashSet<Prestable> objetosEnPrestamo) {
        super(nombre, apellido, dni);
        this.objetosEnPrestamo = objetosEnPrestamo;
    }

    public HashSet<Prestable> getObjetosEnPrestamo() {
        return objetosEnPrestamo;
    }

    public void setObjetosEnPrestamo(HashSet<Prestable> objetosEnPrestamo) {
        this.objetosEnPrestamo = objetosEnPrestamo;
    }
}

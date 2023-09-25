package SistemaGraduacion;

import personas.Persona;

import java.util.HashMap;

public class Alumno extends Persona {
    private HashMap<Examen, Boolean> examenesRendidos;

    public Alumno(String nombre, String apellido, int dni, HashMap<Examen, Boolean> examenesRendidos) {
        super(nombre, apellido, dni);
        this.examenesRendidos = examenesRendidos;
    }

    public HashMap<Examen, Boolean> getExamenesRendidos() {
        return examenesRendidos;
    }

    public void setExamenesRendidos(HashMap<Examen, Boolean> examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }
}

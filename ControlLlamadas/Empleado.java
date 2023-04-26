package ControlLlamadas;

import personas.Persona;
import tiempos.Fecha;

public class Empleado extends Persona {
    private int dni;
    private String pais;

    public Empleado(){
        super("Ciro","Cerutti",1155667788);
        this.dni=12345678;
        this.pais="Argentina";
    }
    public Empleado(String nombre, String apellido, int numeroTelefono, int dni, String pais) {
        super(nombre, apellido, numeroTelefono);
        this.dni = dni;
        this.pais = pais;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

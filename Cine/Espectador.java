package Cine;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Espectador extends Persona {
    private int identificador;
    private static int contador=0;
    private String mailRegistro;
    private HashSet<Funcion>historial;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Espectador.contador = contador;
    }

    public String getMailRegistro() {
        return mailRegistro;
    }

    public void setMailRegistro(String mailRegistro) {
        this.mailRegistro = mailRegistro;
    }

    public HashSet<Funcion> getHistorial() {
        return historial;
    }

    public void setHistorial(HashSet<Funcion> historial) {
        this.historial = historial;
    }

    public Espectador(int identificador, String mailRegistro, HashSet<Funcion> historial) {
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, String apellido, LocalDate fecha_nacimiento, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, apellido, fecha_nacimiento);
        contador++;
        this.identificador = contador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, String apellido, int numeroTelefono, int identificador, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, apellido, numeroTelefono);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, String apellido, int identificador, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, apellido);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion, int identificador, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, apellido, edad, fecha_nacimiento, direccion);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni, int identificador, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, apellido, fecha_nacimiento, direccion, dni);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }

    public Espectador(String nombre, int edad, int identificador, String mailRegistro, HashSet<Funcion> historial) {
        super(nombre, edad);
        this.identificador = identificador;
        this.mailRegistro = mailRegistro;
        this.historial = historial;
    }
}

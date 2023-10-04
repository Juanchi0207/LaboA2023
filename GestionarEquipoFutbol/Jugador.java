package GestionarEquipoFutbol;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Jugador extends Persona implements Estadisticas {
    private Posicion posicion;
    private Provincia provincia;
    private HashSet<Equipo>listaEquiposPasados;
    private int numCamiseta;
    private boolean contratado;
    private LocalDate fechaVencimiento;
    private Equipo equipoActual;

    public Jugador(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo> listaEquiposPasados, int numCamiseta, boolean contratado, LocalDate fechaVencimiento, Equipo equipoActual) {
        super(nombre, apellido, dni, fecha_nacimiento);
        this.posicion = posicion;
        this.provincia = provincia;
        this.listaEquiposPasados = listaEquiposPasados;
        this.numCamiseta = numCamiseta;
        this.contratado = contratado;
        this.fechaVencimiento = fechaVencimiento;
        this.equipoActual = equipoActual;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<Equipo> getListaEquiposPasados() {
        return listaEquiposPasados;
    }

    public void setListaEquiposPasados(HashSet<Equipo> listaEquiposPasados) {
        this.listaEquiposPasados = listaEquiposPasados;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Equipo getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipo equipoActual) {
        this.equipoActual = equipoActual;
    }
}

package ControlLlamadas;

import tiempos.Fecha;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private Fecha fecha_llamada;
    private int duracion;

    public Llamada(Empleado origen, Empleado destino, Fecha fecha_llamada, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha_llamada = fecha_llamada;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public Fecha getFecha_llamada() {
        return fecha_llamada;
    }

    public void setFecha_llamada(Fecha fecha_llamada) {
        this.fecha_llamada = fecha_llamada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

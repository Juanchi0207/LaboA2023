package GestionarEquipoFutbol;

import java.time.LocalDate;
import java.util.HashSet;

public class Arquero extends Jugador implements Estadisticas{
    private double porcentajeAtajadas;
    private int cantAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo> listaEquiposPasados, int numCamiseta, boolean contratado, LocalDate fechaVencimiento, Equipo equipoActual, double porcentajeAtajadas, int cantAtajadas, int golesRecibidos) {
        super(nombre, apellido, dni, fecha_nacimiento, posicion, provincia, listaEquiposPasados, numCamiseta, contratado, fechaVencimiento, equipoActual);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.cantAtajadas = cantAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(double porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getCantAtajadas() {
        return cantAtajadas;
    }

    public void setCantAtajadas(int cantAtajadas) {
        this.cantAtajadas = cantAtajadas;
    }

    @Override
    public void modificarEstadisticas(int goles, int atajadas) {
        this.golesRecibidos=golesRecibidos+goles;
        this.cantAtajadas=cantAtajadas+atajadas;
        porcentajeAtajadas=(cantAtajadas*100)/(cantAtajadas+golesRecibidos);
    }
}

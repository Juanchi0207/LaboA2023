package GestionarEquipoFutbol;

import java.time.LocalDate;
import java.util.HashSet;

public class JugadorCampo extends Jugador implements Estadisticas{
    private int golesConvertidos;
    private int cantAsistencias;

    public JugadorCampo(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo> listaEquiposPasados, int numCamiseta, boolean contratado, LocalDate fechaVencimiento, Equipo equipoActual, int golesConvertidos, int cantAsistencias) {
        super(nombre, apellido, dni, fecha_nacimiento, posicion, provincia, listaEquiposPasados, numCamiseta, contratado, fechaVencimiento, equipoActual);
        this.golesConvertidos = golesConvertidos;
        this.cantAsistencias = cantAsistencias;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
    @Override
    public void modificarEstadisticas(int goles, int asistencias) {
        cantAsistencias=cantAsistencias+asistencias;
        golesConvertidos=golesConvertidos+goles;
    }
}

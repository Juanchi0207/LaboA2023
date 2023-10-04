package GestionarEquipoFutbol;

import java.util.ArrayList;
import java.util.HashMap;

public class Partido {
    private Equipo local;
    private int golesLocal;
    private Equipo visitante;
    private int golesVisitante;
    private HashMap<Jugador, ArrayList<Integer>>estadisticasJugador;

    public Partido(Equipo local, int golesLocal, Equipo visitante, int golesVisitante, HashMap<Jugador, ArrayList<Integer>> estadisticasJugador) {
        this.local = local;
        this.golesLocal = golesLocal;
        this.visitante = visitante;
        this.golesVisitante = golesVisitante;
        this.estadisticasJugador = estadisticasJugador;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public HashMap<Jugador, ArrayList<Integer>> getEstadisticasJugador() {
        return estadisticasJugador;
    }

    public void setEstadisticasJugador(HashMap<Jugador, ArrayList<Integer>> estadisticasJugador) {
        this.estadisticasJugador = estadisticasJugador;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}

package GestionarEquipoFutbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Equipo implements Contrato{
    private HashSet<Jugador>listaJugadores;
    private String nombre;
    private HashSet<Partido>partidosJugados;

    public Equipo(HashSet<Jugador> listaJugadores, String nombre, HashSet<Partido> partidosJugados) {
        this.listaJugadores = listaJugadores;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
    }

    public HashSet<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(HashSet<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void agregarPartido(Partido partido){
        partidosJugados.add(partido);
        for (Map.Entry<Jugador, ArrayList<Integer>>stats:partido.getEstadisticasJugador().entrySet()){
            stats.getKey().modificarEstadisticas(stats.getValue().get(0),stats.getValue().get(1));
        }
    }

    public int verificarEdad(Jugador jugador){
        return LocalDate.now().getYear()-jugador.getFecha_nacimiento().getYear();
    }

    @Override
    public void Contratar(Jugador jugador) throws CriteriosContratoException {
        if (!jugador.getListaEquiposPasados().contains(this)){
            if (jugador instanceof Arquero && ((Arquero) jugador).getPorcentajeAtajadas()>60 && ((Arquero) jugador).getGolesRecibidos()<10){
                listaJugadores.add(jugador);
                jugador.getListaEquiposPasados().add(this);
                jugador.setContratado(true);
                System.out.println("Jugador contratado");

            }
            else if (jugador instanceof JugadorCampo && ((JugadorCampo) jugador).getGolesConvertidos()>30 && ((JugadorCampo) jugador).getCantAsistencias()>10){
                listaJugadores.add(jugador);
                jugador.setContratado(true);
                jugador.getListaEquiposPasados().add(this);
                System.out.println("Jugador contratado");
            }
            else {
                throw new CriteriosContratoException("El jugador no cumple los criterios necesarios");
            }
        }
        else {
            throw new CriteriosContratoException("El jugador ya paso por este club");
        }
    }

    @Override
    public void Renovar(Jugador jugador) throws CriteriosRenovarException {
        if (jugador.getFechaVencimiento().isBefore(LocalDate.now())){
            if (jugador.getEquipoActual().equals(this)){
                if (verificarEdad(jugador)<35){
                    listaJugadores.add(jugador);
                    System.out.println("Jugador renovado");
                    jugador.setFechaVencimiento(LocalDate.now().plusMonths(6));
                }
                else {
                    throw new CriteriosRenovarException("El jugador pasa la edad de renovacion");
                }
            }
            else {
                throw new CriteriosRenovarException("El equipo no es el actual del jugador");
            }
        }
        else {
            throw new CriteriosRenovarException("El jugador tiene su contrato activo todavia");
        }

    }
}

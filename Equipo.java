import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador>jugadores;
    private String barrio_procedencia;

    private String turno;

    public void agregarEquipo(){

    }

    public void agregarJugador(Jugador nuevoJugador){
        if(!numRep(nuevoJugador.getNum_camiseta())){
            jugadores.add(nuevoJugador);
        }
    }

    public Boolean numRep(int numeroCamiseta){
        boolean esRepetido = false;
        for (Jugador jugador: jugadores){
            if(jugador.getNum_camiseta() == numeroCamiseta) {
                esRepetido = true;
            }
        }
        return esRepetido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getBarrio_procedencia() {
        return barrio_procedencia;
    }

    public void setBarrio_procedencia(String barrio_procedencia) {
        this.barrio_procedencia = barrio_procedencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores, String barrio_procedencia, String turno) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.barrio_procedencia = barrio_procedencia;
        this.turno = turno;
    }
}



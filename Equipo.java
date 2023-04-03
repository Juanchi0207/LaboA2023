import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador>jugadores;
    private String barrio_procedencia;
    //private /** disponibilidad horaria */disponibilidadh;*/

    public Boolean numRep(int numeroCamiseta){
        boolean esRepetido = false;
        for (Jugador jugador: jugadores){
            if(jugador.getNum_camiseta() == numeroCamiseta) {
                esRepetido = true;
            }
        }
        return esRepetido;
    }

    public void agregarJugador(Jugador nuevoJugador){
        if(numRep(nuevoJugador.getNum_camiseta()) == false){
            jugadores.add(nuevoJugador);
        }
    }




}



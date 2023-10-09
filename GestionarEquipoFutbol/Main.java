package GestionarEquipoFutbol;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws CriteriosContratoException {
        Equipo equipo = new Equipo(new HashSet<>(), "Burrones", new HashSet<>());
        Jugador jugador1=new JugadorCampo("Juan", "Sampieri", 1, LocalDate.of(2005, 7, 2), Posicion.DELANTERO, Provincia.BUENOS_AIRES, new HashSet<>(), 10, false, LocalDate.of(2023, 10, 10), null, 31, 11);
        equipo.Contratar(jugador1);
        Jugador jugador2=new JugadorCampo("Juan", "Sampieri", 1, LocalDate.of(2005, 7, 2), Posicion.DELANTERO, Provincia.BUENOS_AIRES, new HashSet<>(), 10, false, LocalDate.of(2023, 10, 10), null, 29, 11);
        equipo.Contratar(jugador2);
    }
}

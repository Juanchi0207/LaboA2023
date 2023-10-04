package GestionarEquipoFutbol;

public interface Contrato {
    void Contratar(Jugador jugador) throws CriteriosContratoException;
    void Renovar(Jugador jugador) throws CriteriosRenovarException;
}

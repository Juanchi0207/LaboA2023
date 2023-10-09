package GestionarRestaurante;

public interface AgregacionesRestaurante {
    void agregarChef(Chef chef) throws ExceptionAgregarChef;
    void agregarPlato(Plato plato) throws ExceptionAgregarPlato;
}

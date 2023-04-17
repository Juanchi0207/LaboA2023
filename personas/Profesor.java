package personas;

public class Profesor extends Persona{
    private int porcentajeDescuento;

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Profesor(String nombre, String apellido, int porcentajeDescuento) {
        super(nombre, apellido);
        this.porcentajeDescuento = porcentajeDescuento;
    }
}

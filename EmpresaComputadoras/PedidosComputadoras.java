package EmpresaComputadoras;
import personas.Persona;

public class PedidosComputadoras{
    private Computadora computadora;
    private Persona persona;
    private int precioTotal;
    private MetodoPago metodoPago;

    public PedidosComputadoras(Computadora computadora, Persona persona,int precioTotal, MetodoPago metodoPago) {
        this.computadora = computadora;
        this.persona = persona;
        this.precioTotal = precioTotal;
        this.metodoPago = metodoPago;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}

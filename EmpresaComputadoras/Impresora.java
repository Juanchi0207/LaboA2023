package EmpresaComputadoras;

public class Impresora extends Salida{
    private String metodo;

    public Impresora(String fabricante, String modelo, int precio, int stock, String puertoValido, String metodo) {
        super(fabricante, modelo, precio, stock, puertoValido);
        this.metodo = metodo;
    }

    public Impresora(){
        super("AMD", "I56",200,10,"VGA");
        this.metodo="Inyeccion";
    }
}

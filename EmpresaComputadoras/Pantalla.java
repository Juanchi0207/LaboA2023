package EmpresaComputadoras;

public class Pantalla extends Salida{
    public Pantalla(String fabricante, String modelo, int precio, int stock, String puertoValido) {
        super(fabricante, modelo, precio, stock, puertoValido);
    }
    public Pantalla(){
        super("GIGABYTE", "IPS45", 500, 21, "HDMI");
    }
}

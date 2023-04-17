package EmpresaComputadoras;

public class Teclado extends Entrada{
    public Teclado(String fabricante, String modelo, int precio, int stock, String tipo, String tipoConector, String puertoValido) {
        super(fabricante, modelo, precio, stock, tipoConector, puertoValido);
    }

    public Teclado(){
        super("RAZER", "HUNTSMAN", 450, 12, "USB", "USB 3.0");
    }

}

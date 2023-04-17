package EmpresaComputadoras;

public class Salida extends Componentes{
    private String puertoValido;

    public Salida(String fabricante, String modelo, int precio, int stock, String puertoValido) {
        super(fabricante, modelo, precio, stock);
        this.puertoValido = puertoValido;
    }
}

package EmpresaComputadoras;

public class Entrada extends Componentes {
    private String tipoConector;
    private String puertoValido;

    public Entrada(String fabricante, String modelo, int precio, int stock, String tipoConector, String puertoValido) {
        super(fabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.puertoValido = puertoValido;
    }

}

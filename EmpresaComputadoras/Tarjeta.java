package EmpresaComputadoras;

public class Tarjeta extends MetodoPago{
    private int numTarjeta;
    private String banco;
    private String tipo;

    public Tarjeta(int numTarjeta, String banco, String tipo) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.tipo = tipo;
    }
}

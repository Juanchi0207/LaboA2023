package Banco;


import personas.Cliente;

public class Cheque {
    private Cliente emisor;
    private Cliente receptor;
    private int monto;

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public Cliente getReceptor() {
        return receptor;
    }

    public void setReceptor(Cliente receptor) {
        this.receptor = receptor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Cheque(Cliente emisor, Cliente receptor, int monto) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.monto = monto;
    }
}

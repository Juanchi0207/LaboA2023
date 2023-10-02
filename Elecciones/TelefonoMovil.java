package Elecciones;

public class TelefonoMovil extends Dispositivo implements Mensajeria{
    private Compania compania;
    private int numCelular;
    private boolean prendido;
    private float credito;

    public TelefonoMovil(int num_serie, String fabricante, String modelo, Compania compania, int numCelular, boolean prendido, float credito) {
        super(num_serie, fabricante, modelo);
        this.compania = compania;
        this.numCelular = numCelular;
        this.prendido = prendido;
        this.credito = credito;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }


    @Override
    public void hacerCampaña(PartidoPolitico partidoPolitico) {
        if (isPrendido() && getCredito()>0) {
            System.out.println("Conectando con la antena mas cercana... Vote por " + partidoPolitico.getNombre() + " para un mejor futuro");
            credito=credito-20;
        }
        else {
            System.out.println("El telefono no esta prendido o no tiene credito");
        }
    }
}

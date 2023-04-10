public class Camioneta extends Vehiculo{
    private String patente;
    private int capacidadCarga;

    public Camioneta(String patente, int capacidadCarga) {
        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(String marca, String modelo, String color, int cantRuedas, int anioFabricacion, String patente, int capacidadCarga) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}

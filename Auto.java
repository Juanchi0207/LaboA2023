public class Auto extends Vehiculo{
    private String patente;
    private boolean descapotable;

    public Auto(String patente, boolean descapotable) {
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public Auto(String marca, String modelo, String color, int cantRuedas, int anioFabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}

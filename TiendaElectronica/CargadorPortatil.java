package TiendaElectronica;

public class CargadorPortatil extends Cargadores{
    private int cantCargas;

    public CargadorPortatil(int cantCargas) {
        this.cantCargas = cantCargas;
    }

    public CargadorPortatil(String nombre, int stock, float precio, int cantCargas) {
        super(nombre, stock, precio);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}

package TiendaElectronica;

public class EquipoSonido extends Multimedia{
    private boolean bluetooth;

    public EquipoSonido(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public EquipoSonido(String nombre, int stock, float precio, boolean bluetooth) {
        super(nombre, stock, precio);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}

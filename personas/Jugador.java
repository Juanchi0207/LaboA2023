package personas;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Fecha nacimiento;
    private boolean capitania;
    private int num_camiseta;

    public boolean isCapitania() {
        return capitania;
    }

    public void setCapitania(boolean capitania) {
        this.capitania = capitania;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public Jugador(){
        this.nombre="Ciro";
        this.nacimiento=new Fecha();
        this.capitania=true;
        this.num_camiseta=10;

    }
    public Jugador(String nombre, Fecha nacimiento, boolean capitania, int num_camiseta) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.capitania = capitania;
        this.num_camiseta = num_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public static void main(String[] args) {

    }
}

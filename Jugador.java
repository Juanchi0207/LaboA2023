import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Fecha nacimiento;
    private int camiseta;
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

    public Jugador(String nombre, Fecha nacimiento, int camiseta, boolean capitania, int num_camiseta) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.camiseta = camiseta;
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

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public static void main(String[] args) {

    }
}

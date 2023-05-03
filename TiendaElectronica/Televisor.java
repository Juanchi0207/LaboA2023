package TiendaElectronica;

public class Televisor  extends Multimedia{
    private String tecnologia;
    private int resolucion;
    public Televisor(){
        this.resolucion=4500;
        this.tecnologia="FullHD";
    }

    public Televisor(String tecnologia, int resolucion) {
        this.tecnologia = tecnologia;
        this.resolucion=resolucion;
    }

    public Televisor(String nombre, int stock, float precio, String tecnologia, int resolucion) {
        super(nombre, stock, precio);
        this.tecnologia = tecnologia;

    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}

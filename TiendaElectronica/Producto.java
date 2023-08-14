package TiendaElectronica;
public abstract class Producto {
    private String nombre;
    private int stock;
    private float precio;

    public Producto(){
        this.nombre="LG 45";
        this.stock=45;
        this.precio=10;
    }

    public Producto(String nombre, int stock, float precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
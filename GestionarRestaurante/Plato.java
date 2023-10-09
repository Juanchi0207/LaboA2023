package GestionarRestaurante;

public class Plato {
    private String nombre;
    private String descripcion;
    private int precio;
    private TiposPlato tipo;
    private Chef encargado;

    public Plato(String nombre, String descripcion, int precio, TiposPlato tipo, Chef encargado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TiposPlato getTipo() {
        return tipo;
    }

    public void setTipo(TiposPlato tipo) {
        this.tipo = tipo;
    }

    public Chef getEncargado() {
        return encargado;
    }

    public void setEncargado(Chef encargado) {
        this.encargado = encargado;
    }
}

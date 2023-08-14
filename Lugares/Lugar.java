package Lugares;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenadas>latYlong;

    public Lugar(String nombre, int codigo, HashSet<Coordenadas> latYlong) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.latYlong = latYlong;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenadas> getLatYlong() {
        return latYlong;
    }

    public void setLatYlong(HashSet<Coordenadas> latYlong) {
        this.latYlong = latYlong;
    }

    public abstract int calcularPoblacion();

}

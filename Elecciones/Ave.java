package Elecciones;

import SistemaPrestamos.Color;

public class Ave {
    private String nombre;
    private Color color;
    private String especie;

    public Ave(String nombre, Color color, String especie) {
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

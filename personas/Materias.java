package personas;

import java.util.ArrayList;

public class Materias {
    private String nombre;
    private ArrayList<Double>notas;


    public Materias(String nombre, ArrayList<Double> listanotas) {
        this.nombre = nombre;
        this.notas = listanotas;
    }

    public Materias() {
        this.nombre = " ";
        this.notas = new ArrayList<Double>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getListanotas() {
        return notas;
    }

    public void setListanotas(ArrayList<Double> listanotas) {
        this.notas = listanotas;
    }


}



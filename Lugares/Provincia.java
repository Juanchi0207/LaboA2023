package Lugares;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad>listaCiudades;

    public Provincia(String nombre, int codigo, HashSet<Coordenadas> latYlong, HashSet<Ciudad> listaCiudades) {
        super(nombre, codigo, latYlong);
        this.listaCiudades = listaCiudades;
    }

    public HashSet<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(HashSet<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    @Override
    public int calcularPoblacion() {
        int poblacion=0;
        for(Lugar ciud:listaCiudades){
            int temp=ciud.calcularPoblacion();
            poblacion=poblacion+temp;
        }
        return poblacion;
    }
}

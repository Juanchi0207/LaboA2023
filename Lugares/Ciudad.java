package Lugares;

import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio>listaBarrios;

    public Ciudad(String nombre, int codigo, HashSet<Coordenadas> latYlong, HashSet<Barrio> listaBarrios) {
        super(nombre, codigo, latYlong);
        this.listaBarrios = listaBarrios;
    }

    public HashSet<Barrio> getListaBarrios() {
        return listaBarrios;
    }

    public void setListaBarrios(HashSet<Barrio> listaBarrios) {
        this.listaBarrios = listaBarrios;
    }


    @Override
    public int calcularPoblacion(){
        int poblacion=0;
        for(Lugar barrio:listaBarrios){
            int temp= barrio.calcularPoblacion();
            poblacion=poblacion+temp;
        }
        return poblacion;
    }
}

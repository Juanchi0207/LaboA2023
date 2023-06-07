package Lugares;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais>listaPaises;

    public Continente(String nombre, int codigo, HashSet<Coordenadas> latYlong, HashSet<Pais> listaPaises) {
        super(nombre, codigo, latYlong);
        this.listaPaises = listaPaises;
    }

    public HashSet<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(HashSet<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    @Override
    public int calcularPoblacion() {
        int poblacion=0;
        for(Lugar pais:listaPaises){
            int temp=pais.calcularPoblacion();
            poblacion=poblacion+temp;
        }
        return poblacion;
    }
}

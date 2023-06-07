package Lugares;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia>listaProvincias;

    public Pais(String nombre, int codigo, HashSet<Coordenadas> latYlong, HashSet<Provincia> listaProvincias) {
        super(nombre, codigo, latYlong);
        this.listaProvincias = listaProvincias;
    }

    public HashSet<Provincia> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias(HashSet<Provincia> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }

    @Override
    public int calcularPoblacion() {
        int poblacion=0;
        for(Lugar prov:listaProvincias){
            int temp=prov.calcularPoblacion();
            poblacion=poblacion+temp;
        }
        return poblacion;
    }
}

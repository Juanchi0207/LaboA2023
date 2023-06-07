package Lugares;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Lugar>lugares;

    public Sistema(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void agregarLugar(Lugar lugar1){
        lugares.add(lugar1);
    }
    public void eliminarLugar(Lugar lugar1){
        lugares.remove(lugar1);
    }
    public void modificarLugar(Lugar lugar1, Lugar lugar2){
        lugares.remove(lugar1);
        lugares.add(lugar2);
    }
    public int pobXcodigo(int cod){
        int pob=0;
        for(Lugar lug:lugares){
            if(lug.getCodigo()==cod){
                pob=lug.calcularPoblacion();
            }
        }
        return pob;
    }

    public void pantallaInfo(){
        int paisMax=-1;
        int paisMin=-1;
        int contMax=-1;
        int contMin=-1;
        String paisMaxNom="";
        String paisMinNom="";
        String contMaxNom="";
        String contMinNom="";
        for(Lugar lugar:lugares){
            if (lugar instanceof Pais){
                if(paisMax==-1||((Pais) lugar).calcularPoblacion()>paisMax){
                    paisMax= ((Pais) lugar).calcularPoblacion();
                    paisMaxNom=lugar.getNombre();
                }
            }
        }
        for(Lugar lugar:lugares){
            if (lugar instanceof Pais){
                if(paisMax==-1||((Pais) lugar).calcularPoblacion()<paisMin){
                    paisMin= ((Pais) lugar).calcularPoblacion();
                    paisMinNom=lugar.getNombre();
                }
            }
        }
        for(Lugar lugar:lugares){
            if (lugar instanceof Continente){
                if(contMax==-1||((Continente) lugar).calcularPoblacion()>contMax){
                    contMax= ((Continente) lugar).calcularPoblacion();
                    contMaxNom=lugar.getNombre();
                }
            }
        }
        for(Lugar lugar:lugares){
            if (lugar instanceof Pais){
                if(contMin==-1||((Continente) lugar).calcularPoblacion()<contMin){
                    contMin= ((Continente) lugar).calcularPoblacion();
                    contMinNom=lugar.getNombre();
                }
            }
        }

        System.out.println("El pais con menos poblacion es: " + paisMinNom);
        System.out.println("El pais con mas poblacion es: " + paisMaxNom);
        System.out.println("El continente con menos poblacion es: " + contMinNom);
        System.out.println("El continente con mas poblacion es: " + contMaxNom);
    }
}


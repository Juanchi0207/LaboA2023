package Elecciones;

import java.time.LocalDate;
import java.util.HashSet;

public class Sistema {
    private HashSet<PartidoPolitico>listaPartidos;

    public Sistema(HashSet<PartidoPolitico> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public HashSet<PartidoPolitico> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<PartidoPolitico> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void hacerCampaña(){
        for (PartidoPolitico partidoPolitico:listaPartidos){
            for (Mensajeria mensajero:partidoPolitico.getListaEnviadores()){
                mensajero.hacerCampaña(partidoPolitico);
            }
        }
    }

    void agregarMensajero(){

    }

    public static void main(String[] args) {

    }
}

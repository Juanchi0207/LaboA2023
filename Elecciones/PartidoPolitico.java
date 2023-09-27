package Elecciones;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String oficinaCentral;
    private int cantidadAfiliados;
    private HashSet<Mensajeria>listaEnviadores;

    public PartidoPolitico(String nombre, String oficinaCentral, int cantidadAfiliados, HashSet<Mensajeria> listaEnviadores) {
        this.nombre = nombre;
        this.oficinaCentral = oficinaCentral;
        this.cantidadAfiliados = cantidadAfiliados;
        this.listaEnviadores = listaEnviadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficinaCentral() {
        return oficinaCentral;
    }

    public void setOficinaCentral(String oficinaCentral) {
        this.oficinaCentral = oficinaCentral;
    }

    public int getCantidadAfiliados() {
        return cantidadAfiliados;
    }

    public void setCantidadAfiliados(int cantidadAfiliados) {
        this.cantidadAfiliados = cantidadAfiliados;
    }

    public HashSet<Mensajeria> getListaEnviadores() {
        return listaEnviadores;
    }

    public void setListaEnviadores(HashSet<Mensajeria> listaEnviadores) {
        this.listaEnviadores = listaEnviadores;
    }
}

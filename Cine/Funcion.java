package Cine;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private LocalDateTime fechaYhora;
    private Sala sala;
    private int entradasVendidas;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public Funcion(Pelicula pelicula, LocalDateTime fechaYhora, Sala sala, int entradasVendidas) {
        this.pelicula = pelicula;
        this.fechaYhora = fechaYhora;
        this.sala = sala;
        this.entradasVendidas = entradasVendidas;
    }

    public boolean disponbilidad(){
        if (fechaYhora.isAfter(LocalDateTime.now())&&entradasVendidas<Sala.getButacas()){
            return true;
        }
        return false;
    }

}

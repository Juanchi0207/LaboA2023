package Cine;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Funcion>listaFunciones;
    private HashSet<Espectador>listaEspectadores;

    public void setListaFunciones(HashSet<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    public void setListaEspectadores(HashSet<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public HashSet<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public HashSet<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public Sistema(HashSet<Funcion> listaFunciones, HashSet<Espectador> listaEspectadores) {
        this.listaFunciones = listaFunciones;
        this.listaEspectadores = listaEspectadores;
    }

    public void agregarFuncion(Pelicula pelicula, LocalDateTime fechaYhora, Sala sala, int entradasVendidas){
        listaFunciones.add(new Funcion(pelicula,fechaYhora,sala,entradasVendidas));
    }

    public int cantUsuarios(){
        return Espectador.getContador();
    }

    public int cantPeliculas(){
        return Pelicula.getContador();
    }

    public void funcionesDisponibles(){
        for (Funcion funcion:listaFunciones){
            if (funcion.disponbilidad()){
                System.out.println("La funcion de " + funcion.getPelicula().getTitulo() + " a las " + funcion.getFechaYhora() + " Esta disponible");
            }
        }
    }

    public Pelicula peliculaMasVista(){
        HashMap<Pelicula, Integer>peliculas=new HashMap<Pelicula,Integer>();
        for (Funcion funcion:listaFunciones){
            Pelicula peliculaAux=funcion.getPelicula();
            int entradasVendidas=funcion.getEntradasVendidas();
            if (peliculas.containsKey(peliculaAux)){
                peliculas.put(peliculaAux,peliculas.get(peliculaAux)+entradasVendidas);
            }
            else {
                peliculas.put(peliculaAux,funcion.getEntradasVendidas());
            }
        }
        Pelicula peliculaAux=null;
        int ventasTotales=0;
        for (Map.Entry<Pelicula, Integer>ventas:peliculas.entrySet()){
            if (ventas.getValue()>ventasTotales){
                peliculaAux=ventas.getKey();
                ventasTotales=ventas.getValue();
            }
        }
        return peliculaAux;
    }

    public Espectador menorCantidadDeFunciones(){
        Espectador espectador=null;
        for (Espectador espectadorAux:listaEspectadores){
            if (espectador!=null&&espectador.getHistorial().size()<espectadorAux.getHistorial().size()){
                espectador=espectadorAux;
            }
            else {
                espectador=espectadorAux;
            }
        }
        return espectador;
    }

    public static void main(String[] args) {
        Sistema sistema=new Sistema(new HashSet<>(),new HashSet<>());
        Pelicula pelicula1=new Pelicula("Star Wars: Episiodio 5", 2.34, Genero.ACCION);
        Pelicula pelicula2=new Pelicula("La historia de gonzalo", 2.12, Genero.COMEDIA);
        Sala sala1=new Sala();
        Sala sala2=new Sala();
        Sala sala3=new Sala();
        Sala sala4=new Sala();
        Funcion funcion1=new Funcion(pelicula1, LocalDateTime.now(),sala1,25);
        Funcion funcion2=new Funcion(pelicula2,LocalDateTime.now(),sala2,30);
        sistema.listaFunciones.add(funcion1);
        sistema.listaFunciones.add(funcion2);
        Espectador espectador1=new Espectador("Julius","Gonzalus", LocalDate.parse("2005-07-02"),"julius.gonzalus@gmail.com",new HashSet<>());
        Espectador espectador2=new Espectador("Juan", "Sampi", LocalDate.parse("2005-11-29"),"juanchi.sampieri@gmail.com",new HashSet<>());
        sistema.listaEspectadores.add(espectador1);
        sistema.listaEspectadores.add(espectador2);

        sistema.funcionesDisponibles();
        System.out.println(sistema.cantPeliculas());
        System.out.println(sistema.cantUsuarios());
    }
}

import personas.Persona;
import tiempos.Fecha;

import java.util.ArrayList;

public class CD {
        private ArrayList<Cancion> Canciones;


        public CD() {
            Canciones =new ArrayList<Cancion>() ;
        }

        public void agregar(Cancion cancion){
            Canciones.add(cancion);
        }
        public void elimina(int posición){
            Canciones.remove(posición);
        }
        public void grabaCancion(int posición, Cancion nuevaCancion){
            Canciones.set(posición,nuevaCancion);
        }
        public void verCancion(int posicion){
            Cancion ver =Canciones.get(posicion);
            System.out.println(ver.getTitulo());
        }
        public int numeroCanciones1(){
            return Canciones.size();
        }
        public ArrayList<Cancion> getCanciones() {
            return Canciones;
        }

        public void setCanciones(ArrayList<Cancion> canciones) {
            Canciones = canciones;
        }

    public static void main(String[] args) {
       // Cancion cancion = new Cancion(new Persona("Harry","Styles" ,25 , new Fecha(),"Harry's house"),"Matilda");
        CD disco = new CD();
        //disco.agregar(cancion);
    }
    }


package PASO;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Candidato extends Persona {

     private HashSet<String> ListaPropuestas;
     private HashMap<Provincia, Integer> cantidadVotos;

     public HashSet<String> getListaPropuestas() {
          return ListaPropuestas;
     }

     public void setListaPropuestas(HashSet<String> listaPropuestas) {
          ListaPropuestas = listaPropuestas;
     }

     public HashMap<Provincia, Integer> getCantidadVotos() {
          return cantidadVotos;
     }

     public void setCantidadVotos(HashMap<Provincia, Integer> cantidadVotos) {
          this.cantidadVotos = cantidadVotos;
     }

     public Candidato(HashSet<String> listaPropuestas, HashMap<Provincia, Integer> cantidadVotos) {
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cantidadVotos;
     }

     public Candidato(String nombre, String apellido, LocalDate fecha_nacimiento, HashSet<String> listaPropuestas) {
          super(nombre, apellido, fecha_nacimiento);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cargarProvincias();
     }

     public Candidato(String nombre, String apellido, int numeroTelefono, HashSet<String> listaPropuestas) {
          super(nombre, apellido, numeroTelefono);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cargarProvincias();
     }

     public Candidato(String nombre, String apellido, HashSet<String> listaPropuestas) {
          super(nombre, apellido);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cargarProvincias();
     }

     public Candidato(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion, HashSet<String> listaPropuestas, HashMap<Provincia, Integer> cantidadVotos) {
          super(nombre, apellido, edad, fecha_nacimiento, direccion);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cantidadVotos;
     }

     public Candidato(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni, HashSet<String> listaPropuestas, HashMap<Provincia, Integer> cantidadVotos) {
          super(nombre, apellido, fecha_nacimiento, direccion, dni);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cantidadVotos;
     }

     public Candidato(String nombre, int edad, HashSet<String> listaPropuestas, HashMap<Provincia, Integer> cantidadVotos) {
          super(nombre, edad);
          ListaPropuestas = listaPropuestas;
          this.cantidadVotos = cantidadVotos;
     }

     public void agregarVoto(Provincia p){
          this.cantidadVotos.put(p, this.cantidadVotos.get(p)+1);
     }

     public HashMap<Provincia, Integer> cargarProvincias(){
          HashMap<Provincia,Integer>aux=new HashMap<>();
          for (Provincia provincia:Provincia.values()){
               aux.put(provincia,0);
          }
          return aux;
     }
}

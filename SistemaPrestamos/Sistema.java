package SistemaPrestamos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema{
    private HashSet<Prestable>objetosPrestables;

    public Sistema(HashSet<Prestable> objetosPrestables) {
        this.objetosPrestables = objetosPrestables;
    }

    public HashSet<Prestable> getObjetosPrestables() {
        return objetosPrestables;
    }

    public void setObjetosPrestables(HashSet<Prestable> objetosPrestables) {
        this.objetosPrestables = objetosPrestables;
    }

    public void agregarElemento(Prestable prestable){
        if (prestable.agregarElemento()){
            objetosPrestables.add(prestable);
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema(new HashSet<>());
        HashMap<Integer, Integer> capsLibro =new HashMap<>();
        capsLibro.put(1,10);
        capsLibro.put(2, 25);
        capsLibro.put(3, 14);
        Libro libro = new Libro(1,"el juan", 2023, capsLibro);
        Revista revista = new Revista(01, "PlayBoy Gonzi",1998, LocalDate.of(1998,02,02));
        Remera remera =new Remera(Color.ROJO,Materiales.POLIESTER,"Gondidas","Mal estado",70,56,75);
        sistema.agregarElemento(libro);
        sistema.agregarElemento(revista);
        sistema.agregarElemento(remera);
    }
}

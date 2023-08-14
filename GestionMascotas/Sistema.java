package GestionMascotas;

import personas.Dueño;

import java.util.HashSet;

public class Sistema {
    private HashSet<Mascota>listaMascotas;

    public Sistema() {
        this.listaMascotas = new HashSet<Mascota>();
    }

    public HashSet<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(HashSet<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public void altaMascota(Mascota mascota1){
        listaMascotas.add(mascota1);
    }

    public void bajaMascota(Mascota mascota1){
        listaMascotas.remove(mascota1);
    }

    public void modificarMascota(Mascota mascota, Mascota mascota1){
        listaMascotas.remove(mascota);
        listaMascotas.add(mascota1);
    }

}

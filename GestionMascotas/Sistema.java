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

    public void llamarSaludo(String nomDuenio, String nomMascota){
        Mascota mascotaAux=null;
        for (Mascota mascota1:listaMascotas){
            if (nomMascota.equals(mascota1.getNombre())){
                System.out.println(mascota1.Saludo(nomDuenio,nomMascota));
                if (mascota1 instanceof Pez&&((Pez) mascota1).getVidas()==0){
                    mascotaAux=mascota1;
                }
            }
        }
        if (mascotaAux!=null){
            bajaMascota(mascotaAux);
        }
    }
    public void llamarAlimentar(String nomMascota){
        for (Mascota mascota1:listaMascotas){
            if (nomMascota.equals(mascota1.getNombre())){
                mascota1.alimentar(nomMascota);
            }
        }
    }

    public void llamarTipos(String nomMascota){
        for (Mascota mascota1:listaMascotas){
            if(nomMascota.equals(mascota1.getNombre())){
                System.out.println(mascota1.tipo(nomMascota));
            }
        }
    }

    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        Perro perro=new Perro("Rocco", new Dueño("Lucas", "Panzera"));
        sistema.altaMascota(perro);
        Gato gato=new Gato("Ragnar", new Dueño("Juan", "Sampieri"));
        sistema.altaMascota(gato);
        Pajarito pajarito=new Pajarito("Alfredo", new Dueño("Ciro", "Cerutti"));
        sistema.altaMascota(pajarito);
        Cantor cantor=new Cantor("Tobias", new Dueño("Ian","Brandon"));
        sistema.altaMascota(cantor);
        Pez pez=new Pez("Nemo", new Dueño("Julian", "Gonzi"));
        sistema.altaMascota(pez);
        sistema.llamarSaludo("Lucas", "Rocco");
        sistema.llamarSaludo("Ciro", "Rocco");
        sistema.llamarAlimentar("Rocco");
        sistema.llamarAlimentar("Rocco");
        sistema.llamarAlimentar("Rocco");
        sistema.llamarSaludo("Lucas", "Rocco");
        sistema.llamarSaludo("Julian", "Nemo");
        sistema.llamarTipos("Alfredo");
    }
}


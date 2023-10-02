package Elecciones;

import SistemaPrestamos.Color;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
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
            System.out.println(partidoPolitico.getNombre());
            for (Mensajeria mensajero:partidoPolitico.getListaEnviadores()){
                mensajero.hacerCampaña(partidoPolitico);
            }
            System.out.println("---------------------");
        }
    }

    void agregarMensajero(Mensajeria mensajero, PartidoPolitico partidoPolitico){
        for (PartidoPolitico partido:listaPartidos){
            if (partido==partidoPolitico){
                HashSet<Mensajeria>aux=partido.getListaEnviadores();
                aux.add(mensajero);
                partido.setListaEnviadores(aux);
            }
        }
    }

    public static void main(String[] args) {

        PalomaMensajera paloma1=new PalomaMensajera("Lucas", Color.NEGRO, "Paloma de toda la vida", true);
        PalomaMensajera paloma2=new PalomaMensajera("Ian", Color.NEGRO, "Paloma de toda la vida", false);
        Trabajador trabajador1=new Trabajador("Juan","Sampieri", 46878279, LocalDate.now(), 461111111, 10000, "bolivia 5717", LocalTime.of(8,0,0), LocalTime.of(16,0,0));
        Trabajador trabajador2=new Trabajador("Mateo","Incutti", 46222222, LocalDate.now(), 46333333, 10000, "bolivia 5717", LocalTime.of(10,0,0), LocalTime.of(16,0,0));
        TelefonoMovil telefono1=new TelefonoMovil(111,"Motorola", "Moto-G", Compania.PERSONAL, 11223344, true, 100);
        TelefonoMovil telefono2=new TelefonoMovil(222,"Iphone", "Iphone 15", Compania.CLARO, 1144556677, false, 100);
        HashSet<PartidoPolitico>listaPartidos=new HashSet<>();
        PartidoPolitico partidoPolitico1=new PartidoPolitico("La libertad avanza", "Banco central", 1000000, new HashSet<>());
        PartidoPolitico partidoPolitico2=new PartidoPolitico("JxC", "Casa Rosada", 50, new HashSet<>());
        partidoPolitico1.getListaEnviadores().add(paloma1);
        partidoPolitico2.getListaEnviadores().add(paloma2);

        partidoPolitico1.getListaEnviadores().add(trabajador1);
        partidoPolitico2.getListaEnviadores().add(trabajador2);

        partidoPolitico1.getListaEnviadores().add(telefono1);
        partidoPolitico2.getListaEnviadores().add(telefono2);

        listaPartidos.add(partidoPolitico1);
        listaPartidos.add(partidoPolitico2);
        Sistema sistema=new Sistema(listaPartidos);
        sistema.hacerCampaña();
        System.out.println("Agrega una nueva paloma");
        PalomaMensajera palomaMensajera3=new PalomaMensajera("Aquiles", Color.NEGRO, "Palomin", true);
        sistema.agregarMensajero(palomaMensajera3, partidoPolitico1);

        sistema.hacerCampaña();



    }
}

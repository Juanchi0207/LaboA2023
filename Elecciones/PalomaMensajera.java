package Elecciones;

import SistemaPrestamos.Color;

public class PalomaMensajera extends Ave implements Mensajeria{
    private boolean ConoceMapa;

    public PalomaMensajera(String nombre, Color color, String especie, boolean conoceMapa) {
        super(nombre, color, especie);
        ConoceMapa = conoceMapa;
    }

    public boolean isConoceMapa() {
        return ConoceMapa;
    }

    public void setConoceMapa(boolean conoceMapa) {
        ConoceMapa = conoceMapa;
    }

    @Override
    public void hacerCampaña(PartidoPolitico partidoPolitico) {
        if (isConoceMapa()) {
            System.out.println("Lanzando un papelito que dice: Vote por " + partidoPolitico.getNombre() + " para un mejor futuro");
        }
        else {
            System.out.println("Esta paloma no conoce la ruta de campaña");
        }
        }
}

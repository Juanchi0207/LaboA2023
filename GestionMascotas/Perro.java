package GestionMascotas;

import personas.Dueño;

public class Perro extends Mascota{
    private static String saludo="Guau";
    public Perro(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        if (nomDueño.equals(this.getDueño().getNombre())&&nomMascota.equals(this.getNombre())) {
            saludo="GUAU!";
        }
        return saludo;
    }
}

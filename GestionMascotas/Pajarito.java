package GestionMascotas;

import personas.Dueño;

public class Pajarito extends Mascota{
    private static String saludo="Pio";
    public Pajarito(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        return null;
    }
}

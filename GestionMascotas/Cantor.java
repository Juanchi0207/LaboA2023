package GestionMascotas;

import personas.Dueño;

public class Cantor extends Mascota{
    private static String saludo="Ruu";
    public Cantor(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        return null;
    }
}

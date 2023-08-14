package GestionMascotas;

import personas.Dueño;

public class Gato extends Mascota{
    private static String saludo="Miau";
    public Gato(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        return null;
    }
}

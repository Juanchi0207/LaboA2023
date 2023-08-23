package GestionMascotas;

import personas.Dueño;

public abstract class Mascota {
    private String nombre;
    private Dueño dueño;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public Mascota(String nombre, Dueño dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public abstract String Saludo(String nomDueño, String nomMascota);

    public abstract void alimentar(String nomMascota);
    public abstract String tipo(String nomMascota);
}


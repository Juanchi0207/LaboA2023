package personas;

import java.time.LocalDate;

public class Dueño extends Persona{
    public Dueño() {
    }

    public Dueño(String nombre, String apellido, LocalDate fecha_nacimiento) {
        super(nombre, apellido, fecha_nacimiento);
    }

    public Dueño(String nombre, String apellido, int numeroTelefono) {
        super(nombre, apellido, numeroTelefono);
    }

    public Dueño(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Dueño(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion) {
        super(nombre, apellido, edad, fecha_nacimiento, direccion);
    }

    public Dueño(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni) {
        super(nombre, apellido, fecha_nacimiento, direccion, dni);
    }

    public Dueño(String nombre, int edad) {
        super(nombre, edad);
    }


}

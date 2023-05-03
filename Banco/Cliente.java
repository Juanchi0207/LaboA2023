package Banco;

import personas.Persona;
import tiempos.Fecha;

public class Cliente extends Persona {
    private int cuil;

    public Cliente(String nombre, String apellido, Fecha fecha_nacimiento, String direccion, int dni, int cuil) {
        super(nombre, apellido, fecha_nacimiento, direccion, dni);
        this.cuil = cuil;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
}

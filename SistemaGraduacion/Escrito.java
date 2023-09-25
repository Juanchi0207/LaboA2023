package SistemaGraduacion;

import java.time.LocalDate;

public class Escrito extends Examen{
    private static int duracion=90;

    public Escrito(String materia, LocalDate fechaRealizacion) {
        super(materia, fechaRealizacion);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

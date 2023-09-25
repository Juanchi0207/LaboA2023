package SistemaGraduacion;

import SistemaPrestamos.Prestable;

import java.time.LocalDate;

public abstract class Examen {
    private String materia;
    private LocalDate fechaRealizacion;

    public Examen(String materia, LocalDate fechaRealizacion) {
        this.materia = materia;
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

}

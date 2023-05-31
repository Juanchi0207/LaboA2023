package SistemaAsistencia;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;

public class EmpleadoAsistencia extends Persona {

    private HashSet<DiasHabiles>diasHabiles;
    private HashSet<LocalDateTime> asistencia;

    public EmpleadoAsistencia(HashSet<DiasHabiles>diasHabiles,HashSet<LocalDateTime>asistencia ){
        super();
        this.diasHabiles=diasHabiles;
        this.asistencia=asistencia;

    }
    public HashSet<DiasHabiles> getDiasHabiles() {
        return diasHabiles;
    }

    public void setDiasHabiles(HashSet<DiasHabiles> diasHabiles) {
        this.diasHabiles = diasHabiles;
    }

    public HashSet<LocalDateTime> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashSet<LocalDateTime> asistencia) {
        this.asistencia = asistencia;
    }

    public int AsistenciaxMes(int mes){
        int diasAsistencia = 0;
        for(LocalDateTime fecha: asistencia){
            if (fecha.getMonthValue() == mes){
                diasAsistencia++;
            }
        }


        return diasAsistencia   ;
    }
    public float PorcentajeAsistenciaxMes(int mes){
        int diasAsistencia = 0;
        for(LocalDateTime fecha: asistencia){
            if (fecha.getMonthValue() == mes){
                diasAsistencia++;
            }
        }
        float porcentaje =0;
        porcentaje=((diasAsistencia*100)/(diasHabiles.size()*4));
        return porcentaje;
    }


}

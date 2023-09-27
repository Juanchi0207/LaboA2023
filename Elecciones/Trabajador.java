package Elecciones;

import personas.Persona;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajeria{
    private int numCuil;
    private float sueldo;
    private String direccion;
    private LocalTime horarioEntrada;
    private LocalTime horarioSalida;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, int numCuil, float sueldo, String direccion, LocalTime horarioEntrada, LocalTime horarioSalida) {
        super(nombre, apellido, dni, fecha_nacimiento);
        this.numCuil = numCuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

    public int getNumCuil() {
        return numCuil;
    }

    public void setNumCuil(int numCuil) {
        this.numCuil = numCuil;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalTime getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(LocalTime horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    @Override
    public void hacerCampaña(PartidoPolitico partidoPolitico) {
        if (LocalTime.now().isAfter(horarioEntrada) && LocalTime.now().isBefore(horarioSalida) && LocalDate.now().getDayOfWeek().getValue()>=1 && LocalDate.now().getDayOfWeek().getValue()<=5){
            System.out.println("Yo, " + getNombre() + " te invito a que votes por " + partidoPolitico.getNombre() + " para un mejor futuro");
        }
        else {
            System.out.println("El trabajador no esta en su horario o dia laboral");
        }
    }
}

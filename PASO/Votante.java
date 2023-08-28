package PASO;

import personas.Persona;

import java.time.LocalDate;

public class Votante extends Persona {

    private Boolean estadoVoto;
    private Provincia provincia;


    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Votante(Boolean estadoVoto, Provincia provincia) {
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, String apellido, LocalDate fecha_nacimiento, Boolean estadoVoto, Provincia provincia) {
        super(nombre, apellido, fecha_nacimiento);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, String apellido, int numeroTelefono, Boolean estadoVoto, Provincia provincia) {
        super(nombre, apellido, numeroTelefono);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, String apellido, Boolean estadoVoto, Provincia provincia) {
        super(nombre, apellido);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion, Boolean estadoVoto, Provincia provincia) {
        super(nombre, apellido, edad, fecha_nacimiento, direccion);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni, Boolean estadoVoto, Provincia provincia) {
        super(nombre, apellido, fecha_nacimiento, direccion, dni);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public Votante(String nombre, int edad, Boolean estadoVoto, Provincia provincia) {
        super(nombre, edad);
        this.estadoVoto = estadoVoto;
        this.provincia = provincia;
    }

    public void votar(Partido p){
        if(estadoVoto){
            System.out.println("Ya voto");
        } else{
            p.getRepresentate().agregarVoto(this.provincia);
        }
    }
    public Boolean getEstadoVoto() {
        return estadoVoto;
    }

    public void setEstadoVoto(Boolean estadoVoto) {
        this.estadoVoto = estadoVoto;
    }

    public Votante(Boolean estadoVoto) {
        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, String apellido, LocalDate fecha_nacimiento, Boolean estadoVoto) {
        super(nombre, apellido, fecha_nacimiento);

        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, String apellido, int numeroTelefono, Boolean estadoVoto) {
        super(nombre, apellido, numeroTelefono);

        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, String apellido, Boolean estadoVoto) {
        super(nombre, apellido);
        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion, Boolean estadoVoto) {
        super(nombre, apellido, edad, fecha_nacimiento, direccion);

        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni, Boolean estadoVoto) {
        super(nombre, apellido, fecha_nacimiento, direccion, dni);
        this.estadoVoto = estadoVoto;
    }

    public Votante(String nombre, int edad, Boolean estadoVoto) {
        super(nombre, edad);
        this.estadoVoto = estadoVoto;
    }
}

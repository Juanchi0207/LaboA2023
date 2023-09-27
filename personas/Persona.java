package personas;
import tiempos.Fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private LocalDate fecha_nacimiento;
    private String direccion;
    private int numeroTelefono;
    private String mail;

    public Persona(String nombre, int dni, LocalDate fecha_nacimiento, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.mail = mail;
    }

    public Persona(String nombre, String apellido, int dni, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Persona(){
        this.nombre="Ciro";
        this.edad=17;
        this.direccion="Esmeralda algo";
    }

    public Persona(String nombre, String apellido, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }

    public Persona(String nombre, String apellido, LocalDate fecha_nacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fecha_nacimiento=fecha_nacimiento;
    }
//   // public Persona(String nombre, String apellido, int numeroTelefono){
//        this.nombre=nombre;
//        this.apellido=apellido;
//        this.numeroTelefono=numeroTelefono;
//  //  }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, LocalDate fecha_nacimiento, String direccion, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
    }


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = "1234";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static void main(String[] args) {

    }
}

package personas;
import tiempos.Fecha;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Fecha fecha_nacimiento;
    private String direccion;
    private int numeroTelefono;

    public Persona(){
        this.nombre="Ciro";
        this.edad=17;
        this.direccion="Esmeralda algo";
    }

    public Persona(String nombre, String apellido, int numeroTelefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroTelefono=numeroTelefono;
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre, String apellido, int edad, Fecha fecha_nacimiento, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
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


    public static void main(String[] args) {
        Persona persona1=new Persona();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getDireccion());
    }
}

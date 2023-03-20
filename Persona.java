public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre="Ciro";
        this.edad=17;
        this.direccion="Esmeralda algo";
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static void main(String[] args) {
        Persona persona1=new Persona();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getDireccion());
    }
}

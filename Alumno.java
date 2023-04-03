import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fecha_de_nacimiento;
    private ArrayList<Materias>materias;

    public Alumno() {
        this.nombre = "Juan";
        this.apellido = "Sampieri";
        this.fecha_de_nacimiento = new Fecha(2,7,2005);
        this.materias = new ArrayList<Materias>();
    }

    public Alumno(String nombre, String apellido, Fecha fecha_de_nacimiento, ArrayList<Materias> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.materias = materias;
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

    public Fecha getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(Fecha fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materias> materias) {
        this.materias = materias;
    }


    public void menorNota(){
        double menor=10;
        for (int i=0;i<materias.size();i++){
            Materias temporal = materias.get(i);
            for (Double notas1:temporal.getListanotas()){
                if (notas1<menor){
                    menor=notas1;
                }
            }
        }
        System.out.println(menor);
    }

    public void mayorNota(){
        double mayor=0;
        for (int i=0;i<materias.size();i++){
            Materias temporal = materias.get(i);
            for (Double notas1:temporal.getListanotas()){
                if (notas1>mayor){
                    mayor=notas1;
                }
            }
        }
        System.out.println(mayor);
    }

    public void agregarNota(Double notas, String nombre){
        for (int i=0;i<materias.size();i++){
            if(materias.get(i).getNombre()==nombre){
                materias.get(i).getListanotas().add(notas);
            }
        }
    }

    public void agregarMateria(String nombre){
        Materias mat = new Materias(nombre,new ArrayList<Double>());
        materias.add(mat);
    }

    public void promedioNotasMateria(){
        for(Materias notas1:materias){
            double suma=0;
            for(int i=0;i<notas1.getListanotas().size();i++){
                suma=suma+notas1.getListanotas().get(i);
            }
            System.out.println("El promedio en "+ notas1.getNombre() + " es: " + suma/notas1.getListanotas().size());
        }
    }

    public void promedioNotasGeneral(){
        double suma=0;
        for(Materias notas1:materias){
            for(int i=0;i<notas1.getListanotas().size();i++){
                suma=suma+notas1.getListanotas().get(i);
            }
        }
        System.out.println("El promedio general es: " + suma/materias.size());
    }





    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno("Juan","Sampieri",new Fecha(2,7,2005),new ArrayList<Materias>());
        alumno.agregarMateria("Matematica");
        alumno.agregarMateria("Lengua");
        alumno.agregarMateria("Redes");
        alumno.agregarNota(9.0, "Matematica");
        alumno.agregarNota(10.0, "Matematica");
        alumno.agregarNota(7.0, "Lengua");
        alumno.agregarNota(10.0, "Redes");
        alumno.mayorNota();
        alumno.menorNota();
        alumno.promedioNotasMateria();
        alumno.promedioNotasGeneral();
    }

}

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String apellido;
    private Fecha fecha_de_nacimiento;
    private ArrayList<Materias>materias;

    public Alumno() {
        this.apellido = "Sampieri";
        this.fecha_de_nacimiento = new Fecha(2,7,2005);
        this.materias = new ArrayList<Materias>();
    }

    public Alumno(String apellido, Fecha fecha_de_nacimiento, ArrayList<Materias> materias) {
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.materias = materias;
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
        double menor= notas.get(0);
        for (Double notas1:notas){
            if (notas1<menor){
                menor=notas1;
            }
        }
        System.out.println(menor);
    }

    public void mayorNota(){
        double mayor= notas.get(0);
        for (Double notas1:notas){
            if (notas1>mayor){
                mayor=notas1;
            }
        }
        System.out.println(mayor);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno("Sampieri",new Fecha(2,7,2005),new ArrayList<Materias>());
        alumno.agregarNota(9.0);
        alumno.mayorNota();
        alumno.menorNota();
    }

}

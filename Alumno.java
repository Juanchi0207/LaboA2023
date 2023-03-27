import java.text.DecimalFormat;
import java.util.ArrayList;

public class Alumno {
    private String apellido;
    private Fecha fecha_de_nacimiento;
    private ArrayList<Double>notas;

    public Alumno() {
        this.apellido = "Sampieri";
        this.fecha_de_nacimiento = new Fecha(2,7,2005);
        this.notas = new ArrayList<Double>();
    }

    public Alumno(String apellido, Fecha fecha_de_nacimiento, ArrayList<Double> notas) {
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.notas = notas;
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

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void agregarNota(double nota){
        notas.add(nota);
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
        ArrayList<Double>notas=new ArrayList<Double>();
        notas.add(6.5);
        notas.add(7.0);
        Alumno alumno = new Alumno("Sampieri",new Fecha(2,7,2005),notas);
        alumno.agregarNota(9.0);
        alumno.mayorNota();
        alumno.menorNota();
    }
}

package personas;
import tiempos.Fecha;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
    private String division;
    private ArrayList<Materias>materias;

    public Alumno() {
        super("Juan","Sampieri",25,new Fecha(2,7,2005),"bolivia 5717");
        this.division = "5to A";
        this.materias = new ArrayList<Materias>();
    }

    public Alumno(String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division=division;
    }

    public Alumno(String nombre, String apellido, int edad, Fecha fecha_de_nacimiento, String direccion, String division, ArrayList<Materias> materias) {
        super(nombre,apellido,edad,fecha_de_nacimiento,direccion);
        this.division = division;
        this.materias = materias;
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
        Alumno alumno = new Alumno("Juan","Sampieri", 25, new Fecha(2,7,2005), "bolivia 5717", "5to A", new ArrayList<Materias>());
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

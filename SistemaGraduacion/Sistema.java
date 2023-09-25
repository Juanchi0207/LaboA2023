package SistemaGraduacion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema implements Aprobacion{
    private HashSet<Alumno> listaAlumnos;
    private HashSet<Examen> listaExamenes;

    public Sistema(HashSet<Alumno> listaAlumnos, HashSet<Examen> listaExamenes) {
        this.listaAlumnos = listaAlumnos;
        this.listaExamenes = listaExamenes;
    }

    public HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public HashSet<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(HashSet<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    @Override
    public void cantAprobados() {
        int cantAprobados=0;
        for (Alumno alumno:listaAlumnos){
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            int examenesTotales=alumno.getExamenesRendidos().size();
            int examenesAprobados=0;
            for (Map.Entry<Examen, Boolean> examen:alumno.getExamenesRendidos().entrySet()){
                if (examen.getValue()==true){
                    examenesAprobados++;
                }
                else {
                    System.out.println("El examen " + examen.getKey().getMateria() + " esta desaprobado");
                }
            }

            if (examenesTotales==examenesAprobados){
                System.out.println("El alumno esta aprobado");
                cantAprobados++;
            }
            else {
                System.out.println("El alumno no aprobo el año");
            }
            System.out.println("----");
        }
        System.out.println("La cantidad de aprobados es: " + cantAprobados);
    }

    public static void main(String[] args) {
        Sistema sistema=new Sistema(new HashSet<>(), new HashSet<>());
        Escrito escrito1=new Escrito("Matematica",LocalDate.now());
        Escrito escrito2=new Escrito("Lengua", LocalDate.now());
        Oral oral1=new Oral("Historia", LocalDate.now());
        Oral oral2=new Oral("Geografia", LocalDate.now());
        sistema.listaExamenes.add(escrito1);
        sistema.listaExamenes.add(escrito2);
        sistema.listaExamenes.add(oral1);
        sistema.listaExamenes.add(oral2);
        HashMap<Examen, Boolean> examenesA1=new HashMap<>();
        examenesA1.put(escrito1, true);
        examenesA1.put(escrito2, true);
        examenesA1.put(oral1, true);
        examenesA1.put(oral2, true);
        HashMap<Examen, Boolean> examenesA2=new HashMap<>();
        examenesA2.put(escrito1, false);
        examenesA2.put(escrito2, true);
        examenesA2.put(oral1, false);
        examenesA2.put(oral2, true);
        HashMap<Examen, Boolean> examenesA3=new HashMap<>();
        examenesA3.put(escrito1, true);
        examenesA3.put(escrito2, true);
        examenesA3.put(oral1, true);
        examenesA3.put(oral2, true);
        HashMap<Examen, Boolean> examenesA4=new HashMap<>();
        examenesA4.put(escrito1, false);
        examenesA4.put(escrito2, true);
        examenesA4.put(oral1, true);
        examenesA4.put(oral2, true);
        Alumno alumno1=new Alumno("Juan", "Sampieri", 468787279, examenesA1);
        Alumno alumno2=new Alumno("Gonzalo", "Gonzalin", 46111111, examenesA2);
        Alumno alumno3=new Alumno("Ciro", "Serrucho", 46222222, examenesA3);
        Alumno alumno4=new Alumno("Ian", "Alias gordo", 46333333, examenesA4);
        sistema.listaAlumnos.add(alumno1);
        sistema.listaAlumnos.add(alumno2);
        sistema.listaAlumnos.add(alumno3);
        sistema.listaAlumnos.add(alumno4);
        sistema.cantAprobados();
    }
}

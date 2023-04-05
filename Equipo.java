import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador>jugadores;
    private String barrio_procedencia;
    private String turno;
    private ArrayList<Boolean>dia_disp;

    public boolean agregarJugador(Jugador nuevoJugador){
        boolean condicion=false;
        if(!numRep(nuevoJugador.getNum_camiseta())){
            jugadores.add(nuevoJugador);
            condicion=true;
        }
        return condicion;
    }

    public void agregarEquipo(){
        int i=0;
        Scanner entrada =new Scanner(System.in);
        while(i<10){
            System.out.println("Escriba los datos del jugador");
            String nombre=entrada.next();
            int dia= entrada.nextInt();
            int mes= entrada.nextInt();
            int anio= entrada.nextInt();
            Fecha nacimiento=new Fecha(dia,mes,anio);
            boolean capitan=entrada.nextBoolean();
            int num_camiseta= entrada.nextInt();
            Jugador nuevo_jugador=new Jugador(nombre,nacimiento,capitan,num_camiseta);
            boolean condicion=agregarJugador(nuevo_jugador);
            if (condicion){
                i++;
            }
            else{
                System.out.println("No se puede agregar al jugador porque el numero esta repetido. Ingrese de nuevo al juador con otro nombre.");
            }
        }
    }

    public Boolean numRep(int numeroCamiseta){
        boolean esRepetido = false;
        for (Jugador jugador: jugadores){
            if(jugador.getNum_camiseta() == numeroCamiseta) {
                esRepetido = true;
            }
        }
        return esRepetido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getBarrio_procedencia() {
        return barrio_procedencia;
    }

    public void setBarrio_procedencia(String barrio_procedencia) {
        this.barrio_procedencia = barrio_procedencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Boolean> getDia_disp() {
        return dia_disp;
    }

    public void setDia_disp(ArrayList<Boolean> dia_disp) {
        this.dia_disp = dia_disp;
    }

    public Equipo(String nombre, String barrio_procedencia, String turno) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
        this.barrio_procedencia = barrio_procedencia;
        this.turno = turno;
    }

    public static void main(String[] args) {

    }
}



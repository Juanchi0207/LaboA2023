import java.util.ArrayList;
import java.util.Scanner;

public class mainTorneo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<Equipo>equipos=new ArrayList<Equipo>();
        System.out.println("Cuantos equipos quiere agregar?");
        int cantidad= entrada.nextInt();
        for(int i=0;i<cantidad;i++){
            ArrayList<Boolean>dia_disp = new ArrayList<Boolean>();
            String nombre = entrada.nextLine();
            String barrio = entrada.nextLine();
            String turno = entrada.nextLine();
            String sig= entrada.next();
            for (int z=1;z<7;z++){
                System.out.println("Estan disponibles el dia " + z + "?");
                boolean dia = entrada.nextBoolean();
                dia_disp.add(dia);
            }
            Equipo equipo = new Equipo(nombre,barrio,turno);
            equipo.agregarEquipo();
            equipos.add(equipo);
        }
        //Fixture fixture=new Fixture(equipos);
    }
}

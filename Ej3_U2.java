import personas.Persona;

import java.util.ArrayList;

public class Ej3_U2 {
    public static void main(String[] args) {
        ArrayList<Persona>personas1=new ArrayList<Persona>();
        personas1.add(new Persona("Ciro",23));
        personas1.add(new Persona("Lucas",45));
        personas1.add(new Persona("Agustin",32));
        for (Persona personas:personas1){
            if (personas.getEdad()>=30){
                System.out.println(personas.getNombre());
            }
        }
    }
}

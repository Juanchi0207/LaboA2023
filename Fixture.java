import java.util.ArrayList;

public class Fixture {
private ArrayList<Partidos> partidos;
}
public class Partidos {
    private Equipo equipo1;
    private Equipo equipo2;
    private int horario;
    private Fecha fecha;



    public Partidos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

      public void crearPartido(ArrayList<Equipo> equipos){
        for (int i = 0; i<equipo1.getDia_disp().size(); i++){
            if ()
    }

    }
}



   /* public void crearPartido() {

        for (int i = 0; i < e1.getDisponiblidadHoraria().size(); i++) {
            for (int j = 0; i < e2.getDisponiblidadHoraria().size(); j++) {
                if (e1.getDisponiblidadHoraria() == e2.getDisponiblidadHoraria(j)) {
                    setEquipo1(e1);
                    setEquipo2(e2);
                    setDia();
                    setHorario();
                }
            }
        }
    }
}

*/

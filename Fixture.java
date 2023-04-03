import java.util.ArrayList;

public class Fixture {
    private Fecha fecha;
    private int hora;
    private ArrayList<Equipo> equipos;

    public void crearPartido(){

        for(int i = 0; i<e1.getDisponiblidadHoraria().size(); i++){
            for(int j = 0; i<e2.getDisponiblidadHoraria().size(); j++){
                if(e1.getDisponiblidadHoraria() == e2.getDisponiblidadHoraria(j)){
                    setEquipo1(e1);
                    setEquipo2(e2);
                    setDia();
                    setHorario();
                }
            }
        }
    }
}
 

    }

}

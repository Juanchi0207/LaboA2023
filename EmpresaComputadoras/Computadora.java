package EmpresaComputadoras;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componentes>componentes;

    public Computadora(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }

    public void cantComp(Computadora computadora){
        ArrayList<Componentes>componentesContar=computadora.getComponentes();
        int compEntrada=0;
        int compSalida = 0;
        for (int i = 0; i<componentesContar.size(); i++){
            if (componentesContar.get(i) instanceof Entrada){
                compEntrada = compEntrada +1;
            }
            else if (componentesContar.get(i) instanceof Salida) {
                compSalida = compSalida +1;
            }
        }
        System.out.println("hay " + compEntrada + " dispositivos de entrada");
        System.out.println("hay " + compSalida + " dispositivos de salida");

    }
}

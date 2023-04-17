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
}

package ControlBebidas;

import personas.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona {
    private HashMap<Bebida, Integer> listaBebidas;

    public Usuario(String nombre, String apellido, int dni, HashMap<Bebida, Integer> listaBebidas) {
        super(nombre, apellido, dni);
        this.listaBebidas = listaBebidas;
    }

    public HashMap<Bebida, Integer> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(HashMap<Bebida, Integer> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public void tomarBebida(Bebida bebida, int cantidad){
        if (listaBebidas.containsKey(bebida)){
            listaBebidas.put(bebida,listaBebidas.get(bebida)+cantidad);
        }
        else {
            listaBebidas.put(bebida,cantidad);
        }
    }
}

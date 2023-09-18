package ControlBebidas;

import personas.Persona;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
        System.out.println(getNombre() + " tomó " + cantidad + " " + bebida.getNombre());
    }

    public int calcularCoeficienteHidratacion(){
        int coeficienteTotal=0;
        System.out.println("Usuario: " + getNombre() + " " + getApellido());
        for (Map.Entry<Bebida,Integer> bebida:listaBebidas.entrySet()){
            int coeficienteBebida = bebida.getValue()*(bebida.getKey().getPositividad()-bebida.getKey().getNegatividad());
            coeficienteTotal=coeficienteTotal+coeficienteBebida;
            System.out.println("Coeficiente de " + bebida.getValue() + " " + bebida.getKey().getNombre() + ": " + coeficienteBebida);
        }

        System.out.println("Coeficiente total de: " + coeficienteTotal);
        System.out.println("-----");
        return coeficienteTotal;
    }

}

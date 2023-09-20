package packageMartinBarbieri;

import personas.Persona;

import java.util.HashMap;
import java.util.Map;

public class Bebedor extends Persona {
    private HashMap<Bebida, Integer> bebidasConsumidas;


    public Bebedor(String nombre, String apellido, int dni, HashMap<Bebida, Integer> bebidasConsumidas) {
        super(nombre,apellido, dni);
        this.bebidasConsumidas=bebidasConsumidas;
    }

    public int coeficienteDeHidratacion(){
        int suma = 0;
        for(Map.Entry<Bebida,Integer> bebida: bebidasConsumidas.entrySet()){
            //suma+= bebida.getValue()*
            //      (bebida.getKey().diferenciaCoeficientes());
            suma=suma+
                    bebida.getValue()*
                            (bebida.getKey().getCoeficientePositividad()-
                                    bebida.getKey().getCoeficienteNegatividad());
        }
        return suma;

    }

    public void agregarBebida(Bebida b, int cant){
        if(bebidasConsumidas.get(b) != null ){
            bebidasConsumidas.put(b,bebidasConsumidas.get(b) +cant);
        } else{
            bebidasConsumidas.put(b,cant);
        }
    }


}

package Alarmas;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Sensor> sensores;
    ArrayList<Sensor> sensoresConectados;

    public void ejecutarSensores(){
        boolean saltar= false;
        while(saltar = false){
            for (int i =0; i<sensoresConectados.size();i++){
                if(sensoresConectados.get(i).getValor()>sensoresConectados.get(i).getValorUmbral())
                    sensoresConectados.get(i).salto();
                    i = sensoresConectados.size();
                    saltar = true;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}

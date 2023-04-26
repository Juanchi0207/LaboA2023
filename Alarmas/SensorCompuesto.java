package Alarmas;

import java.util.ArrayList;

public class SensorCompuesto {
   private ArrayList<Sensor> sensores;
   private int valorUmbral;

    public SensorCompuesto(ArrayList<Sensor> sensores, int valorUmbral) {
        this.sensores = sensores;
        this.valorUmbral = valorUmbral;
    }

    public void alarma() {
        int promedio = 0;
        for (int i = 0; i < sensores.size(); i++) {
            int aux = sensores.get(i).getValor();
            promedio += aux;
        }
        if(this.valorUmbral <(promedio/ sensores.size())){
            disparoAlarma();
        }
    }

    public void disparoAlarma() {
        System.out.println("Salto el sensor compuesto");
    }
}

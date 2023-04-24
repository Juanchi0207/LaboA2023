package Alarmas;

import java.util.ArrayList;

public class SensorCompuesto extends Sensor {
    ArrayList<Sensor> sensores;
    public SensorCompuesto(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        super(conectado, valor, valorUmbral, añoAdquisicion);
    }

    @Override
    public void salto() {
        System.out.println("Salto el sensor compuesto");
    }

}

package Alarmas;

public class SensorTemperatura extends Sensor {
    public SensorTemperatura(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        super(conectado, valor, valorUmbral, añoAdquisicion);
    }
    @Override
    public void disparoAlarma(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}


package Alarmas;

public class SensorPresion extends Sensor{
    public SensorPresion(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        super(conectado, valor, valorUmbral, añoAdquisicion);
    }
    @Override
    public void disparoAlarma(){
        System.out.println("Sensor de presión activado.");
    }
}

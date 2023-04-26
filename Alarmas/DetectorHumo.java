package Alarmas;

public class DetectorHumo extends Sensor{
    public DetectorHumo(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        super(conectado, valor, valorUmbral, añoAdquisicion);
    }
    @Override
    public void disparoAlarma(){
        System.out.println("Se ha llamado a los bomberos");
    }
}


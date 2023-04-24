package Alarmas;

public class DetectorHumo extends Sensor{
    public DetectorHumo(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        super(conectado, valor, valorUmbral, añoAdquisicion);
    }
    @Override
    public void salto(){
        System.out.println("Se ha llamdo a los bomberos");
    }
}


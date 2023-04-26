package Alarmas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura temp1 = new SensorTemperatura(true,50,100,2015);
        SensorTemperatura temp2 = new SensorTemperatura(true,90,100,2015);
        SensorTemperatura temp3 = new SensorTemperatura(true,110,100,2015);
        temp1.alarma();
        temp2.alarma();
        temp3.alarma();
        SensorPresion presion1 = new SensorPresion(true,50,100,2015);
        SensorPresion presion2 = new SensorPresion(true,90,100,2015);
        SensorPresion presion3 = new SensorPresion(true,110,100,2015);
        presion1.alarma();
        presion2.alarma();
        presion3.alarma();
        DetectorHumo humo1 = new DetectorHumo(true,50,100,2015);
        DetectorHumo humo2 = new DetectorHumo(true,90,100,2015);
        DetectorHumo humo3 = new DetectorHumo(true,110,100,2015);
        humo1.alarma();
        humo2.alarma();
        humo3.alarma();
        ArrayList<Sensor>sensores=new ArrayList<Sensor>();
        sensores.add(temp1);
        sensores.add(presion1);
        sensores.add(humo1);
        SensorCompuesto compuesto = new SensorCompuesto(sensores,40);
        compuesto.alarma();
    }
}

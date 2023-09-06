package Alarmas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sensor>sensores=new ArrayList<>();
        SensorTemperatura temp1 = new SensorTemperatura(true,50,100,2015);
        SensorTemperatura temp2 = new SensorTemperatura(true,90,100,2015);
        SensorTemperatura temp3 = new SensorTemperatura(true,110,100,2015);
        SensorPresion presion1 = new SensorPresion(true,50,100,2015);
        SensorPresion presion2 = new SensorPresion(true,90,100,2015);
        SensorPresion presion3 = new SensorPresion(true,110,100,2015);
        DetectorHumo humo1 = new DetectorHumo(true,50,100,2015);
        DetectorHumo humo2 = new DetectorHumo(true,90,100,2015);
        DetectorHumo humo3 = new DetectorHumo(true,110,100,2015);
        sensores.add(temp1);
        sensores.add(temp2);
        sensores.add(temp3);
        sensores.add(presion1);
        sensores.add(presion2);
        sensores.add(presion3);
        sensores.add(humo1);
        sensores.add(humo2);
        sensores.add(humo3);

        try {
            System.out.println("Ingrese un sensor");
            Scanner entrada=new Scanner(System.in);
            int aux=entrada.nextInt();
            System.out.println(sensores.get(aux));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No existe ese sensor");
        }

        temp1.alarma();
        temp2.alarma();
        temp3.alarma();

        presion1.alarma();
        presion2.alarma();
        presion3.alarma();

        humo1.alarma();
        humo2.alarma();
        humo3.alarma();
        SensorCompuesto compuesto = new SensorCompuesto(sensores,40);
        compuesto.alarma();
    }
}

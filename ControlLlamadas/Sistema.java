package ControlLlamadas;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Empleado>empleados;
    private ArrayList<Llamada>registro;

    public Sistema(ArrayList<Empleado> empleados, ArrayList<Llamada> registro) {
        this.empleados = empleados;
        this.registro = registro;
    }

    public void realizarLlamada(){
        int numero=1155667788;

    }

    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        Empleado empleado2=new Empleado("juan","Sampieri",1122334455,46878279,"Reino Unido");
        ArrayList<Empleado>empleados=new ArrayList<Empleado>();
        empleados.add(empleado1);
        empleados.add(empleado2);
    }
}

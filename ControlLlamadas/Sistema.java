package ControlLlamadas;

import tiempos.Fecha;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Empleado>empleados;
    private ArrayList<Llamada>registro;

    public Sistema(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
        this.registro = new ArrayList<Llamada>();
    }

    public void realizarLlamada(){
        int numero=1155667788;
        Empleado empleado1=empleados.get(0);
        Empleado empleado2=empleados.get(1);
        int duracion=40;
        Fecha fecha=new Fecha();
        Llamada llamada = new Llamada(empleado1,empleado2,fecha,duracion);
        registro.add(llamada);
    }

    public void listarLlamadas(){
        for(int i=0; i<registro.size(); i++){

        }
    }

    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        Empleado empleado2=new Empleado("juan","Sampieri",1122334455,46878279,"Reino Unido");
        ArrayList<Empleado>empleados=new ArrayList<Empleado>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        Sistema sistema = new Sistema(empleados);
        sistema.realizarLlamada();
    }
}

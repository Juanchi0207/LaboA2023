package SistemaAsistencia;

import ControlLlamadas.Empleado;

import java.time.LocalDateTime;
import java.util.HashSet;

public class SistemaAsistencia {
    HashSet<EmpleadoAsistencia> sistema;

    public SistemaAsistencia(HashSet<EmpleadoAsistencia> sistema) {
        this.sistema = sistema;
    }

    public HashSet<EmpleadoAsistencia> getSistema() {
        return sistema;
    }

    public void setSistema(HashSet<EmpleadoAsistencia> sistema) {
        this.sistema = sistema;
    }

    public HashSet<EmpleadoAsistencia> EmpleadosPorcentajeAsistenciaxMes(int mes) {
        HashSet<EmpleadoAsistencia>empleadosMayor80=new HashSet<EmpleadoAsistencia>();
        for (EmpleadoAsistencia empleado : sistema) {
           if(empleado.PorcentajeAsistenciaxMes(mes)>0.8f){
               empleadosMayor80.add(empleado);
           }

        }
        return empleadosMayor80;
    }
}
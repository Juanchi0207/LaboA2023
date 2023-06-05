package ControlPeso;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PersonaPeso extends Persona {

    private HashMap<LocalDate, Integer>registroPeso;
    private HashMap<LocalDate, Integer>registroAltura;

    public PersonaPeso(String nombre, String apellido, LocalDate fecha_nacimiento, HashMap<LocalDate, Integer> registroPeso, HashMap<LocalDate, Integer> registroAltura) {
        super(nombre, apellido, fecha_nacimiento);
        this.registroPeso = registroPeso;
        this.registroAltura = registroAltura;
    }

    public HashMap<LocalDate, Integer> getRegistroPeso() {
        return registroPeso;
    }

    public void setRegistroPeso(HashMap<LocalDate, Integer> registroPeso) {
        this.registroPeso = registroPeso;
    }

    public HashMap<LocalDate, Integer> getRegistroAltura() {
        return registroAltura;
    }

    public void setRegistroAltura(HashMap<LocalDate, Integer> registroAltura) {
        this.registroAltura = registroAltura;
    }

    public void agregarPeso(int peso){
        registroPeso.put(LocalDate.now(),peso);
    }

    public void agregarAltura(int altura){
        registroAltura.put(LocalDate.now(),altura);
    }

    public void conocerPeso(LocalDate fecha){
        int peso= registroPeso.get(fecha);
        System.out.println("El peso es de: " + peso + " en el dia " + fecha);
    }

    public void conocerAltura(LocalDate fecha){
        int altura= registroAltura.get(fecha);
        System.out.println("El peso es de: " + altura + " en el dia " + fecha);
    }

    public void promedioPeso(int anio){
        int contador=0;
        int suma=0;
        for (Map.Entry<LocalDate, Integer> peso: registroPeso.entrySet()){
            if(peso.getKey().getYear()==anio){
                contador++;
                suma=suma+peso.getValue();
            }
        }
        System.out.println("El promedio de peso durante el año " + anio + " fue: " + suma/contador);
    }

    public void promedioAltura(int anio){
        int contador=0;
        int suma=0;
        for (Map.Entry<LocalDate, Integer> altura: registroAltura.entrySet()){
            if(altura.getKey().getYear()==anio){
                contador++;
                suma=suma+altura.getValue();
            }
        }
        System.out.println("El promedio de altura durante el año " + anio + " fue: " + suma/contador);
    }

    public void porcentajeCrecimiento(int anio1, int anio2){
        int alturaMax=0;
        int alturaMin=0;
        for (Map.Entry<LocalDate, Integer> altura: registroAltura.entrySet()){
            if (altura.getKey().getYear()>=anio1 && altura.getKey().getYear()<=anio2){
                if (altura.getValue()>alturaMax){
                    alturaMax=altura.getValue();
                }
                if (altura.getValue()<alturaMin){
                    alturaMin=altura.getValue();
                }
            }
        }
        float porcentaje = ((alturaMax - alturaMin)/alturaMin)*100;
        System.out.println("El porcentaje de crecimeinto fue de " + porcentaje + "%");
    }
}

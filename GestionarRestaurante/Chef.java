package GestionarRestaurante;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Chef extends Persona {
    private HashSet<Restaurante>experienciaCulinaria;
    private Restaurante restauranteActual;

    public Chef(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, HashSet<Restaurante> experienciaCulinaria, Restaurante restauranteActual) {
        super(nombre, apellido, dni, fecha_nacimiento);
        this.experienciaCulinaria = experienciaCulinaria;
        this.restauranteActual = restauranteActual;
    }

    public HashSet<Restaurante> getExperienciaCulinaria() {
        return experienciaCulinaria;
    }

    public void setExperienciaCulinaria(HashSet<Restaurante> experienciaCulinaria) {
        this.experienciaCulinaria = experienciaCulinaria;
    }

    public Restaurante getRestauranteActual() {
        return restauranteActual;
    }

    public void setRestauranteActual(Restaurante restauranteActual) {
        this.restauranteActual = restauranteActual;
    }

    public void verificarEdad() throws ExceptionAgregarChef{
        if ((LocalDate.now().getYear()-getFecha_nacimiento().getYear())<18){
            throw new ExceptionAgregarChef("El chef " +getNombre() + " no tiene la edad requerida");
        }
    }

    public void verificarExperiencia() throws ExceptionAgregarChef{
        if (getExperienciaCulinaria().size()<3){
            throw new ExceptionAgregarChef("El chef " +getNombre() +" no tiene experiencia suficiente");
        }
    }
}

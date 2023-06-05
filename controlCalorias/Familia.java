package controlCalorias;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Familia {
    private HashSet<PersonaCalorias> integrantes;

    public Familia(HashSet<PersonaCalorias> integrantes) {
        this.integrantes = integrantes;
    }

    public HashSet<PersonaCalorias> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(HashSet<PersonaCalorias> integrantes) {
        this.integrantes = integrantes;
    }

    public int cantidadCaloriasxFamilia() {
        int calorias = 0;
        int contador = 0;
        for (PersonaCalorias personas : integrantes) {
            calorias += personas.cantidadCaloriasConsumidas();
            contador++;
        }
        calorias = calorias / contador;
        return calorias;
    }

    public PersonaCalorias PersonaMayorCalorias() {
        PersonaCalorias masGordo = new PersonaCalorias();
        for (PersonaCalorias personas : integrantes) {
            if (personas.cantidadCaloriasConsumidas() > masGordo.cantidadCaloriasConsumidas()) {
                masGordo = personas;
            }
        }
        return masGordo;
    }

    public PersonaCalorias PersonaMenorCalorias() {
        PersonaCalorias menosGordo = new PersonaCalorias();
        for (PersonaCalorias personas : integrantes) {
            if (personas.cantidadCaloriasConsumidas() < menosGordo.cantidadCaloriasConsumidas()) {
                menosGordo = personas;
            }
        }
        return menosGordo;
    }
}
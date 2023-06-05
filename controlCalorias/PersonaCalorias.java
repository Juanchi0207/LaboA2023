package controlCalorias;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PersonaCalorias extends Persona {
    private HashMap<LocalDateTime, Plato> comidas;

    public PersonaCalorias(String nombre, String apellido, LocalDate fecha_nacimiento, HashMap<LocalDateTime, Plato> comidas) {
        super(nombre, apellido, fecha_nacimiento);
        comidas = comidas;
    }
    public PersonaCalorias() {
        super("Jorge", "Pancera", LocalDate.now());
        comidas = new HashMap<LocalDateTime, Plato>();
    }

    public HashMap<LocalDateTime, Plato> getComidas() {
        return comidas;
    }

    public void setComidas(HashMap<LocalDateTime, Plato> comidas) {
        comidas = comidas;
    }

    public int cantidadCaloriasConsumidas() {
        int calorias = 0;
        for (Map.Entry<LocalDateTime, Plato> comida : comidas.entrySet()) {
           calorias += comida.getValue().getCalorias();
        }
        return calorias;
    }
}

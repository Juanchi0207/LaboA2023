package personas;

public class Tecnico extends Operario{
    public Tecnico(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "personas.Empleado " + getNombre() + " -> " + " personas.Operario" + " -> " + "personas.Tecnico";
    }
}

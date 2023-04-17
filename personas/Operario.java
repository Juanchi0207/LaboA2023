package personas;

public class Operario extends Empleado{

    public Operario(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "personas.Empleado " + getNombre() + " -> " + " personas.Operario";
    }
}

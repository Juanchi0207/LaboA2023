package personas;

public class Oficial extends Operario{

    public Oficial(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "personas.Empleado " + getNombre() + " -> " + " personas.Operario" + " -> " + "personas.Oficial";
    }
}

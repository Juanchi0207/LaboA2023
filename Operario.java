public class Operario extends Empleado{

    public Operario(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> " + " Operario";
    }
}

public class Oficial extends Operario{

    public Oficial(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> " + " Operario" + " -> " + "Oficial";
    }
}

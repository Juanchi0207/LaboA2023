public class Tecnico extends Operario{
    public Tecnico(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> " + " Operario" + " -> " + "Tecnico";
    }
}

public class Directivo extends Empleado{
    public Directivo(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> " + " Directivo";
    }
}

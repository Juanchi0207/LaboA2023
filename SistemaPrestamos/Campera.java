package SistemaPrestamos;

public class Campera extends Ropa implements Prestable{
    public Campera(Color color, Materiales material, String marca, String estado) {
        super(color, material, marca, estado);
    }
    @Override
    public boolean prestar() {
        if (getEstado().equals("Buen estado")){
            System.out.println("La campera no sera prestada");
            return true;
        }
        else {
            System.out.println("La campera sera prestada");
            return false;

        }
    }

    @Override
    public boolean agregarElemento() {
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        else {
            System.out.println("El artículo ingresado no puede ingresar al circuito de préstamos");
            return false;
        }
    }
    @Override
    public String toString() {
        return "CAMPERA \n" +
                "Color: "+ getColor().toString() + "\n" +
                "Material: " + getMaterial().toString() + "\n" +
                "Marca: "+ getMarca() +"\n" +
                "Estado: "+getEstado();
    }
}

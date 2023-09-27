package SistemaPrestamos;

public class Pantalon extends Ropa implements Prestable{
    private int cintura;
    private int cadera;
    private int largo;

    public Pantalon(Color color, Materiales material, String marca, String estado, int cintura, int cadera, int largo) {
        super(color, material, marca, estado);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largo = largo;
    }

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public boolean prestar() {
        if (getEstado().equals("Buen estado")){
            System.out.println("El pantalon sera prestado");
            return true;
        }
        else {
            System.out.println("El pantalon no sera prestado");
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
        return "PANTALON" +
                "Color: "+ getColor().toString() + "\n" +
                "Material: " + getMaterial().toString() + "\n" +
                "Marca: "+ getMarca() +"\n" +
                "Estado: "+getEstado() + "\n" +
                "cintura: " + cintura + "\n" +
                "cadera: " + cadera + "\n" +
                "largo: " + largo + "\n"
                ;
    }
}

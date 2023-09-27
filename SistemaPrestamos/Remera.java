package SistemaPrestamos;

public class Remera extends Ropa implements Prestable{
    private int espalda;
    private int contorno;
    private int largoTorso;

    public Remera(Color color, Materiales material, String marca, String estado, int espalda, int contorno, int largoTorso) {
        super(color, material, marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    public int getEspalda() {
        return espalda;
    }

    public void setEspalda(int espalda) {
        this.espalda = espalda;
    }

    public int getContorno() {
        return contorno;
    }

    public void setContorno(int contorno) {
        this.contorno = contorno;
    }

    public int getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(int largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public boolean prestar() {
        if (getEstado().equals("Buen estado")){
            System.out.println("La remera sera prestada");
            return true;
        }
        else {
            System.out.println("La remera no sera prestada");
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
        return "REMERA" +
                "Color: "+ getColor().toString() + "\n" +
                "Material: " + getMaterial().toString() + "\n" +
                "Marca: "+ getMarca() +"\n" +
                "Estado: "+getEstado() + "\n" +
                "espalda: " + espalda + "\n" +
                "contorno: " + contorno + "\n" +
                "largo torso: " + largoTorso + "\n"
                ;
    }
}

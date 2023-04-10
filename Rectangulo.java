public class Rectangulo extends Figura_geometrica{
    private int base;
    private int altura;

    public Rectangulo() {
        this.base = 3;
        this.altura=2;
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura= altura;
    }


    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return base*2+altura*2;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }


    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


        public static void main(String[] args) {
            Rectangulo rect1 = new Rectangulo();
            System.out.println(rect1.calcularArea());
            System.out.println(rect1.calcularPerimetro());
        }



}
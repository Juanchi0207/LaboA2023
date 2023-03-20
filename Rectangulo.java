public class Rectangulo {
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


    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    public double getArea(int base, int altura) {
        double area = base*altura;
        return area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPerimetro(int base, int altura){
        double perimetro=base*2+altura*2;;
        return perimetro;
    }


        public static void main(String[] args) {
            Rectangulo rect1 = new Rectangulo();
            System.out.println(rect1.getArea(rect1.getBase(), rect1.getAltura()));
            System.out.println(rect1.getPerimetro(rect1.getBase(), rect1.getAltura()));
        }



}
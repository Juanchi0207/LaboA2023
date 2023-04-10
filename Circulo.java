

    public class Circulo extends Figura_geometrica{
        private int radio;

        public void setRadio(int radio) {
            this.radio = radio;
        }
        public Circulo() {
            this.radio = 2;
        }
        public int getRadio() {
            return radio;
        }

        @Override
        public double calcularArea() {
            return (Math.PI*(radio*radio));
        }

        @Override
        public double calcularPerimetro() {
            return 2*Math.PI*radio;
        }

        public static void main(String[] args) {
        Circulo circ1 = new Circulo();


        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularPerimetro());
    }


}
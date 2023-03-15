

    public class Circulo {
        private int radio;

        public Circulo() {
            this.radio = 3;
        }
        public int getRadio() {
            return radio;
        }
        public double getArea(int radio) {
            double area = (Math.PI * (radio * radio));
            return area;
        }

            public double getPerimetro(int radio){
                double perimetro;
                perimetro = 2 * Math.PI * radio;
                return perimetro;
            }

    public static void main(String[] args) {
        Circulo circ1 = new Circulo();


        System.out.println(circ1.getArea(circ1.getRadio()));
        System.out.println(circ1.getPerimetro(circ1.getRadio()));
    }


}
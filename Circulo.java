

    public class Circulo {
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
        public double calcularArea() {
            double area = (Math.PI * (radio * radio));
            return area;
        }

            public double calcularPerimetro(){
                double perimetro;
                perimetro = 2 * Math.PI * radio;
                return perimetro;
            }

    public static void main(String[] args) {
        Circulo circ1 = new Circulo();


        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularPerimetro());
    }


}
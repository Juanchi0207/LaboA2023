public class Cafetera {
    private static int cantidad_maxima=1000;
    private int cantidad_actual;
    public Cafetera(){
        cantidad_actual=0;
    }
    public Cafetera(int cantidad_maxima){
        cantidad_actual=cantidad_maxima;
        this.cantidad_maxima=cantidad_maxima;
    }
    public Cafetera(int cantidad_maxima, int cantidad_actual){
        this.cantidad_maxima=cantidad_maxima;
        if (cantidad_actual>cantidad_maxima) {
            cantidad_actual = cantidad_maxima;
        }
        else {
            this.cantidad_actual=cantidad_actual;
        }
    }

    public int getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setCantidad_maxima(int cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public void llenarCafetera(Cafetera cafetera1){
        cafetera1.cantidad_actual=Cafetera.cantidad_maxima;
        System.out.println(cafetera1.cantidad_actual);
    }

    public void llenarTaza(Cafetera cafetera1, int capacidad_taza){
        int capacidad_actual_cafetera=cafetera1.getCantidad_actual();
        if(capacidad_actual_cafetera!=0){
            if (capacidad_actual_cafetera>=capacidad_taza){
                cafetera1.cantidad_actual=capacidad_actual_cafetera-capacidad_taza;
                System.out.println("Se ha servido " + capacidad_taza + " c.c de cafe" );
            }
            else {
                cafetera1.cantidad_actual=capacidad_actual_cafetera-capacidad_actual_cafetera;
                System.out.println("Se ha servido " + capacidad_actual_cafetera + " c.c de cafe" );
            }
        }
    }
    public void vaciarCafetera(Cafetera cafetera1){
        cafetera1.cantidad_actual=0;
        System.out.println(cafetera1.cantidad_actual);
    }
    public void anadirCafe(Cafetera cafetera1, int cant_cafe){
        if (cafetera1.cantidad_actual+cant_cafe>Cafetera.cantidad_maxima) {
            cafetera1.cantidad_actual = Cafetera.cantidad_maxima;
            System.out.println(cafetera1.cantidad_actual);
        }
        else{
                    cafetera1.cantidad_actual = cafetera1.cantidad_actual + cant_cafe;
            System.out.println(cafetera1.cantidad_actual);
        }
    }

    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera();
    }
}

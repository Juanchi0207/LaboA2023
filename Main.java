import tiempos.Fecha;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Caidos del mapa");
        libro1.mostrarDatos();
        System.out.println(" ");
        libro2.mostrarDatos();
        System.out.println(" ");
        boolean comparacion= libro1.compararLibros(libro1,libro2);
        System.out.println(comparacion);
        System.out.println(" ");
        Cafetera cafetera1 = new Cafetera();
        cafetera1.llenarCafetera(cafetera1);
        cafetera1.vaciarCafetera(cafetera1);
        cafetera1.anadirCafe(cafetera1,300);
        cafetera1.llenarTaza(cafetera1,150);
        cafetera1.llenarTaza(cafetera1,200);
        System.out.println(" ");
        Cancion cancion1 = new Cancion();
        System.out.println(cancion1.getTitulo());
        System.out.println(cancion1.getAutor());
        Fecha fecha1 = new Fecha();
        fecha1.corta();
    }
}

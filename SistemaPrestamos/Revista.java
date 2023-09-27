package SistemaPrestamos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Revista extends Escritos implements Prestable{
    private LocalDate fechaPublicacion;

    public Revista(int codigo, String titulo, int anioPublicacion, LocalDate fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public boolean prestar() {
        if (fechaPublicacion.isBefore(LocalDate.now().minusMonths(3))){
            System.out.println("La revista "+ getTitulo()+ " se puede prestar");
            return true;
        }
        else {
            System.out.println("La revista " + getTitulo()+" no se puede prestar");
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
        return "REVISTA" +
                "codigo: " + getCodigo() + "\n" +
                "titulo: " + getTitulo() + "\n" +
                "año publicacion: " + getAnioPublicacion() + "\n" +
                "fechaPublicacion: " + fechaPublicacion
                ;
    }
}

package Excepciones1;

public class Perso {
    public static void main(String[] args) {
        String nombre = null;
        try {
            if (nombre==null){
                throw new ExcepcionNombreNull("Error, el nombre es null");
            }
            System.out.println("El largo del nombre es:"+ nombre.length());
        }
        catch (ExcepcionNombreNull e){
            System.out.println(e.getMessage() + " firma: Sampieri - Cerutti");
        }
    }
}

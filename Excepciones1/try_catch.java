package Excepciones1;

public class try_catch {
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El largo del nombre es:"+ nombre.length());
        }
        catch (NullPointerException e){
            System.out.println("Error, el nombre es null" + " firma: Sampieri - Cerutti");
        }
    }
}

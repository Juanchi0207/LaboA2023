package GestionMascotas;

import personas.Dueño;

public class Perro extends Mascota{
    private static String saludo="Guau";
    private static int alegria=3;
    public Perro(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        String saludo1="";
        if (!nomDueño.equals(this.getDueño().getNombre())&&nomMascota.equals(this.getNombre())) {
            for (int i=0; i<alegria; i++){
                saludo1=saludo1+saludo.toUpperCase()+"!"+" ";
            }
            alegria--;
        } else if (nomDueño.equals(this.getDueño().getNombre())&&nomMascota.equals(this.getNombre())) {
            for (int i=0; i<alegria; i++){
                saludo1=saludo1+" "+saludo;
            }
            alegria--;
        }
        return saludo1;
    }

    @Override
    public void alimentar(String nomMascota) {
        if (nomMascota.equals(this.getNombre())){
            alegria++;
        }
    }

    @Override
    public String tipo(String nomMascota) {
        return "Soy un perro";
    }
}

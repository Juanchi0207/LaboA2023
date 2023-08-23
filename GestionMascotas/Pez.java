package GestionMascotas;

import personas.Dueño;

public class Pez extends Mascota{
    private int vidas=10;

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        vidas = vidas;
    }

    public Pez(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String Saludo(String nomDueño, String nomMascota) {
        String resultado="";
        if (nomDueño.equals(this.getDueño().getNombre())&&nomMascota.equals(this.getNombre())) {
            vidas=vidas-1;
            resultado="Se le ha restado una vida";
        }
        else if (!nomDueño.equals(this.getDueño().getNombre())&&nomMascota.equals(this.getNombre())){
            resultado="La mascota murio";
            vidas=0;
        }
        if (vidas==0){
            resultado=resultado + " y fallecio";
        }
        return resultado;
    }

    @Override
    public void alimentar(String nomMascota) {
        if (nomMascota.equals(this.getNombre())){
            vidas++;
        }
    }

    @Override
    public String tipo(String nomMascota) {
        return "Soy un pez";
    }
}

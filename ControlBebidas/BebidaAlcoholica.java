package ControlBebidas;

public class BebidaAlcoholica extends Bebida{
    private int cantAlcohol;

    public BebidaAlcoholica(String nombre, int cantAlcohol) {
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol = cantAlcohol;
    }
}

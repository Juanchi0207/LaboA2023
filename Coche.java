import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int velocidad){
        velocidad++;
        setVelocidad(velocidad);
    }

    public void frenar(int velocidad){
        velocidad--;
        setVelocidad(velocidad);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Coche auto1 = new Coche();
        auto1.setVelocidad(0);
        boolean encendido=true;
        while(encendido){
            int accion;
            System.out.println("Ingrese 1 si quiere acelerar");
            System.out.println("Ingrese 2 si quiere frenar");
            System.out.println("Ingrese 3 si quiere apagar el motor");
            accion=entrada.nextInt();
            if (accion==1){
                auto1.acelerar(auto1.getVelocidad());
            }
            else if(accion==2){
                if(auto1.getVelocidad()!=0) {
                    auto1.frenar(auto1.getVelocidad());
                }
                else {
                    System.out.println("El auto ya esta quieto");
                }
            }
            else if (accion==3){
                encendido=false;
            }
            else{
                System.out.println("Ingrese un numero valido");
            }
            System.out.println(auto1.getVelocidad());
        }
    }
}

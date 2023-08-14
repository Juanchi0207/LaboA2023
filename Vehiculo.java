import java.util.ArrayList;
import java.util.Scanner;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cantRuedas;
    private int anioFabricacion;

    public Vehiculo(){
        this.marca = "Chevrolete";
        this.modelo = "Corsa";
        this.color = "Gris";
        this.cantRuedas = 4;
        this.anioFabricacion = 2008;
    }

    public Vehiculo(String marca, String modelo, String color, int cantRuedas, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public void cantidadVehiculos(ArrayList<Auto>autos,ArrayList<Camioneta>camionetas,ArrayList<Bicicleta>bicicletas){
        System.out.println("Hay " + autos.size() + " autos");
        System.out.println("Hay " + camionetas.size() + " camionetas");
        System.out.println("Hay " + bicicletas.size() + " bicicletas");
    }

    public void agregarCarga(ArrayList<Camioneta>camionetas){
        Scanner entrada=new Scanner(System.in);
        int carga=entrada.nextInt();
        String patente=entrada.nextLine();
        entrada.next();
        for (int i=0;i<camionetas.size();i++){
            if (camionetas.get(i).getPatente()==patente){
                if (carga > camionetas.get(i).getCapacidadCarga()){
                    System.out.println("La capacidad de la camioneta no es suficiente para esta carga");
                }
                else {
                    System.out.println("La capacidad es suficiente para esta carga");
                }
            }
        }
    }

    public void cantAutosDescapotables(ArrayList<Auto>autos){
        int cant=0;
        for (int i=0; i< autos.size(); i++){
            if (autos.get(i).isDescapotable()){
                cant++;
            }
        }
        System.out.println("Hay " + cant + " autos descapotables");
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    }
}

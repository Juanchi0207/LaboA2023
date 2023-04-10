import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PedidosAlmuerzo {
    private Fecha fechaCreacion;
    private Plato plato;
    private Persona persona;
    private Tiempo hora;
    private boolean entregado;

    public PedidosAlmuerzo(Fecha fechaCreacion, Plato plato, Persona persona, Tiempo hora, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.hora = hora;
        this.entregado = entregado;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tiempo getHora() {
        return hora;
    }

    public void setHora(Tiempo hora) {
        this.hora = hora;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

        public ArrayList<PedidosAlmuerzo> menu(){
            ArrayList<PedidosAlmuerzo> ordenes;
            Scanner entrada = new Scanner(System.in);
                    int menu = entrada.nextInt();
            System.out.println("Ingrese 1 si desea agregar un pedido");
            System.out.println("Ingrese 2 si desea eliminar un pedido");
            System.out.println("Ingrese 3 si desea modificar un pedido");
            /*if (menu == 1){
            Scanner entrada = new Scanner(System.in);
                String entradaStr = entrada.nextLine();
                System.out.println("Ingrese el nombre de la persona");
                ordenes.persona.add(//nombre);
                        System.out.println("Ingrese el plato ");
                ordenes.plato.add(//plato);
                        System.out.println("Ingrese la hora a entregar");
                ordenes.hora.add(//hora);
                        System.out.println("Ingrese el estado ");
                ordenes.entregado.add(//entregado);
                        ordenes.fecha_creacion.add(//fecha al momento)
           */


            if (menu == 2){

            }
            if (menu == 3){
                    System.out.println("Ingrese el ID del pedido a modificar");
                Scanner entrada = new Scanner(System.in);
                int idped = entrada.nextInt();
                for(int i =0; ordenes.size()<i;i++){
                    if (ordenes.ID = ordenes(i).getID)
                        int idpedido=ordenes.get();
                }

            }
        return ordenes;
}

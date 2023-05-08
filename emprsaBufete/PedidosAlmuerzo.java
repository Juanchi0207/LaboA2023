package emprsaBufete;

import tiempos.*;
import personas.Alumno;
import personas.Persona;
import personas.Profesor;

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

    ArrayList<Persona> personas = new ArrayList<Persona>();
    ArrayList<Plato> platos = new ArrayList<Plato>();
    ArrayList<PedidosAlmuerzo> pedidos = new ArrayList<PedidosAlmuerzo>();

    public void menu() {
        ArrayList<PedidosAlmuerzo> ordenes = new ArrayList<PedidosAlmuerzo>();
        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();
        System.out.println("Ingrese 1 si desea agregar un pedido");
        System.out.println("Ingrese 2 si desea eliminar un pedido");
        System.out.println("Ingrese 3 si desea modificar un pedido");
        System.out.println("Ingrese 4 si desea agregar un alumno a la base de datos");
        System.out.println("Ingrese 5 si desea agregar un profesor a la base de datos");
        System.out.println("Ingrese 6 si desea eliminiar a un alumno a la base de datos");
        System.out.println("Ingrese 7 si desea eliminar a un profesor de la base de datos");
        System.out.println("Ingrese 8 si desea agregar un plato");
        System.out.println("Ingrese 9 si desea eliminar un plato");
        System.out.println("Ingrese 10 si desea modificar un plato");
        if (menu == 1) {
            agregarPedido();
        }
        else if (menu == 2) {
            eliminarPedido();
        }
        else if (menu == 3) {
            modificarPedido();
        }
        else if (menu == 4) {
            agregarAlumno();
        }
        else if (menu == 5) {
            agregarProfesor();
        }
        else if (menu == 6) {
            eliminarAlumno();
        }
        else if (menu == 7) {
            eliminarProfesor();
        }
        else if (menu == 8) {
            agregarPlato();
        }
        else if (menu == 9) {
            eliminarPlato();
        }
        else if (menu == 10) {
            modificarPlato();
        }

    }

    public void agregarPedido() {
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int anio = entrada.nextInt();
        Fecha fechaCreacion = new Fecha(dia, mes, anio);
        String nomPlato = entrada.nextLine();
        int precio = entrada.nextInt();
        Plato plato1 = new Plato(nomPlato, precio);
        System.out.println("La persona es profesor o alumno?");
        String condicion = entrada.nextLine();
        int hora = entrada.nextInt();
        int minutos = entrada.nextInt();
        Tiempo horaFinal = new Tiempo(hora, minutos);
        boolean entregado = entrada.nextBoolean();
        String nombre = entrada.nextLine();
        String apellido = entrada.nextLine();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre) && personas.get(i).getApellido().equals(apellido)) {
                if (personas.get(i) instanceof Profesor){
                    plato1.setPrecio(plato1.getPrecio()-((((Profesor) personas.get(i)).getPorcentajeDescuento()*plato1.getPrecio())/100));;
                    PedidosAlmuerzo pedido = new PedidosAlmuerzo(fechaCreacion, plato1, personas.get(i), horaFinal, entregado);
                    pedidos.add(pedido);
                }
                else {
                    PedidosAlmuerzo pedido = new PedidosAlmuerzo(fechaCreacion, plato1, personas.get(i), horaFinal, entregado);
                    pedidos.add(pedido);
                }
            }
        }
    }
    public void eliminarPedido(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente del pedido a eliminar");
        String nombrePersona = entrada.nextLine();
        for (int i = 0; i < platos.size(); i++) {
            if (pedidos.get(i).getPersona().getNombre()==nombrePersona) {
                pedidos.remove(i);
            }
        }
    }
    public void modificarPedido(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente del pedido a modificar");
        String nombrePersona = entrada.nextLine();
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getPersona().getNombre()==nombrePersona) {
                System.out.println("Seleccione 1 para modificar la fecha");
                System.out.println("Seleccione 2 para modificar el plato");
                System.out.println("Seleccione 3 para modificar la persona");
                System.out.println("Seleccione 4 para modificar el horario de entrega");
                System.out.println("Seleccione 5 para modificar el estado del pedido");
                int opcion = entrada.nextInt();
                if (opcion==1){
                    System.out.println("Ingrese el dia");
                    int dia= entrada.nextInt();
                    System.out.println("Ingrese el mes");
                    int mes=entrada.nextInt();
                    System.out.println("Ingrese el anio");
                    int anio= entrada.nextInt();
                    pedidos.get(i).setFechaCreacion(new Fecha(dia,mes,anio));
                }
                else if (opcion==2){
                    System.out.println("Ingrese el nombre del plato que quiere agregar");
                    String nombrePlato = entrada.nextLine();
                    for(int x=0; x<pedidos.size(); x++){
                        if (platos.get(x).getNombre().equals(nombrePlato)){
                            pedidos.get(i).setPlato(platos.get(x));
                        }
                    }
                }
                else if(opcion==3){
                    System.out.println("Ingrese el nombre de la persona que va a reemplazar a la de el pedido");
                    String nomPersona= entrada.nextLine();
                    for(int x=0; x< personas.size(); x++){
                        if (personas.get(x).getNombre().equals(nomPersona)){
                            pedidos.get(i).setPersona(personas.get(x));
                        }
                    }
                }
                else if(opcion==4){
                    System.out.println("Ingrese la hora");
                    int horas= entrada.nextInt();
                    System.out.println("Ingrese los minutos");
                    int minutos= entrada.nextInt();
                    entrada.next();
                    Tiempo nuevaHora=new Tiempo(horas,minutos);
                    pedidos.get(i).setHora(nuevaHora);
                }
                else if(opcion==5){
                    System.out.println("Esta entregado el pedido?");
                    String bool=entrada.nextLine();
                    if (bool.equals("Si")){
                        pedidos.get(i).setEntregado(true);
                    }
                    else if(bool.equals("No")){
                        pedidos.get(i).setEntregado(false);
                    }
                }
            }
            else{
                System.out.println("El cliente no existe o no tiene ningun pedido");
            }
        }
    }
    public void agregarPlato() {
        Scanner entrada = new Scanner(System.in);
        String nombrePlato = entrada.nextLine();
        int precio = entrada.nextInt();
        entrada.next();
        Plato plato1 = new Plato(nombrePlato, precio);
        platos.add(plato1);
    }

    public void eliminarPlato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato a eliminar");
        String nombrePlato = entrada.nextLine();
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().equals(nombrePlato)) {
                platos.remove(i);

            }
        }
    }
    public void modificarPlato(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato a modificar");
        String nombrePlato = entrada.nextLine();
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().equals(nombrePlato)) {
                System.out.println("Seleccione 1 para modificar el nombre");
                System.out.println("Seleccione 2 para modificar el precio");
                int opcion = entrada.nextInt();
                    if (opcion==1){
                        System.out.println("Seleccione el nuevo nombre del plato");
                        String nuevoNombre = entrada.nextLine();
                        platos.get(i).setNombre(nuevoNombre);
                    }
                    else if (opcion==2){
                        System.out.println("Seleccione el nuevo precio del plato");
                        int nuevoPrecio = entrada.nextInt();
                        platos.get(i).setPrecio(nuevoPrecio);
                    }
            }
        }
    }

    public void agregarAlumno() {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        String apellido = entrada.nextLine();
        String division = entrada.nextLine();
        entrada.next();
        Alumno alumno1 = new Alumno(nombre, apellido, division);
        personas.add(alumno1);
    }
    public void agregarProfesor() {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        String apellido = entrada.nextLine();
        int porcentajeDescuento = entrada.nextInt();
        entrada.next();
        Profesor profesor1 = new Profesor(nombre, apellido, porcentajeDescuento);
        personas.add(profesor1);
    }
    public void eliminarProfesor() {
        /*deberia poner un boolean de profesor para diferenciarlo de alumno en vector personas*/
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        String apellido = entrada.nextLine();
        boolean eliminacion=false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Profesor) {
                if (nombre.equals(personas.get(i).getNombre())  && apellido.equals(personas.get(i).getApellido())) {
                    personas.remove(i);
                    System.out.println("La persona se ha eliminado exitosamente");
                    eliminacion=true;
                    i=personas.size()+1;
                }
            } else {
                System.out.println("La persona seleccionada no es un personas.Profesor");
            }
        }
        if (eliminacion==false){
            System.out.println("No se pudo eliminar a ninguna persona");
        }
    }

    public void eliminarAlumno() {
        /*deberia poner un boolean de profesor para diferenciarlo de alumno en vector personas*/
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        String apellido= entrada.nextLine();
        boolean eliminacion=false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Alumno) {
                if (nombre.equals(personas.get(i).getNombre())  && apellido.equals(personas.get(i).getApellido())) {
                    personas.remove(i);
                    System.out.println("La persona se ha eliminado exitosamente");
                    eliminacion=true;
                    i=personas.size()+1;
                }
            } else {
                System.out.println("La persona seleccionada no es un personas.Alumno");
            }
        }
        if (!eliminacion){
            System.out.println("No se pudo eliminar a ninguna persona");
        }
    }
}
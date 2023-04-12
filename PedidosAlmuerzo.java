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
        if (menu == 1) {
            agregarPedido();
        }
        if (menu == 2) {

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
                PedidosAlmuerzo pedido = new PedidosAlmuerzo(fechaCreacion, plato1, personas.get(i), horaFinal, entregado);
                pedidos.add(pedido);
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

    public void agregarPlato() {
        Scanner entrada = new Scanner(System.in);
        String nombrePlato = entrada.nextLine();
        int precio = entrada.nextInt();
        entrada.next();
        Plato plato1 = new Plato(nombrePlato, precio);
        platos.add(plato1);
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
                System.out.println("La persona seleccionada no es un Profesor");
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
                System.out.println("La persona seleccionada no es un Alumno");
            }
        }
        if (!eliminacion){
            System.out.println("No se pudo eliminar a ninguna persona");
        }
    }
}
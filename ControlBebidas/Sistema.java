package ControlBebidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashMap<Bebida, Integer>listaBebidas;
    private HashMap<Integer, Usuario>listaUsuarios;

    public Sistema(HashMap<Bebida, Integer> listaBebidas, HashMap<Integer, Usuario> listaUsuarios) {
        this.listaBebidas = listaBebidas;
        this.listaUsuarios = listaUsuarios;
    }

    public void coeficienteXpersona(){
        boolean vuelta=false;
        int coefMayor=0;
        int coefMenor=0;
        Usuario usuarioMayor=null;
        Usuario usuarioMenor=null;
        try {
            if (listaUsuarios.size()==0){
                throw new noHayUsuarios("No existen usuarios en el sistema");
            }
            for (Map.Entry<Integer, Usuario> usuario : listaUsuarios.entrySet()) {
                int coefAux = usuario.getValue().calcularCoeficienteHidratacion();
                if (!vuelta) {
                    coefMayor = coefAux;
                    usuarioMayor = usuario.getValue();
                    coefMenor = coefAux;
                    usuarioMenor = usuario.getValue();
                    vuelta = true;
                }
                if (coefMayor < coefAux) {
                    coefMayor = coefAux;
                    usuarioMayor = usuario.getValue();
                }
                if (coefMenor > coefAux) {
                    coefMenor = coefAux;
                    usuarioMenor = usuario.getValue();
                }
            }
            System.out.println("El usuario con mas coeficiente es: "+usuarioMayor.getNombre() + " con " + coefMayor + " de hidratacion");
            System.out.println("El usuario con menor coeficiente es: "+usuarioMenor.getNombre() + " con " + coefMenor + " de hidratacion");
        } catch (noHayUsuarios e) {
            System.out.println(e);
        }

    }

    public void tomarBebida(int dni, Bebida bebida, int cantidad){
        try {
            if (listaBebidas.get(bebida)>=cantidad){
                listaUsuarios.get(dni).tomarBebida(bebida,cantidad);
                listaBebidas.put(bebida, listaBebidas.get(bebida)-cantidad);
            }
            else {
                throw new cantidadNoDisponible("No hay sufienctes bebidas para satisfacer sus necesidades");
            }
        } catch (cantidadNoDisponible e) {
            System.out.println(e);
        }
    }

    public void agregarUsuario(String nombre, String apellido, int dni, HashMap<Bebida, Integer>bebidas){
        try {
            if (listaUsuarios.containsKey(dni)) {
                throw new dniYaExiste("El dni ingresado ya existe en el sistema");
            }
            else {
                Usuario u1= new Usuario(nombre,apellido,dni,bebidas);
                listaUsuarios.put(dni, u1);
            }
        } catch (dniYaExiste e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Sistema sistema=new Sistema(new HashMap<>(),new HashMap<>());
        sistema.coeficienteXpersona(); //tira exception usuarios
        System.out.println("--------------------------");
        BebidaAlcoholica bebidaAlcoholica1 = new BebidaAlcoholica("Vodka" , 30);
        BebidaAlcoholica bebidaAlcoholica2 = new BebidaAlcoholica("Cerveza", 10);
        BebidaAzucarada bebidaAzucarada1 = new BebidaAzucarada("Coca-Cola", 20);
        BebidaAzucarada bebidaAzucarada2 = new BebidaAzucarada("Paso de los toros", 15);
        BebidaNeutra bebidaNeutra1 = new BebidaNeutra("Agua", 50, 0);
        BebidaNeutra bebidaNeutra2 = new BebidaNeutra("Jugo", 35,3);
        sistema.listaBebidas.put(bebidaAlcoholica1,10);
        sistema.listaBebidas.put(bebidaAlcoholica2,5);
        sistema.listaBebidas.put(bebidaAzucarada1,8);
        sistema.listaBebidas.put(bebidaAzucarada2,2);
        sistema.listaBebidas.put(bebidaNeutra1,7);
        sistema.listaBebidas.put(bebidaNeutra2,1);
        HashMap<Bebida, Integer> u1Bebidas = new HashMap<>();
        u1Bebidas.put(bebidaNeutra1, 10);
        HashMap<Bebida, Integer> u2Bebidas = new HashMap<>();
        u2Bebidas.put(bebidaAlcoholica2, 6);
        u2Bebidas.put(bebidaNeutra2, 10);
        u2Bebidas.put(bebidaAzucarada2, 2);
        HashMap<Bebida, Integer> u3Bebidas = new HashMap<>();
        u3Bebidas.put(bebidaAlcoholica1, 4);
        u3Bebidas.put(bebidaNeutra2, 10);
        u3Bebidas.put(bebidaAzucarada1, 4);
        sistema.agregarUsuario("Juan", "Sampieri", 46878279, u1Bebidas);
        sistema.agregarUsuario("Ciro", "Cerutti", 46956247, u2Bebidas);
        sistema.agregarUsuario("Gonzalo", "Gonzalez", 46777777, u3Bebidas);
        sistema.agregarUsuario("Juan", "Sampieri", 46878279, u1Bebidas); //tira exception dni
        System.out.println("--------------------------");
        sistema.coeficienteXpersona();
        System.out.println("--------------------------");
        sistema.tomarBebida(46878279, bebidaNeutra2,1);
        sistema.tomarBebida(46956247, bebidaNeutra2,1); // tira exception cantidad
    }
}

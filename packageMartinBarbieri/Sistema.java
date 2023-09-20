package packageMartinBarbieri;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Bebedor> bebedores;
    private HashMap<Bebida, Integer> bebidas;

    public Sistema(HashSet<Bebedor> bebedores, HashMap<Bebida, Integer> bebidas) {
        this.bebedores = bebedores;
        this.bebidas = bebidas;
    }

    public Sistema() {
        this.bebedores = new HashSet<>();
        this.bebidas = new HashMap<>();
    }

    public void aniadirPersona(String nombre, String apellido, int dni, HashMap<Bebida, Integer> bebidas) throws UsuarioDuplicado {
        for (Bebedor b : bebedores) {
            if (b.getDni() == dni) {
                throw new UsuarioDuplicado("Ya existe el usuario en el sistema");
            }
        }
        bebedores.add(new Bebedor(nombre, apellido, dni, bebidas));
    }

    public Bebedor mejorCoeficiente() {
        if (bebedores.size() == 0) {
            throw new NullPointerException("No hay bebedores registrados");
        } else {
            Bebedor bebedorMejor = null;
            for (Bebedor b : bebedores) {
                if (bebedorMejor==(null) || b.coeficienteDeHidratacion() > bebedorMejor.coeficienteDeHidratacion()) {
                    bebedorMejor = b;
                }
            }
            return bebedorMejor;
        }
    }

    public Bebedor peorCoeficiente() {
        if (bebedores.size() == 0) {
            throw new NullPointerException("No hay bebedores registrados");
        } else {
            Bebedor bebedorPeor = null;
            for (Bebedor b : bebedores) {
                if (bebedorPeor==(null) || b.coeficienteDeHidratacion() < bebedorPeor.coeficienteDeHidratacion()) {
                    bebedorPeor = b;
                }
            }
            return bebedorPeor;
        }
    }

    public void verificarUsuario(Bebedor b) throws UsuarioInexistente {
        if (!bebedores.contains(b)) {
            throw new UsuarioInexistente("No está registardo en el sistema");
        }
    }

    public void verificarStock(Bebida b, int c) throws StockInsuficiente {
        if (bebidas.get(b) < c) {
            throw new StockInsuficiente("No tenemos esa cantidad de bebidas");
        }
    }

    public void verificarBebida(Bebida b) throws BebidaInexistente {
        if (!bebidas.containsKey(b)) {
            throw new BebidaInexistente("No tenemos esa bebida");
        }
    }

    public void actualizarStock(Bebida b, int c) {
        bebidas.put(b, bebidas.get(b) - c);
    }

    public void beber(Bebedor b, Bebida bebida, int cant) {
        try {
            verificarUsuario(b);
            verificarBebida(bebida);
            verificarStock(bebida, cant);
            actualizarStock(bebida, cant);
            b.agregarBebida(bebida, cant);

        } catch (StockInsuficiente e) {
            e.getMessage();
        } catch (UsuarioInexistente e) {
            e.getMessage();
        } catch (BebidaInexistente e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        try {
            sistema.mejorCoeficiente(); //tira exception usuarios
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            sistema.peorCoeficiente();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("--------------------------");
        Alcoholica bebidaAlcoholica1 = new Alcoholica("Vodka", 30);
        Alcoholica bebidaAlcoholica2 = new Alcoholica("Cerveza", 10);
        Azucarada bebidaAzucarada1 = new Azucarada("Coca-Cola", 20);
        Azucarada bebidaAzucarada2 = new Azucarada("Paso de los toros", 15);
        Neutra bebidaNeutra1 = new Neutra("Agua", 50, 0);
        Neutra bebidaNeutra2 = new Neutra("Jugo", 35, 3);
        sistema.bebidas.put(bebidaAlcoholica1, 10);
        sistema.bebidas.put(bebidaAlcoholica2, 5);
        sistema.bebidas.put(bebidaAzucarada1, 8);
        sistema.bebidas.put(bebidaAzucarada2, 2);
        sistema.bebidas.put(bebidaNeutra1, 7);
        sistema.bebidas.put(bebidaNeutra2, 1);
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
        try {
            sistema.aniadirPersona("Juan", "Sampieri", 46878279, u1Bebidas);
            sistema.aniadirPersona("Ciro", "Cerutti", 46956247, u2Bebidas);
            sistema.aniadirPersona("Gonzalo", "Gonzalez", 46777777, u3Bebidas);
            sistema.aniadirPersona("Juan", "Sampieri", 46878279, u1Bebidas); //tira exception dni
        } catch (UsuarioDuplicado e) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
        try {
            System.out.println(sistema.mejorCoeficiente().getNombre());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(sistema.peorCoeficiente().getNombre());
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("--------------------------");
        Bebedor u1= new Bebedor("Juan", "Sampieri", 46878279, u1Bebidas);
        Bebedor u3= new Bebedor("Gonzalo", "Gonzalez", 46777777, u3Bebidas);
        sistema.beber(u1, bebidaNeutra2,1);
        System.out.println("--------------------------");
        sistema.beber(u3, bebidaNeutra2,1); // tira exception cantidad
        System.out.println("--------------------------");

//        for (Map.Entry<Integer, Usuario> usuario:sistema.listaUsuarios.entrySet()){
//            if (usuario.getValue().getNombre().equals("Gonzalo")){
//                usuario.getValue().calcularCoeficienteHidratacion();
//            }
//        }
    }
}


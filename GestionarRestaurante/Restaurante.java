package GestionarRestaurante;

import java.time.LocalDate;
import java.util.HashSet;

public class Restaurante implements AgregacionesRestaurante{
    private String nombre;
    private HashSet<Plato>menu;
    private HashSet<Chef>listaChefs;

    public Restaurante(String nombre, HashSet<Plato> menu, HashSet<Chef> listaChefs) {
        this.nombre = nombre;
        this.menu = menu;
        this.listaChefs = listaChefs;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    public HashSet<Chef> getListaChefs() {
        return listaChefs;
    }

    public void setListaChefs(HashSet<Chef> listaChefs) {
        this.listaChefs = listaChefs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void verificarMenu(Plato plato) throws ExceptionAgregarPlato {
        if (menu.contains(plato)){
            throw new ExceptionAgregarPlato("El plato " + plato.getNombre() +" ya se encuentra en el menu de " + getNombre());
        }
    }

    public void verificarChef(Plato plato) throws ExceptionAgregarPlato {
        if (!listaChefs.contains(plato.getEncargado())){
            throw new ExceptionAgregarPlato("El chef encargado de "+plato.getNombre()+" no esta contratado en "+getNombre());
        }
    }

    @Override
    public void agregarChef(Chef chef) throws ExceptionAgregarChef {
        chef.verificarEdad();
        chef.verificarExperiencia();
        listaChefs.add(chef);
        chef.getExperienciaCulinaria().add(this);
        chef.setRestauranteActual(this);
        System.out.println("El chef "+chef.getNombre()+" se unio al equipo de "+getNombre());
    }


    @Override
    public void agregarPlato(Plato plato) throws ExceptionAgregarPlato{
        verificarMenu(plato);
        verificarChef(plato);
        menu.add(plato);
        System.out.println("El plato "+plato.getNombre()+" se agrego al menu de "+getNombre()+". Encargado del plato: "+plato.getEncargado().getNombre());

    }

    public static void main(String[] args) {
        Restaurante restaurante1=new Restaurante("La farola",new HashSet<>(), new HashSet<>());
        Restaurante restaurante2=new Restaurante("Urbano",new HashSet<>(), new HashSet<>());
        Restaurante restaurante3=new Restaurante("Letue",new HashSet<>(), new HashSet<>());
        Restaurante restaurante4=new Restaurante("Buffarini",new HashSet<>(), new HashSet<>());
        Restaurante restaurante5=new Restaurante("McDonalds",new HashSet<>(), new HashSet<>());
        Restaurante restaurante6=new Restaurante("NewCastle",new HashSet<>(), new HashSet<>());
        HashSet<Restaurante>exp1=new HashSet<>();
        HashSet<Restaurante>exp2=new HashSet<>();
        HashSet<Restaurante>exp3=new HashSet<>();
        HashSet<Restaurante>exp4=new HashSet<>();

        exp1.add(restaurante1);
        exp1.add(restaurante2);
        exp1.add(restaurante3);
        exp1.add(restaurante4);
        exp1.add(restaurante5);
        exp2.add(restaurante1);
        exp2.add(restaurante2);
        exp3.add(restaurante1);
        exp3.add(restaurante2);
        exp3.add(restaurante3);
        exp3.add(restaurante4);
        exp4.add(restaurante1);
        exp4.add(restaurante2);
        exp4.add(restaurante3);
        exp4.add(restaurante4);

        Chef chef1=new Chef("Juan", "Sampieri", 1, LocalDate.of(2004,7,2), exp1, null);
        Chef chef2=new Chef("Gonzalo", "Gonzalin", 2, LocalDate.of(2004,7,2), exp2, null);
        Chef chef3=new Chef("Cañon", "Cañas", 3, LocalDate.of(2006,7,2), exp3, null);
        Chef chef4=new Chef("Pass", "lineGonza", 4, LocalDate.of(2003,7,2), exp4, null);

        try {
            restaurante6.agregarChef(chef1); //si
        } catch (ExceptionAgregarChef e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarChef(chef2); //error por experiencia baja
        } catch (ExceptionAgregarChef e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarChef(chef3); //error por edad
        } catch (ExceptionAgregarChef e) {
            System.out.println(e);;
        }
        System.out.println("----------------");


        Plato plato1=new Plato("Ribs a la barbacoa", "Ribs bro", 3400, TiposPlato.PLATO_PRINCIPAL, chef1);
        Plato plato2=new Plato("Burga", "como la del mc", 2500, TiposPlato.PLATO_PRINCIPAL, chef2);
        Plato plato3=new Plato("Flan", "De dulce de leche", 600, TiposPlato.POSTRE, chef3);
        Plato plato4=new Plato("Bastones de muzzarella", "Con queso de cabra", 1200, TiposPlato.ENTRADA, chef4);

        try {
            restaurante6.agregarPlato(plato1);
        } catch (ExceptionAgregarPlato e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarPlato(plato2);
        } catch (ExceptionAgregarPlato e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarPlato(plato3);
        } catch (ExceptionAgregarPlato e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarPlato(plato4);
        } catch (ExceptionAgregarPlato e) {
            System.out.println(e);;
        }
        System.out.println("----------------");
        try {
            restaurante6.agregarPlato(plato1);
        } catch (ExceptionAgregarPlato e) {
            System.out.println(e);;
        }

    }
}

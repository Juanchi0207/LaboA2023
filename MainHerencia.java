import personas.*;

public class MainHerencia {
    public static void main(String[] args) {
        Empleado E1=new Empleado("Jose");
        Operario OP1=new Operario("Luis");
        Directivo D1=new Directivo("Juan");
        Oficial OF1=new Oficial("Ciro");
        Tecnico T1=new Tecnico("Julian");

        System.out.println(E1);
        System.out.println(OP1);
        System.out.println(D1);
        System.out.println(OF1);
        System.out.println(T1);

    }
}

package EmpresaComputadoras;

public class CPU extends Componentes{
    public CPU(String fabricante, String modelo, int precio, int stock) {
        super(fabricante, modelo, precio, stock);
    }
    public CPU(){
        super("AMD","RYZEN 5 5600G",790,4);
    }
}

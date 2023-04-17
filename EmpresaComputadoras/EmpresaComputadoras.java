package EmpresaComputadoras;

import emprsaBufete.PedidosAlmuerzo;

import java.util.ArrayList;

public class EmpresaComputadoras {
    private ArrayList<PedidosComputadoras>pedidos;

    public void agregarPedido(){

    }

    public static void main(String[] args) {
        ArrayList<Componentes>componentes=new ArrayList<Componentes>();
        CPU cpu=new CPU();
        Teclado teclado=new Teclado();
        Mouse mouse=new Mouse();
        Impresora impresora=new Impresora();
        Pantalla pantalla=new Pantalla();
        componentes.add(cpu);
        componentes.add(teclado);
        componentes.add(mouse);
        componentes.add(impresora);
        componentes.add(pantalla);
        Computadora computadora=new Computadora(componentes);
    }
}



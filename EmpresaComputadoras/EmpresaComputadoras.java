package EmpresaComputadoras;

import emprsaBufete.PedidosAlmuerzo;
import personas.Cliente;
import personas.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaComputadoras {
    private ArrayList<PedidosComputadoras>pedidos;
    private ArrayList<Componentes>componentes;
    private static int recargo=5;


    public void agregarPedido(){
        boolean ciclo=true;
        boolean compraMinima=false;
        boolean CPU=false;
        boolean dispEntrada=false;
        boolean dispSalida=false;
        Scanner entrada=new Scanner(System.in);
        ArrayList<Componentes>componentesPC=new ArrayList<Componentes>();
        while(ciclo){
            System.out.println("Seleccione uno de los componentes: ");
            for (int i=0;i<componentes.size();i++){
                System.out.println((i+1) + ". " + componentes.get(i).getModelo());
            }
            int seleccion= entrada.nextInt();
            try {
                if (componentes.get(seleccion-1).getStock()>=0){
                    componentesPC.add(componentes.get(seleccion-1));
                }
                else {
                    throw new ExcepcionStockProductos("No hay stock del producto");
                }
            }
            catch (ExcepcionStockProductos e){
                System.out.println(e.getMessage());
            }
            for (int x=0;x<componentesPC.size();x++){
                if (componentesPC.get(x) instanceof CPU){
                    CPU=true;
                }
                else if(componentesPC.get(x) instanceof Entrada){
                    dispEntrada=true;
                }
                else if(componentesPC.get(x) instanceof Salida){
                    dispSalida=true;
                }
                if (CPU && dispEntrada && dispSalida){
                    compraMinima=true;
                }
            }
            if (compraMinima==false){
                System.out.println("Tiene que agregar mas componentes");
            }
            else {
                System.out.println("Ya puede finalizar la compra, quieres termiar?");
                int terminar= entrada.nextInt();
                if (terminar==1){
                    ciclo=false;
                }
            }
        }
        Computadora computadoraPedido=new Computadora(componentesPC);
        int precio=precioTotal(computadoraPedido);
        Cliente cliente = new Cliente("Juan","Sampieri", LocalDate.now(),"Bolivia 5717", 468782789,2046878279);
        System.out.println("Efectivo o tarjeta?");
        int metodo= entrada.nextInt();
        entrada.next();
        if (metodo==1){
            int numTarjeta= entrada.nextInt();
            String banco= entrada.nextLine();
            String tipo= entrada.nextLine();
            Tarjeta tarjeta=new Tarjeta(numTarjeta,banco,tipo);
            precio=precio+((EmpresaComputadoras.recargo*precio)/100);
            PedidosComputadoras pedido=new PedidosComputadoras(computadoraPedido,cliente,precio,tarjeta);
        }
        else {
            Efectivo efectivo=new Efectivo();
            PedidosComputadoras pedido=new PedidosComputadoras(computadoraPedido,cliente,precio,efectivo);
        }
            for (int i =0;i<componentesPC.size(); i++){
                componentesPC.get(i).setStock(componentesPC.get(i).getStock()-1);
            }
    }

    public int precioTotal(Computadora computadora){
        int precioTotal=0;
        for (int i=0; i<computadora.getComponentes().size();i++){
            precioTotal= precioTotal+ computadora.getComponentes().get(i).getPrecio();
        }
        return precioTotal;
    }

    public EmpresaComputadoras(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }


    public static void main(String[] args) {
        CPU cpu=new CPU();
        Teclado teclado=new Teclado();
        Mouse mouse=new Mouse();
        Impresora impresora=new Impresora();
        Pantalla pantalla=new Pantalla();
        ArrayList<Componentes>componentes1=new ArrayList<Componentes>();
        componentes1.add(cpu);
        componentes1.add(teclado);
        componentes1.add(mouse);
        componentes1.add(impresora);
        componentes1.add(pantalla);
        EmpresaComputadoras empresa=new EmpresaComputadoras(componentes1);
        empresa.agregarPedido();
        empresa.pedidos.get(0).getComputadora().cantComp(empresa.pedidos.get(0).getComputadora());
    }
}



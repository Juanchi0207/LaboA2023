package TiendaElectronica;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Producto>productos;

    public Sistema(ArrayList<Producto>productos1){
        this.productos=productos1;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        if(productos.contains(producto)){
            productos.remove(producto);
        }
    }
    public void modificarProducto(Producto producto, int i){
        productos.set(i, producto);
    }
    public int mayorStock(){
        int stock=productos.get(0).getStock();
        for (int i=0;i<productos.size();i++){
            if (productos.get(i).getStock()>stock){
                stock=productos.get(i).getStock();
            }
        }
        return stock;
    }
    public int menorStock(){
        int stock=productos.get(0).getStock();
        for (int i=0;i<productos.size();i++){
            if (productos.get(i).getStock()<stock){
                stock=productos.get(i).getStock();
            }
        }
        return stock;
    }

    public static void main(String[] args) {
        ArrayList<Producto>productos1=new ArrayList<Producto>();
    }
}

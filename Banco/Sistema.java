package Banco;

import tiempos.Fecha;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente>clientes;
    private ArrayList<CuentaBancaria>cuentasBancarias;

    public Sistema(ArrayList<Cliente> clientes, ArrayList<CuentaBancaria> cuentasBancarias) {
        this.clientes = clientes;
        this.cuentasBancarias = cuentasBancarias;
    }

    public int devolverCbu(int cuil){
        int cbu=0;
        for (int i=0; i<cuentasBancarias.size();i++){
            if (cuentasBancarias.get(i).getTitular().getCuil()==cuil){
                cbu=cuentasBancarias.get(i).getCbu();
            }
        }
        return cbu;
    }

    public String nomApellidoCuenta(int numCuenta){
        String nomApellido="";
        for (int i=0;i<cuentasBancarias.size();i++){
            if (cuentasBancarias.get(i).getNumCuenta()==numCuenta){
                nomApellido=cuentasBancarias.get(i).getTitular().getNombre() + " " + cuentasBancarias.get(i).getTitular().getApellido();
            }
        }
        return nomApellido;
    }

    public Fecha clienteMasJoven(){
        Fecha fecha=clientes.get(0).getFecha_nacimiento();
        for (int i=0; i< clientes.size();i++){
            if (clientes.get(i).getFecha_nacimiento().getAnio()<fecha.getAnio() && clientes.get(i).getFecha_nacimiento().getMes()<fecha.getMes() && clientes.get(i).getFecha_nacimiento().getDia()< fecha.getDia()){
                fecha=clientes.get(i).getFecha_nacimiento();
            }
        }
        return fecha;
    }


}

package Banco;

import personas.Cliente;

public class CuentaBancaria{
    private Cliente titular;
    private int cbu;
    private int numCuenta;
    private String alias;
    private int saldo;

    public void retirarDinero(int monto){
        if (monto<saldo){
            saldo=saldo-monto;
        }
        else {
            System.out.println("No hay suficiente dinero en la cuenta");
        }
    }
    public void depositarDinero(int monto){
        saldo=saldo+monto;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

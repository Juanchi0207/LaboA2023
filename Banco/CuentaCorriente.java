package Banco;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
    private ArrayList<Cheque>cheques;

    public CuentaCorriente(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }
}

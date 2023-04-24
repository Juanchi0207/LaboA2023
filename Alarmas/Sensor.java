package Alarmas;

public abstract class Sensor {
    private boolean conectado;
    private int valor;
    private int valorUmbral;
    private int añoAdquisicion;


    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(int valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public int getAñoAdquisicion() {
        return añoAdquisicion;
    }

    public void setAñoAdquisicion(int añoAdquisicion) {
        this.añoAdquisicion = añoAdquisicion;
    }
    public Sensor(boolean conectado, int valor, int valorUmbral, int añoAdquisicion) {
        this.conectado = conectado;
        this.valor = valor;
        this.valorUmbral = valorUmbral;
        this.añoAdquisicion = añoAdquisicion;
    }

    public void salto(){
        System.out.println("Salto el sensor");
    };
}

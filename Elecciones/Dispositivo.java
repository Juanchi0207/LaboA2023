package Elecciones;

public class Dispositivo {
    private int num_serie;
    private String fabricante;
    private String modelo;

    public Dispositivo(int num_serie, String fabricante, String modelo) {
        this.num_serie = num_serie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

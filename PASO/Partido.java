package PASO;

public class Partido {

    private PartidosPoliticos nombre;
    private Candidato representate;

    public PartidosPoliticos getNombre() {
        return nombre;
    }

    public void setNombre(PartidosPoliticos nombre) {
        this.nombre = nombre;
    }

    public Candidato getRepresentate() {
        return representate;
    }

    public void setRepresentate(Candidato representate) {
        this.representate = representate;
    }

    public Partido(PartidosPoliticos nombre, Candidato representate) {
        this.nombre = nombre;
        this.representate = representate;
    }
}

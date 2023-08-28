package PASO;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

   private  HashSet<Partido> partidosPresentados;
    private HashSet<Votante> padron;



    public HashSet<Partido> getPartidosPresentados() {
        return partidosPresentados;
    }

    public void setPartidosPresentados(HashSet<Partido> partidosPresentados) {
        this.partidosPresentados = partidosPresentados;
    }

    public HashSet<Votante> getPadron() {
        return padron;
    }

    public void setPadron(HashSet<Votante> padron) {
        this.padron = padron;
    }

    public Sistema(HashSet<Partido> partidosPresentados, HashSet<Votante> padron) {
        this.partidosPresentados = partidosPresentados;
        this.padron = padron;
    }

//    public String emitirVoto(Partido partido,Votante votante){
//        String voto="El voto no ha sido emitido";
//        if (!votante.getEstadoVoto()){
//            for(Map.Entry<Provincia, Integer> listaProvincias:partido.getRepresentate().getCantidadVotos().entrySet()){
//                if (listaProvincias.getKey()==votante.getProvincia()){
//
//                    partido.getRepresentate().getCantidadVotos().put(votante.getProvincia(), listaProvincias.getValue()+1);
//                    voto="El voto ha sido emitido";
//                    for (Votante votante1:padron){
//                        if (votante1==votante){
//                            votante1.setEstadoVoto(true);
//                        }
//                    }
//                 }
//             }
//        }
//        return voto;
//    }

    public void votosXcandidato(){
        int cantVotantesTotal=padron.size();
        Candidato ganador=null;
        int votosGanador=0;
        for(Partido partido:partidosPresentados){
            int votos=0;
            for (Map.Entry<Provincia, Integer> provinciaVotos: partido.getRepresentate().getCantidadVotos().entrySet()){
                votos=votos+provinciaVotos.getValue();
                System.out.println("El candidato " + partido.getRepresentate().getNombre()+ " " + partido.getRepresentate().getApellido() + " obtuvo " +provinciaVotos.getValue() + " en la provincia de "+ provinciaVotos.getKey());
            }
            if (votos>votosGanador){
                ganador=partido.getRepresentate();
            }
            System.out.println("El candidato " + partido.getRepresentate().getNombre()+ " " + partido.getRepresentate().getApellido() + " obtuvo " + votos + " votos");
            System.out.println("Representa un " + (votos*100)/cantVotantesTotal + "% del total");
            System.out.println(" ");
        }
        System.out.println("El ganador es: " + ganador.getNombre() + " " + ganador.getApellido());
    }

    public int cantidadNoVotantes(){
        int cantidad=0;
        for (Votante votante:padron){
            if (!votante.getEstadoVoto()){
                cantidad++;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Votante votante1=new Votante("Juan", "Sampieri",false, Provincia.BUENOS_AIRES);
        Votante votante2=new Votante("Ciro", "Cerutti",false, Provincia.CORDOBA);
        Votante votante3=new Votante("Julian" , "Gonzalo",false, Provincia.CATAMARCA);
        Votante votante4=new Votante("Lucas", "Pancera",false, Provincia.CORRIENTES);
        HashSet<Votante>listaVotantes=new HashSet<Votante>();
        listaVotantes.add(votante1);
        listaVotantes.add(votante2);
        listaVotantes.add(votante3);
        listaVotantes.add(votante4);
        HashMap<Provincia,Integer>listaProvincias=new HashMap<>();
        for (Provincia provincia:Provincia.values()){
            listaProvincias.put(provincia,0);
        }
        Candidato candidato1=new Candidato("Javier", "Milei",new HashSet<String>(), listaProvincias);
        Candidato candidato2=new Candidato("Sergio","Massa",new HashSet<String>(), listaProvincias);
        Candidato candidato3=new Candidato("Patricia","Bulrrich",new HashSet<String>(), listaProvincias);
        Candidato candidato4=new Candidato("Nicolas","Del Caño",new HashSet<String>(), listaProvincias);
        Partido partido1=new Partido(PartidosPoliticos.EL_POLI_AVANZA,candidato1);
        Partido partido2=new Partido(PartidosPoliticos.FRENTE_DE_CONSTITUYENTES, candidato2);
        Partido partido3=new Partido(PartidosPoliticos.JUNTOS_POR_EL_POLI,candidato3);
        Partido partido4=new Partido(PartidosPoliticos.UNION_POR_LA_DOCENCIA,candidato4);
        HashSet<Partido>listaPartidos=new HashSet<Partido>();
        listaPartidos.add(partido1);
        listaPartidos.add(partido2);
        listaPartidos.add(partido3);
        listaPartidos.add(partido4);
        Sistema sistema=new Sistema(listaPartidos,listaVotantes);
        System.out.println(sistema.cantidadNoVotantes());
       // System.out.println(sistema.emitirVoto(partido2,votante1));
        votante1.votar(partido3);
        sistema.votosXcandidato();
        System.out.println(sistema.cantidadNoVotantes());
    }











}

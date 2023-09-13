package ControlBebidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Bebida>listaBebidas;
    private HashMap<Integer, Usuario>listaUsuarios;

    public Sistema(HashSet<Bebida> listaBebidas, HashMap<Integer, Usuario> listaUsuarios) {
        this.listaBebidas = listaBebidas;
        this.listaUsuarios = listaUsuarios;
    }

    public int calcularCoeficienteHidratacion(Usuario u1){
        int coeficienteTotal=0;
        for (Map.Entry<Bebida,Integer> bebida:u1.getListaBebidas().entrySet()){
            coeficienteTotal=coeficienteTotal+(bebida.getValue()*(bebida.getKey().getPositividad()-bebida.getKey().getNegatividad()));
        }
        return coeficienteTotal;
    }

    public void coeficienteXpersona(){
        boolean vuelta=false;
        int coefMayor=0;
        int coefMenor=0;
        System.out.println(coefMenor);
        for (Map.Entry<Integer,Usuario>usuario:listaUsuarios.entrySet()){
            int coefAux= calcularCoeficienteHidratacion(usuario.getValue());
            if (!vuelta){
                coefMayor= coefAux;
                coefMenor= coefAux;
                vuelta=true;
            }
            if (coefMayor<coefAux){
                coefMayor=coefAux;
            }
            if (coefMenor>coefAux){
                coefMenor=coefAux;
            }

        }
    }

    public static void main(String[] args) {
        Sistema sistema=new Sistema(new HashSet<>(),new HashMap<>());
        sistema.coeficienteXpersona();
    }
}

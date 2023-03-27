import java.util.ArrayList;

public class Ej1_U2 {

    public static void main(String[] args) {
        ArrayList<Integer>nums_enteros = new ArrayList<Integer>();
        nums_enteros.add(5);
        nums_enteros.add(10);
        nums_enteros.add(15);
        int suma=0;
        for(Integer nums:nums_enteros){
            suma=suma+nums;
        }
        System.out.println(suma);
    }
}

package Unidad0;

public class DivisibleFor_DivisibleWhile {
    public static void main(String[] args) {
        for (int num=1;num<=100;num++){
            if(num % 2 == 0){
                System.out.println(num);
            }
            else if(num % 3 ==0){
                System.out.println(num);
            }
        }
    }
}

package tiempos;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia=1;
        this.mes=1;
        this.anio=1900;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }
    public int diasMes(int mes){
        mes=getMes();
        int dia;
        if (mes == 1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
            dia = 31;
        }
           else if (mes==4||mes==6||mes==9||mes==11) {
            dia = 30;
        }
           else{
               dia=27;
           }
        return dia;
    }

    public void corta(){
        int dia, mes, anio;
        dia=this.dia;
        mes=this.mes;
        anio=this.anio;
        System.out.println(dia+"-"+mes+"-"+anio);
        }
    public  void larga(){
        int dia, mes, anio;
        dia=this.dia;
        mes=this.mes;
        anio=this.anio;
        switch (mes){
            case 1:
                System.out.println(dia + " de enero del " + anio);
                break;
            case 2:
                System.out.println(dia + " de febrero del " + anio);
                break;
            case 3:
                System.out.println(dia + " de marzo del " + anio);
                break;
            case 4:
                System.out.println(dia + " de abril del " + anio);
                break;
            case 5:
                System.out.println(dia + " de mayo del " + anio);
                break;
            case 6:
                System.out.println(dia + " de junio del " + anio);
                break;
            case 7:
                System.out.println(dia + " de julio del " + anio);
                break;
            case 8:
                System.out.println(dia + " de agosto del " + anio);
                break;
            case 9:
                System.out.println(dia + " de septiembre del " + anio);
                break;
            case 10:
                System.out.println(dia + " de octubre del " + anio);
                break;
            case 11:
                System.out.println(dia + " de noviembre del " + anio);
                break;
            case 12:
                System.out.println(dia + " de diciembre del " + anio);
                break;
        }
    }
    public Fecha siguiente(Fecha fecha01) {
        int anio = getAnio();
        int mes = getMes();
        int dia = getDia();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 31) {
                fecha01.setDia(dia + 1);
            } else {
                fecha01.setDia(1);
                fecha01.setMes(mes + 1);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 30) {
                fecha01.setDia(dia + 1);
            } else {
                fecha01.setDia(1);
                fecha01.setMes(mes + 1);
            }
        } else {
            if (dia<27) {
                fecha01.setDia(dia + 1);
            }
                else{
                    fecha01.setDia(1);
                    fecha01.setMes(mes + 1);
                }
            }
        return fecha01;
        }
        public void setAnio(int anio) {
        this.anio = anio;
    }
    public Fecha anterior(Fecha fecha01) {
        int anio = getAnio();
        int mes = getMes();
        int dia = getDia();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 1) {
                fecha01.setDia(dia - 1);
            } else {
                fecha01.setDia(1);
                fecha01.setMes(mes + 1);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 30) {
                fecha01.setDia(dia + 1);
            } else {
                fecha01.setDia(1);
                fecha01.setMes(mes + 1);
            }
        } else {
            if (dia<27) {
                fecha01.setDia(dia + 1);
            }
            else{
                fecha01.setDia(1);
                fecha01.setMes(mes + 1);
            }
        }
        return fecha01;
    }
    public Fecha(int dia, int mes, int anio){
        boolean condicion = valida(dia, mes, anio);
        if(condicion) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;


        }
    }

    public boolean valida(int dia, int mes, int anio){
        boolean condicion=true;
        if (dia<1 || dia>31){
            setDia(1);
        }
        if (mes<1 || mes >12){
            setMes(1);
        }
        if (anio<0){
            setAnio(1900);
        }
        return condicion;
    }



    public static void main(String[] args) {
        Fecha fecha1=new Fecha();

    }
}

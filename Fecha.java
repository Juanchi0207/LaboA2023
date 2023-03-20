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

    public void corta(Fecha fecha1){
        int dia, mes, anio;
        dia= fecha1.getDia();
        mes=fecha1.getMes();
        anio=fecha1.getAnio();
        switch (dia){
            case 1:

        }
    }

    public void setAnio(int anio) {
        this.anio = anio;
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

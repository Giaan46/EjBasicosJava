package TpReplit;

import java.util.Scanner;
import java.util.Calendar;// para almacenar la fecha actual y futura
import java.util.Date;//obtener la fecha y hora del sistema
import java.util.GregorianCalendar;//para calcular el anio si es bisiesto

// este es el que funciona ....

public class tp5Punto2Replit {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calendar act = Calendar.getInstance();// actual
        Calendar fut = Calendar.getInstance();// futura
        Date date = new Date();// permitir tomar la fecha y hora del sistema
        GregorianCalendar calendario = new GregorianCalendar();

        int a,m,d;

        System.out.println("Ingresa el anio de nacimiento: ");
        a = leer.nextInt();
        System.out.println("Ingresa el mes de nacimiento: ");
        m = leer.nextInt();
        System.out.println("Ingresa el dia de nacimiento: ");
        d = leer.nextInt();

        int anio = date.getYear() + 1901;
        int mes = date.getMonth() + 1;
        int dia = date.getDay() - 2;

        if(m >= mes && d >= dia){//si tu cumpleanios aun no llega
            fut.set(anio,m,d);
        }
        else{
            fut.set(anio + 1, m,d);
        }

        act.set(anio,mes,dia);
        long actual = act.getTimeInMillis();
        long futura = fut.getTimeInMillis();
        long diferencia = futura - actual;
        long diferenciaDias = diferencia/(24*60*60*1000);//conversion de millisegundos a dias




        if(calendario.isLeapYear(anio)){

           System.out.println("Tu cumpleanios es en : " + (diferenciaDias + 1 ) + " dias ");
        }if (diferenciaDias >= 365){
            System.out.println("Tu cumpleanios ya paso !");
        }else{
          System.out.println("Tu cumpleanios es en : " + (diferenciaDias) + " dias ");


        }





        }
  }



















package TpReplit;

import java.util.Scanner;

public class tp5Replit {
    public static void main(String[] args) {

        int dia = 0;
        int diasDelMes = 31;
        int DiasFaltantes;
        int anios = 0;
        int anioActual = 2022;
        int mesesFaltantes;
        int mes = 0;
        int mesesDelAnio = 12;
        int cualculaAnios;


        Scanner sc = new Scanner(System.in);
        {


            System.out.println("que dia nacio? ");
            dia = sc.nextInt();
            if (dia >= 32) {
                System.out.println("Numero no valido...");
            }
            {

                System.out.println("En que mes nacio? ");
                mes = sc.nextInt();
                if (mes >= 13)
                    System.out.println("El mes introducido no es valido ");
            }
            {
                System.out.println("En que anio nacio? ");
                anios = sc.nextInt();
                System.out.println("usted nacio el " + dia + "/" + mes + "/" + anios + " y tiene:  " + ( anioActual - anios ) + " anios " );
                System.out.println("Faltan :" +( diasDelMes - dia ) + " dias" + "\n y " + ( mesesDelAnio - mes) + "  meses " + "\n" + "para su cumpleanios ");

                }

            }
        }
    }



















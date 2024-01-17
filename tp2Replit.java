package TpReplit;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100;
        System.out.println(" Los numero primos del 2 al 100 son : " );
        while (true) {


            if (n > 0) {
                for (int i = 2; i <= n; i++) {

                    int creciente = 2;
                    boolean esPrimo = true;

                    while (esPrimo && creciente < i) {

                        if (i % creciente == 0) {
                            esPrimo = false;

                        } else {

                            creciente++;

                        }


                    }
                    if (esPrimo) {

                        System.out.println(i);


                    }
                }
                {
                    break;
                }


            }

        }
    }
}




























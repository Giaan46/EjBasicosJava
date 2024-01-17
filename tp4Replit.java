package TpReplit;

public class tp4Replit {
    public static void main(String[] args) {

        double metro = 0;
        double pulgada = 0;
        int contador = 0;

        for (pulgada = 1; pulgada <= 144; pulgada++) {
            metro = pulgada * 39.37;
            System.out.println(pulgada + " pulgadas es igual a :" + metro + " metros");
            contador++;
            if (contador == 12) {
                System.out.println("\n");
                contador = 0;
            }
        }
    }
}


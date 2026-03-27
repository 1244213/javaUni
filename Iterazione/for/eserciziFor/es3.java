/* Stampare tutti i numeri double compresi tra 100.0 e
100.0000000000001
– Suggerimento: il metodo Math.nextUp(x) ritorna il
double successivo ad x */

public class es3 {

    public static void main(String[] args) {

        for (double i = 100.0; i <= 100.0000000000001; i = Math.nextUp(i)) {
            System.out.println(i);
        }

    }
}
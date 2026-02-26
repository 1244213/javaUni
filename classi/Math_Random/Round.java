/* ARROTONDA UN VALORE DOUBLE ALL'INTERO PIU' VICINO */
public class Round {

    public static void main(String[] args) {

        System.out.println(Math.round(1.2)); 
        
        /*Math.round ritorna un long: 
        se vogliamo un int serve un cast*/
        int i = (int) Math.round(3.7);
        System.out.println(i);

        double x = 2.1;
        int j = (int) Math.round(x);
        System.out.println(j);

        /*------------------------*/

        double y = 123.456;
        System.out.println(Math.round(y * 100) / 100.0);
        // ARROTONDA y A DUE CIFRE DECIMALI (i*100)/100.0

    }
}
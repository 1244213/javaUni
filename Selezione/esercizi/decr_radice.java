/* Un programma che, dato un double x letto da tastiera,
decrementa x se x < 0, altrimenti assegna ad x la sua
radice quadrata. Ad es.
– Se x = -10, x diventa -11
– Se x = 16, x diventa 4 */

import java.util.Scanner;

public class decr_radice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci x: ");
        double x = scan.nextDouble();

        if (x < 0)
            System.out.println("x decrementato = " + (int)--x);
        else
            System.out.println("Radice 2 di x = " + (int)Math.sqrt(x));
    }

}
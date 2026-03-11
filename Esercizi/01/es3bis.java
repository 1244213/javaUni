/*Es. 3bis) Leggere 2 int da tastiera, x1 e x2.
Se 0 ≤ x1 < x2 ed entrambi sono dispari, stampare un
numero casuale pari nell'intervallo [x1..x2]. Altrimenti,
stampare un messaggio di errore.*/

import java.util.Scanner;

public class es3bis{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1, x2;

        System.out.print("Inserisci numero: ");
        x1 = scan.nextInt();

        System.out.print("Inserisci secondo numero: ");
        x2= scan.nextInt();

        System.out.println
        ( x1 >= 0 && x1 <= x2 && x1%2 != 0 && x2%2 != 0
        ? x1 + (int)(Math.random() *(x2-x1+1))
        : "Eroore" );
    }
}
/*Es. 3) Leggere 2 int da tastiera, x1 e x2. Se 0 ≤ x1 ≤ x2,
stampare un numero casuale intero in [x1..x2].
Altrimenti, stampare un messaggio di errore.
Es. x1 = 3, x2 = 7 → intero casuale tra 3 e 7
x1 = -1, x2 = 5 →errore
Suggerimento: usare Math.random()*/

import java.util.Scanner;

public class es3{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1, x2;

        System.out.print("Inserisci numero: ");
        x1 = scan.nextInt();

        System.out.print("Inserisci secondo numero: ");
        x2= scan.nextInt();

        System.out.println
        ( x1 >= 0 && x1 <= x2 
        ? x1 + (int)(Math.random() *(x2-x1+1)) 
        : "Eroore" );
    }
}
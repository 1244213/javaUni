/*Es. 2bis) Leggere un numero double ( con
nextDouble() ) in una variabile x. Se x < 0, allora
stamparne la parte intera (suggerimento: usare il cast);
altrimenti, stampare il triplo di x più 2.*/

import java.util.Scanner;

public class es2bis{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double x;

        System.out.print("Inserisci numero: ");
        x = scan.nextDouble();

        System.out.println( x < 0 ? (int)x : 3*x+2);
    }
}
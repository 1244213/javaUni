/* Un programma che, dato un int x letto da tastiera,
stampa se è pari o dispari */

import java.util.Scanner;

public class pari_dispari {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inerisci un numero : ");
        int x = scan.nextInt();

        if (x % 2 == 0)
            System.out.println("Numero pari");
        else
            System.out.println("Numero dispari");
    }
}
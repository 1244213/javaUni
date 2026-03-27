/* Stampare tutti i quadrati dei numeri dispari da 1 a n,
dove n è letto da tastiera */

import java.util.Scanner;

public class es1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i += 2) 
            System.out.println(Math.sqrt(i));
    
    System.out.println();
    }
}
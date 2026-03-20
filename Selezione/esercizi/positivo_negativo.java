/* Un programma che, dato un double x letto da tastiera,
stampa se è x positivo o negativo
– Se x = 0, non stampa nulla */

import java.util.Scanner;

public class positivo_negativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci x: ");
        double x = scan.nextDouble();

        if (x > 0)
            System.out.println("Numero positivo");
        else if (x < 0)
            System.out.println("Numero negativo");
        else
            System.out.println(" ");        
    }
}
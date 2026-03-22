/*Stampare una sequenza alternata di n bit 0, 1, 0, 1, 0, …
dove n è un intero letto da tastiera
– Se n < 0, stampare un messaggio di errore*/

import java.util.Scanner;

public class  es2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un intero: ");
        int i = scan.nextInt();

        while(i > 0){
            System.out.print(i % 2 + " ");
            i--;
        }
        
        if(i < 0)
            System.out.println("Error");
        else
            System.out.println();

    }
}
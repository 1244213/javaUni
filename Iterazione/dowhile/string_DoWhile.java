/*Es. leggere una stringa fino a che sia “yes” o “no”*/

import java.util.Scanner;

public class string_DoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String risp;

        do {
            System.out.print("Inserisci stringa: "); 
            risp = scan.nextLine();
        }
        while (!risp.equals("yes") && !risp.equals("no")); // SE NON è VERO CHE RISP = yes, no
    
    System.out.println();
    }
}
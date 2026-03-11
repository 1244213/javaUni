/*Es. 5bis) Come 5), ma togliere gli spazi in coda e alla
fine concatenare il carattere $
Es. “ Hello world “ → “ Hello world$”*/

import java.util.Scanner;

public class es5bis{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String stringa;

        System.out.print("Inserisci una stringa: ");
        stringa = scan.nextLine();

        System.out.print("\"");
        System.out.print(stringa);
        System.out.println("\"");

        System.out.print("\"");
        System.out.print(stringa.substring( 0 , stringa.indexOf(stringa.trim()) + stringa.trim().length()) + "$");
        System.out.println("\"");

    }
}
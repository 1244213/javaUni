/*Es. 5) Leggere una stringa da tastiera, eliminarne
solamente gli spazi in fronte (ma non quelli in coda) e
stamparla a video.
Es. “ Hello world “ → “Hello world ”
Suggerimento: combinare i metodi trim, indexOf e
substring della classe String*/

import java.util.Scanner;

public class es5{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String stringa;

        System.out.print("Inserisci una stringa: ");
        stringa = scan.nextLine();

        System.out.print("\"");
        System.out.print(stringa);
        System.out.println("\"");

        System.out.print("\"");
        System.out.print(stringa.substring(stringa.indexOf(stringa.trim())));
        System.out.println("\"");

    }
}
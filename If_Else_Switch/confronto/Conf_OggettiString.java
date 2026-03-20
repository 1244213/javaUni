import java.util.Scanner;

public class Conf_OggettiString {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        if (s1 == s2) // CONFRONTO RIFERIMENTO
            System.out.println("Uguali");
        else
            System.out.println("Riferimento diverso : s1 != s2");

        /*******************************************************/

        if (s1.equals(s2)) // CONFRONTO CONTENUTO
            System.out.println("Contenuto uguale : s1.equals(s2)");
        else
            System.out.println("Diverse");
    }
}
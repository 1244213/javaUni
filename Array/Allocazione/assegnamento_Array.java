// Assegnare 0, 1, 2, … agli elementi di a
import java.util.Scanner;
public class assegnamento_Array {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci dimensione array: ");
        int N = scan.nextInt();
        double[] a = new double[N];

        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print("inserisci numero: ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++)
            a[i] = i;

        System.out.println("ASSEGNAMENTO 0, 1, 2, ...");
        // Stampa tutti ivalori dell'array
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
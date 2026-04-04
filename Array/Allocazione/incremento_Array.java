// Incrementare di 1 ogni elemento dell’array a
import java.util.Scanner;
public class incremento_Array {

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
            a[i]++;

        System.out.println("INCREMENTO ARRAY +1");
        // Stampa tutti ivalori dell'array
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
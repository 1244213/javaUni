// Azzerare un array di int di nome a
import java.util.Scanner;
public class azzera_Array {

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
            a[i] = 0;

        System.out.println("ARRAY AZZERATO:");
        // Stampa tutti ivalori dell'array
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
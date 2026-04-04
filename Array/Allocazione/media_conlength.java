// Calcolare la media delle temperature lette da tastiera:
import java.util.Scanner;
public class media_conlength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci dimensione array: ");
        int N = scan.nextInt();
        double[] temperature = new double[N];

        double media = 0;
        int n = temperature.length;

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci temperatura: ");
            temperature[i] = scan.nextInt();
        }
        
        for (int i = 0; i < n; i++)
            media += temperature[i];
        
        media = media / n;
        System.out.println("Media: " + media);
    }
}
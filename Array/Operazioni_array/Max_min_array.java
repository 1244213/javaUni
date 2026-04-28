import java.util.Scanner;

public class Max_min_array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dimensione array: ");
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Inserisci num: ");
            a[i] = scan.nextInt();
        }

        int Max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > Max)
                Max = a[i];
        }

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        /*
        // Oppure tenere traccia dell’indice in v dell’elemento massimo, 
        // invece che dell’elemento stesso.
        int iMax = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[iMax])
                iMax = i; // Aggiorna indice del Max
        }
        */

        System.out.println("Valore massimo: " + Max);
        System.out.println("Valore minimo " + min);

        scan.close();
    }
}
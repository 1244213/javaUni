/* Leggere 2 interi N ed M da tastiera fino a che siano
entrambi maggiori di 1, poi generare e stampare una
matrice NxM con numeri casuali interi in [4..8] */

import java.util.Scanner;
import java.util.Random;

public class Matrice_random {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, M;

        do {
            System.out.print("Inseriscci un numero maggiore di 1 (righe): ");
            N = scan.nextInt();
        } while  (N <= 1);

        do {
            System.out.print("Inseriscci un numero maggiore di 1 (colonne): ");
            M = scan.nextInt();
        } while (M <= 1);

        int [][] a = new int[N][M];

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                Random rnd = new Random();
                a[i][j] = 4 + rnd.nextInt(5);
                System.out.print(a[i][j] + " ");
           }
           System.out.println();
        }

System.out.println("---AZZERA RIGA---");

        System.out.print("Secgli riga: ");
        int k = scan.nextInt();
        for (int i = 0; i < a[k-1].length; i++) { // AZZERA RIGA//
            a[k-1][i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

System.out.println("---AZZERA COLONNA---");

        System.out.print("Scegli colonna: ");
        int K = scan.nextInt();
        for (int i = 0; i < a.length; i++) { // AZZERA COLONNA
            a[i][K-1] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}

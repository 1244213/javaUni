/* Scrivere un metodo che prende in input due parametri
interi b e h e restituisce l’area (di tipo double) del
triangolo di base b e altezza h */

import java.util.Scanner;

public class Area_triangolo {

    static double triangolo (int b, int h) {
        return ( b * h ) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("base: ");
        int base = scan.nextInt();
        System.out.print("altezza: ");
        int altezza = scan.nextInt();

        double A = triangolo ( base, altezza );

        System.out.println("Area = " + A);

        scan.close();
    }

}
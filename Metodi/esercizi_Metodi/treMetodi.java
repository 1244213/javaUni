/*
Scrivere un programma (cioè, una classe…) che
contiene 3 metodi:
1) doppio: prende in input un intero x e restituisce il
doppio di x
2) distanza: prende in input due interi x e y e
restituisce il valore assoluto di x meno y
3) media: prende in input quattro interi e restituisce la
media, di tipo double
• Invocare questi metodi dal main per testarne il
funzionamento
*/

import java.util.Scanner;

public class treMetodi {

    static int doppio (int x) {
        return x * 2;
    }

    static int distanza (int x, int y) {
        return Math.abs(x - y);
    }

    static double media (int[] A) {
        double somma = 0;
        for (int i = 0; i < A.length; i++) {
            somma = somma + A[i];
        }
        return  somma / A.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringa;

        System.out.print("Chose metod (doppio, distanza, media): ");
        stringa = scan.nextLine();

        if (stringa.equalsIgnoreCase("doppio")) {
            System.out.print("Calcola il doppio di un numero: ");
            int X = scan.nextInt();
            int dpp = doppio(X);
            System.out.println("Doppio = " + dpp);
        }

        else if (stringa.equalsIgnoreCase("distanza")) {
            System.out.println("Distanza tra due numeri: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int dstnz = distanza(num1, num2);
            System.out.println("Distanza = " + dstnz);
        }

        else if (stringa.equalsIgnoreCase("media")) {
            int[] a = new int[4];
            System.out.println("Calcola media di 4 numeri: ");
            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();
            }

            double M = media(a);
            System.out.println("Media = " + M);
        }

        else
            System.out.println("Error");
    
        scan.close();
    }
}
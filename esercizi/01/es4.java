/*Es. 4) Leggere un double x e un byte b, arrotondare x a
b cifre decimali e stampare a video il risultato
Es. x = 162.33547, b = 2 → 162.34
Suggerimento: usare Math.round e Math.pow*/

import java.util.Scanner;

public class es4{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x ;
        byte b;

        System.out.print("Inserisci un numero: ");
        x = scan.nextDouble();

        System.out.print("Inserisci di quante cifre arrotondare: ");
        b = scan.nextByte();

        System.out.println(Math.round(x * Math.pow(10,b)) / Math.pow(10,b));
    }
}
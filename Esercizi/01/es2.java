/*Esercizio 2
Es. 2) Leggere da tastiera due numeri float ( con
nextFloat() ) x e y e stampare 1 se x è uguale al doppio
di y oppure x ≤ 0; altrimenti, stampare 0.
Suggerimento: usare l’operatore condizionale
<expr> ? <val1> : <val2>*/

import java.util.Scanner;

public class es2{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float x, y;

        System.out.print("Inserisci numeero: ");
        x = scan.nextFloat();

        System.out.print("Inserisci secondo numero: ");
        y = scan.nextFloat();

        System.out.println( x == 2*y || x <= 0 ? 1 : 0);

    }
}
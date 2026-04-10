/* 
Chiedere un intero n da tastiera, fino a che 5 ≤ n ≤ 10
• Definire un array di n elementi di tipo boolean
• Assegnare agli elementi di indice pari il valore true, e
agli elementi di indice dispari il valore false
• Stampare l’array tra parentesi quadre, con gli elementi
separati da virgola + spazio
– Es. se n = 7, stampare:
[true, false, true, false, true, false, true] 
*/
import java.util.Scanner;

public class Esercizio_pari_dispari {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n; 

        do {
            System.out.print("Inseriscci un numero 5 <= n >= 10: ");
            n = scan.nextInt();
        } while(n < 5 || n > 10);

        boolean[] a = new boolean[n];

        for (int i = 0; i < a.length; i++)
            a[i] = (i % 2 == 0); 
        //L'espressione i % 2 == 0 restituisce direttamente true o false, 
        // quindi puoi assegnarla direttamente senza bisogno dell'if/else!

        System.out.print("[");
        for (int i = 0; i < a.length; i++){
            if (i < a.length-1)
                System.out.print(a[i] + ", ");
            else
                System.out.println(a[i] + "]");
        }
    }

}
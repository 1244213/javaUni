public class Ricerca_Linerare_array {

    public static void main(String[] args) {
        
        int[] a = {10,20,30,40,50};
        int x = 41;
        boolean trovato = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                trovato = true;
            break;
            }
        }

        if (trovato)
            System.out.println("Trovato!");
        else
            System.out.println("Non trovato!");

        /* Questo funziona, ma se x viene trovato una volta usciti
        dal ciclo non sappiamo in quale posizione in a è stato
        effettivamente trovato… */

System.out.println("------------");
        int i;
        for (i = 0; i < a.length && a[i] != x; i++) {
            if (a[i] == x)
                break;
        }
        System.out.println("indice: " + (i < a.length ? i : -1));
    }
    // ATTENZIONE: invertire le condizioni causa ArrayIndexOutOfBoundsException
    // se x non è presente nell'array, perché a[i] viene valutato PRIMA del controllo
    // i < a.length, accedendo a un indice inesistente (es. Index 5 out of bounds for length 5).
    // Ordine CORRETTO: i < a.length && a[i] != x
}


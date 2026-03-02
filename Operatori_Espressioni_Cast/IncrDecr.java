public class IncrDecr {

    public static void main(String[] args) {

        int i = 3, j = 4;

        i++; //prima ritorna il risultato, poi incrementa la variabile
        System.out.println(i); //stampa 4

        j--; //prima ritorna il risultato, poi decrementa la variabile
        System.out.println(j); //stampa 3

        ++i; //prima incrementa il valore della variabile, poi ritorna il risultato
        System.out.println(i); //stampa 5
        
        System.out.println(j++); //stampa 3

        System.out.println(j); //stampa 4

        System.out.println(++j); //stampa 5
        
    }
    
}
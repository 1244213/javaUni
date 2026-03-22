/*Stampare tutti i numeri tra 1 e 100, che siano multipli di 2
e multipli di 3 → quindi sono multipli di 6*/

public class es4bis {

    public static void main(String[] args) {

        int i = 6;

        while (i <= 100) {
            if (i % 6 == 0)
                System.out.print(i + " ");
            i += 6;
        }// il ciclo si ripete per 16 volte [più veloce]
    
    System.out.println();
    }
}
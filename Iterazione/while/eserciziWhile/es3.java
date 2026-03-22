/*Stampare tutti i numeri tra 1 e 100, che siano multipli di 2
o multipli di 3*/

public class es3 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0 || i % 3 == 0)
                System.out.print(i + " ");
            i++;
        }
    
    System.out.println();
    }
}
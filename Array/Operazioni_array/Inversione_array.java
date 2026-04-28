public class Inversione_array {

    public static void main(String[] args) {
        
        int[] a = {10,20,30,40,50};
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "\t");

        System.out.println();

        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "\t");

        System.out.println();
    }
}

/* Esercizio: controllate se una certa stringa è palindroma */
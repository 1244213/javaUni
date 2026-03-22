public class if_while {

    public static void main(String[] args) {

        int i = 1;
        
        System.out.println("Ciclo con if");
        while (i <= 10) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i = i + 1;
        }

        int j = 2;

        System.out.println("\n" + "Ciclo senza if");
        while (j <= 10) {
            System.out.print(j + " ");
            j = j + 2;
        }

        System.out.println();

    }

}
import java.util.Scanner;

public class es_if_else{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inerisci x: ");
        int x = scan.nextInt();
        System.out.print("Inserisci y: ");
        int y = scan.nextInt();

        if (x < y) { 
            int z = x;

            x = y;
            y = z;
        }
        if (x < y)
            System.out.println("x minore di y");
        else
            System.out.println("x maggiore di y");
    }
}

//Stamperà sempre " x maggiore di y "
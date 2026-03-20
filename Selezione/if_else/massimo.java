import java.util.Scanner;

public class massimo{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.print("Inserisci a: ");
        a = scan.nextInt();
        System.out.print("Inserisci b: ");
        b = scan.nextInt();

        if (a > b){
            System.out.println("Il max e' a " + a);
        }
        else{
            if (b > a) {
                System.out.println("Il max e' b " + b);
            }
            else {
                System.out.println("Numeri uguali");
            }
        }

    }
}
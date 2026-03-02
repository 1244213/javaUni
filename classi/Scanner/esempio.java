import java.util.Scanner;

public class esempio{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double base, altezza, area;

        System.out.print("Inserisci la base: ");

        base = scan.nextDouble();

        altezza = 12.0;

        area = base * altezza / 2;

        System.out.println("Area = " + area);

    }
}
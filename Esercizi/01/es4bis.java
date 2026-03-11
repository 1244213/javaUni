/*Es. 4bis) Leggere un double x e un Boolean b, se b vale
true, stampare la parte intera inferiore di x altrimenti la
parte intera superiore*/

import java.util.Scanner;

public class es4bis{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x;
        boolean b;

        System.out.print("Inserire un double: ");
        x = scan.nextDouble();

        System.out.print("Whrite true or false: " );
        b = scan.nextBoolean();

        System.out.println( b == true ? (int)x : (int)x + 1);

        

    }

}
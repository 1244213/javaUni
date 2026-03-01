import java.util.Random;

public class Util_Random {

    public static void main(String[] args) {

        Random rnd = new Random();
        
        System.out.println(rnd.nextDouble());

        System.out.println(rnd.nextInt(10));

        System.out.println(2 + rnd.nextInt(5));

    }
}
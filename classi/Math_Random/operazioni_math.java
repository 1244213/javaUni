public class operazioni_math{

    public static void main(String[] args) {

        int x = -16, y = 2;

        // RADICE QUADRATA
        System.out.println(Math.sqrt(x));

        // CALCOLA x ELEVATO A y
        System.out.println(Math.pow(x,y));

        // SENO DI x IN RADIANTI
        System.out.println(Math.sin(x));

        // COSENO DI x IN RADIANTI
        System.out.println(Math.cos(x));

        // TANGENTE DI x RADIANTI
        System.out.println(Math.tan(x));

        // FUNZIONE ESPONENZIALE e^x
        System.out.println(Math.exp(x));

        // LOGARITMO NATURALE
        System.out.println(Math.log(x));

        // VALORE ASSOLUTO
        System.out.println(Math.abs(x));

        //  VALORE SUCCESSIVO
        System.out.println((int)Math.nextUp(x));

    }
}

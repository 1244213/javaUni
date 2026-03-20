public class Conf_Stringhe {

    public static void main(String[] args) {

        String s = "car";
        String t = "cathode";

        int x = s.compareTo(t);

        if(x < 0) 
            System.out.println(s + " precede " + t);
        else if (x > 0) 
            System.out.println(t + " precede " + s);
        else 
            System.out.println("Le stringhe sono uguali");

        /************************************************/

        String a = "10";
        String b = "9";

        int y = a.compareTo(b);

        if (y < 0)
            System.out.println(a + " precede " + b);
        else if (y > 0) 
            System.out.println(b + " precede " + a);
        else
            System.out.println("Le stringhe sono uguali");
    }
}

//|s.compareTo(t)| < 0 significa che s precede t in 
// ordine lessicografico (codice ASCII), 
// confronta carattere per carattere
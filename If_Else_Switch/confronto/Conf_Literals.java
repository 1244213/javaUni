public class Conf_Literals {

    public static void main(String[] args) {

        String a = "ciao", b = "ciao";

        System.out.println("CONFRONTO INDIRIZZO");
        System.out.println(a == b);
        b = new String("ciao");
        System.out.println(a == b);

        b = "ciao";
        System.out.println(a == b);

        b += "";
        System.out.println(a == b);
        
        System.out.println("CONFRONTO CONTENUTO");
        System.out.println(a.equals(b));

        b = new String("ciao");
        System.out.println(a.equals(b));

        b = "ciao";
        System.out.println(a.equals(b));

        b += "";
        System.out.println(a.equals(b));

    }
}
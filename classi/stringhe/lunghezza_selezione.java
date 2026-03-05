public class lunghezza_selezione{

    public static void main(String[] args){

        //Lunghezza:
        String name = "Harry";

        int len = name.length();
        //ritorna la lunghezza di una stringa 

        System.out.println(name + " ha " + len + " carateri ");

        //Selezione:
        String s = "Hello";

        char c = s.charAt(1);
        //ritorna il carattere in posizione i

        System.out.println("la posizione 1 di " + s + " = " + c );
    }
}
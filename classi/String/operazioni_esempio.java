public class operazioni_esempio{

    public static void main(String[] args){

        int d = 531452;
        String sd = "" + d;
        System.out.println(sd);

        int len = sd.length(); // len = 7

        sd = "$" + sd.substring(0, len-3) + "," + sd.substring(len-3);
        System.out.println(sd);

        sd += "\t\tdollars\n\n\n"; /* \t\t varra per tutte le righe */
        System.out.println(sd);

        sd = sd.trim();
        System.out.println(sd.toUpperCase());
    }
}
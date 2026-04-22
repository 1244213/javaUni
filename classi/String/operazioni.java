public class operazioni{

    public static void main(String[] args){
        
        String parola = "together";

        System.out.println(parola.substring(2));
        // Ritorna la sottostringa dall’indice i fino a fine stringa

        System.out.println(parola.substring(1,7));
        // Ritorna la sottostringa tra gli indici i e j-1

        String testo = " \t\nTogether\n\n";
        /* System.out.println(testo); */
        System.out.println(testo.trim());
        // Rimuove i whitespaces a inizio e fine stringa

        System.out.println(parola.toLowerCase());
        // Converte tutti i caratteri in minuscolo

        System.out.println(parola.toUpperCase());
        // Converte tutti i caratteri in maiuscolo

System.out.println("------------------");

        String a = "ora é";
        String b = "momento";
        String c = " il";

        System.out.println(a.length());
        System.out.println(a.charAt(4));
        System.out.println(a.substring(0,3));
        System.out.println(a.length());
        System.out.println(b.startsWith("mom"));
        System.out.println(b.indexOf("mento"));
        System.out.println(a.concat(c));
        System.out.println(b.toUpperCase());

        String[] risultato = a.split(" ");
        System.out.println(risultato[0]);
        System.out.println(risultato[1]);

        System.out.println(a.compareTo(b));

    }

}
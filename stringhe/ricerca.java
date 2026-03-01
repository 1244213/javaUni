public class ricerca{

    public static void main(String[] args){

        String target = "This is the target string";

        System.out.println(target.indexOf('u'));
        // Il carattere ‘u’ non occorre in target

        System.out.println(target.indexOf("the"));
        // Il primo pattern ”the” comincia all’indice 8

        System.out.println(target.indexOf("target", 13));
        // Ritorna -1, eppure la sottostringa ”target” 
    }   
}
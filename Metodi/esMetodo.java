// Esempio: metodo che ritorna la tangente dato l’angolo a

public class esMetodo {

    static double tangente (double a) {     //<TipoRitorno> nomeMetodo(parametriFormali)
        return Math.sin(a) / Math.cos(a);   //<IstruzioniMetodo>; [return <ValoreDiRitorno>]
    }

    public static void main(String[] args) {
        double x = 3.14, y = tangente(x);
        System.out.println(y);
    }
}

/* 
•tangente riceve un parametro a di tipo double
• Richiama su a i metodi sin e cos della classe Math
• Esegue la divisione e ritorna il risultato di tipo double
• Per ora ignoriamo la keyword static, la usiamo e basta

• a = parametro formale: usato solo nella definizione
• x = parametro attuale: usato ad ogni invocazione per
passare al metodo i dati di input

• Il valore del parametro attuale x viene copiato nel
parametro formale a
• Il corpo di tangente viene eseguito su totale valore

• Il corpo del metodo viene eseguito e con return viene
ritornato al metodo chiamante il valore di ritorno
– In questo caso -0.0015926549364072232
*/
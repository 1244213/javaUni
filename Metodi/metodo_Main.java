public class metodo_Main {

    public static // <ModificatorediAccesso> <AltriModificatori>
    void main(String[] args) { // <TipoRitorno> NomeMetodo(parametriFormali)

        System.out.println("Numero argomenti " + args.length);
        for (String a : args) // Per ogni stringa a contenuta in args, stampa a [versione for-each (o enhanced for)]
            System.out.println(a); // !! Per trasformarle in interi, si può usare Integer.parseInt
    }
}
/*
Il main è un metodo che non ritorna un valore
– O meglio, ritorna un valore di tipo void
– Altri esempi: println(), set(i,x), clear(), …
• I metodi void hanno tipicamente effetti collaterali (side-
effects), ad es. modificano oggetti, file, database…
• Per un metodo void la keyword return è opzionale:
– Se c’è, si usa solo return; (non return void;)
– Se non c’è, ritorna dopo aver eseguito il corpo
*/
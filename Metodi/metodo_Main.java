public class metodo_Main {

    public static // <ModificatorediAccesso> <AltriModificatori>
    void main(String[] args) { // <TipoRitorno> NomeMetodo(parametriFormali)

        System.out.println("Numero argomenti " + args.length);
        for (String a : args) // Per ogni stringa a contenuta in args, stampa a [versione for-each (o enhanced for)]
            System.out.println(a); // !! Per trasformarle in interi, si può usare Integer.parseInt
    }
}
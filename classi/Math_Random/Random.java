/*Restituisce un numero double (pseudo-)casuale
  nell'intervallo [0.0, 1.0)*/
public class Random {

    public static void main(String[] args){

    System.out.println(Math.random()); 
    // eseguendo piu volte, senza ricompilare

    System.out.println( (int)(Math.random() * 10) );
    // genera un intero casuale tra 0 e 9

    System.out.println( 2 + (int)(Math.random() * 5));
    // genera un intero casuale tra 2 e 6 [a, a+b-1] 

    }
}
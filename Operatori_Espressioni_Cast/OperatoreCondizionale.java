// Operatore ternario infisso: 
// <espr1> ? <val1> : <val2>

public class OperatoreCondizionale {

    public static void main (String[] args) {

        int x = 10, y = 20;

        System.out.println( x < 0 ? -(x) : x );

        System.out.println( x < y ? x : y );

    }

}
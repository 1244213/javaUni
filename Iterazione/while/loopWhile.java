public class loopWhile {

    public static void main(String[] args) {

        byte i = 1;

        while (i <= 10) {
            System.out.println(i);
            i--;
        }
    }
}
/*Il byte in Java è un contenitore a 8 bit con segno: 
il valore minimo rappresentabile è -128. Quando il 
decremento i-- prova a scendere sotto questo limite, 
avviene un underflow e il valore 'salta' istantaneamente 
al massimo positivo (+127), ricominciando il giro.*/
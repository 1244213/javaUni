public class concatenazione{

    public static void main(String[] args) {

        String somma =
        "The sum of " + /*x*/3 + " and " + /*y*/4 + " is " + /*x*/3 + /*y*/4;

        System.out.println(somma);
    }
}
/* Se x è il numero 3 e y è il numero 4, la stringa diventa:
"The sum of 3 and 4 is 34"
perchè almeno un operando della concatenazione è
una stringa: il numero 3 viene convertito implicitamente
nella stringa “3” e il numero 4 nella stringa “4” quindi
x + y è la concatenazione di “3” e “4”, cioè “34” */
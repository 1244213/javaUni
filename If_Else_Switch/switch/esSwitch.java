import java.util.Scanner;

public class esSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int digit;
        System.out.print("inserisci numero da 1 a 9: ");
        digit = scan.nextInt();

        String englishDigit;

        switch (digit) {
            case 1: englishDigit = "One"; break;
            case 2: englishDigit = "Two"; break;
            case 3: englishDigit = "Three"; break;
            case 4: englishDigit = "Four"; break;
            case 5: englishDigit = "Five"; break;
            case 6: englishDigit = "Six"; break;
            case 7: englishDigit = "Seven"; break;
            case 8: englishDigit = "Eight"; break;
            case 9: englishDigit = "Nine"; break;
            default: englishDigit = "Errore"; break;

        }
        
        System.out.println(englishDigit);

    }
}
// IL BREAK PERMETTE DI "ROMPERE" IL FLUSSO DI
// ESECUZIONE ED "USCIRE" DALLO SWITCH
public class Stampa2{
	public static void main(String[] args){
		
    int n = 123, remainder, hundreds, tens, units;
    
    hundreds = n / 100;
    System.out.println(hundreds);
    
    remainder = n % 100;
    System.out.println(remainder);
    
    tens = remainder / 10;
    System.out.println(tens);
    
    units = remainder % 10;
    System.out.println(units);
    
    }
}
public class Stampa1{
	public static void main(String[] args){
		
	int totalCents, cents, dollars;
	
	totalCents = 3567;
	System.out.println(totalCents);
	
	dollars = totalCents / 100;
	System.out.println(dollars);
	
	cents = totalCents % 100;
	System.out.println(cents);

	}
}
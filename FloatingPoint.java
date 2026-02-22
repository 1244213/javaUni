public class FloatingPoint {
	public static void main(String[] args)
	{
		double d = 1.11111111111111;
		float f;
		//f = d; possible lossy conversion from double to float
		
		f = (float) d;
		System.out.println(f); 
		/*il valore cambia perché float non può rappresentare tutte le cifre
		  arrotonda al numero più vicino rappresentabile*/
		
		d = 1e-66;
		System.out.println(d);
		/*double riesce ancora a rappresentarlo (num molto vicino a zero)*/
		
		f = (float) d;
		System.out.println(f);
		/*valore troppo piccolo per un float, viene approssimato a 0.0*/
		
		d = 1e66;
		System.out.println(d);
		/*double riesce a rappresentare num molto grandi*/
		
		f = (float) d;
		System.out.println(f);
		/*"OVERFLOW" valore troppo grande per float*/
	}
	
}
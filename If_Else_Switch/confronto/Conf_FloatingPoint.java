public class Conf_FloatingPoint {

	public static void main(String[] args) {
	    
		double r = Math.sqrt(2), d = r * r - 2;
        final double EPSILON = 1E-14;

		    /*if (d == 0)*/
            //Confrontare numeri floating point può dare risultati
            //inattesi dovuti all’approssimazione

            if (Math.abs(d) <= EPSILON) //
		        System.out.println("sqrt(2)^2 -2 = 0");
		    else
		        System.out.println("sqrt(q)^2 - 2 != 0");
	}
}

// Si usa EPSILON perché i floating point sono approssimati: 
// controlliamo se i numeri sono "quasi uguali".

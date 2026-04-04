public class esArray {

    public static void main(String[] args) {

        double[] temperature; // Dichiarazione: tipo[] nomeArray
        temperature = new double[7]; // Allocazione: nomeArray = new tipo[lunghezza]
        temperature[0] = 20.5;
        temperature[1] = 20.0;
        temperature[2] = 19.8;
        temperature[3] = 19.4;
        temperature[4] = 20.4;
        temperature[5] = 21.6;
        temperature[6] = 22.0;

        System.out.println(temperature[1]);
        System.out.println("temperature[5]= " + temperature[5]);

        System.out.println("----");

        // Accesso: nomeArray[indice]
        temperature[5] = temperature[4];
        System.out.println("[5] = [4]= " + temperature[5]);

        temperature[5]++;
        System.out.println("[5]++= " + temperature[5]);

        temperature[5+1] = temperature[5];
        System.out.println("[5+1] = [5]= " + temperature[5]);

    }
}
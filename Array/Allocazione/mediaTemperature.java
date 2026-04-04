public class mediaTemperature {

    public static void main(String[] args) {

        double[] temperature; 
        temperature = new double[7]; 
        temperature[0] = 20.5;
        temperature[1] = 20.0;
        temperature[2] = 19.8;
        temperature[3] = 19.4;
        temperature[4] = 20.4;
        temperature[5] = 21.6;
        temperature[6] = 22.0;

        double media = 0;

        for (int i = 0; i < 7; i++)
            media = media +temperature[i];

        media = media / 7;

        System.out.println("Media = " + media);
        

    }
}
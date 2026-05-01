/*
Scrivere e testare un metodo per stampare una matrice
*/

public class Stampa_matrice {

    static void stampaMatrice (int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrice = {{0,1,2},{3,4,5},{6,7,8},{9,10,100}};
        stampaMatrice(matrice);
    }
}
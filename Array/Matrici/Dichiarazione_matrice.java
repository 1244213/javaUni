public class Dichiarazione_matrice {
    public static void main(String[] args) {
        
        int [][] a = new int[2][3]; // Due righe, tre colonne 

        for (int i = 0; i < a.length; i++) { // cicla attraverso le righe
            for(int j = 0; j < a[i].length; j++) { // cicla attraverso le colonne
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

System.out.println("-----");

        int [][] tab = {{1,0,4},{0,1,3},{2,1,5}}; // 3 righe, 3 colonne

        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("terzo elemento seconda riga: " + tab[1][2]);
    }
}

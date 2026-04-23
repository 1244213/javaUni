public class Matrice0 {

    public static void main(String[] args) {

        int[][] a = {{1,0,4,2},{0,3},{2,1,5}};

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Riga: " + i);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\tColonna: " + j);
                System.out.println(": " + a[i][j]);
            }
        }

        
    }
}
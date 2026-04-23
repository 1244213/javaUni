public class Azzera_diagonale {

    public static void main(String[] args) {
        
        int[][] a = {{1,6,4,3},{7,3,1,2},{2,1,5,1},{1,2,3,4}};

        for (int i = 0; i < a.length; i++) // AZZERA DIAGONALE PRINCIPALE
            a[i][i] = 0;

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

System.out.println("----------");

        int[][] b = {{1,6,4,3},{7,3,1,2},{2,1,5,1},{1,2,3,4}};

        for (int i = 0; i < b.length; i++) // AZZERA DIAGONALE  SECONDARIA
            b[i][b.length - 1 - i] = 0;

        for (int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
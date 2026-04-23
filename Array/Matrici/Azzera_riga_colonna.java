import java.util.Scanner;

public class Azzera_riga_colonna {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] a = {{1,0,4,2},{0,3,1,6},{2,1,5,0}};

        System.out.print("Secgli riga: ");
        int row = scan.nextInt();
        for (int i = 0; i < a[row-1].length; i++) { // AZZERA RIGA//
            a[row-1][i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

System.out.println("----------");

        int[][] b = {{1,0,4,2},{0,3,1,6},{2,1,5,0}};

        System.out.print("Scegli colonna: ");
        int col = scan.nextInt();
        for (int i = 0; i < b.length; i++) { // AZZERA COLONNA
            b[i][col-1] = 0;
        }

        for (int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        
    scan.close();
   }
}
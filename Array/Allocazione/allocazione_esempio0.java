public class allocazione_esempio0 {

    public static void main(String[] args) {
        
        int[] score; // Creo il riferimento

        score = new int[5]; // Alloco memoria per 5 elementi

        score[0] = 1000;
        score[1] = 1350;
        score[2] = 2104;
        score[3] = 675;
        score[4] = 1454;

        // Modifico l'array

        score[0] = 1000;
        score[1] = score[0];
        score[1] += 350;

        System.out.println(score[0]);
        System.out.println(score[1]);


    }
}
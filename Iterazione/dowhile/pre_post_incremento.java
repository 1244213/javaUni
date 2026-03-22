public class pre_post_incremento {

    public static void main(String[] args) {

        int i = 1;
        do // POST INCREMENTO
            System.out.print(i++ + " ");
        while (i <= 10);

        /*****/System.out.println();/*****/

        int j = 0;
        do // PRE INCREMENTO
            System.out.print(++j + " ");
        while (j < 10);
    
    System.out.println();
    }
}
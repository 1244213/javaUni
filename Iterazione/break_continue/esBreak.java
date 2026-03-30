public class esBreak {

    public static void main(String[] args) {

        for(int i = 1; i < 10; i++) {
            if(i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("Fine");
    }
}
/* Se i = 5, si esce dal ciclo for */
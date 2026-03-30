public class esContinue {

    public static void main(String[] args) {

        for(int i = 1; i < 10; i++) {
            if(i == 5)
                continue;
            System.out.println(i);
        }
        System.out.println("Fine");
    }
}
/* Se i = 5, si passa direttamente alla iterazione
successiva, dopo aver incrementato */
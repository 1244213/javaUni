public class Conf_Null {

    public static void main(String[] args) {

        String midlleName = "James", middleInitial = null;

        if (middleInitial == null)// null NON è una stringa
            middleInitial = midlleName.substring(0, 1);
        
        System.out.println(middleInitial);
    }
}
import java. awt.Rectangle;

public class Conf_Oggetti {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = box1;
        Rectangle box3 = new Rectangle(5, 10, 20, 30);

        if (box1 != box3){
            System.out.print("box1 != box3 : ");
            System.out.println("Il riferimento agli oggetti è diverso. (boxX == boxY)");
        }
        if (box1.equals(box3)){
            System.out.print("box1.eqauls(box3) : ");
            System.out.println("Il contenuto degli oggetti è uguale. (boxX.equals(boxY))");
        }

        if (box1 == box2){
            System.out.print("box1 == box2 : ");
            System.out.println("Il riferimento all'oggetto è uguale quindi anche il contenuto");
        }
    }
}
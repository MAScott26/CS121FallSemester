package weekThree.labThree;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

    int side1;
    int side2;
    int side3;

    Scanner scnr = new Scanner(System.in);
        System.out.println("Enter length of side 1: ");
        side1 = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter length of side 2: ");
        side2 = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter length of side 3: ");
        side3 = Integer.parseInt(scnr.nextLine());

        if (side1 == side2 && side2 == side3){
            System.out.println("Equliateral Triangle");
        }
        else if ((side1 == side2 || side2 == side3)||side1 ==side3){
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }

    }
}

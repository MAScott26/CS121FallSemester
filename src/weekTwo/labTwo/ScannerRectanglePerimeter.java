package weekTwo.labTwo;
import java.util.*;
public class ScannerRectanglePerimeter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int length;
        int width;
        int perimeter;

        System.out.println("enter the Length: ");
        length = Integer.parseInt(scnr.nextLine());
        System.out.println("enter the Width: ");
        width = Integer.parseInt(scnr.nextLine());

        perimeter = (length*2) + (width*2);

        System.out.println("your perimeter is: " + perimeter);


    }
}

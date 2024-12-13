package weekTwo.labTwo;

import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int length;
        int width;
        int area;

        System.out.println("enter the Length: ");
        length = Integer.parseInt(scnr.nextLine());
        System.out.println("enter the Width: ");
        width = Integer.parseInt(scnr.nextLine());

        area = length * width;

        System.out.println("your area is: " + area);

    }
}

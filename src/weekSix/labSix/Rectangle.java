package weekSix.labSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        double rectLength = 0;
        double rectWidth = 0;
        double rectArea = 0;
        rectLength = getLength(rectLength);
        rectWidth = getWidth(rectWidth);
        rectArea = getArea(rectLength, rectWidth, rectArea);
        displayData(rectLength, rectWidth, rectArea);

        scanner.close();
    }

    public static double getLength(double rectLength){
        System.out.println("Enter rectangle length: ");
        rectLength = Double.parseDouble(scanner.nextLine());
        return rectLength;

    }

    public static double getWidth(double rectWidth){
        System.out.println("Enter rectangle Width: ");
        rectWidth = Double.parseDouble(scanner.nextLine());
        return rectWidth;

    }

    public static double getArea(double rectLength,double rectWidth,double rectArea){
        rectArea = rectLength * rectWidth;
        return rectArea;

    }

    public static void displayData(double rectLength,double rectWidth,double rectArea){
        System.out.printf("\nRectangle Length: %.2f\n", rectLength);
        System.out.printf("Rectangle Width: %.2f\n", rectWidth);
        System.out.printf("Rectangle Area: %.2f", rectArea);

    }



}

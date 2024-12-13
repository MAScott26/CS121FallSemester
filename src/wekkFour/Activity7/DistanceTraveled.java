package wekkFour.Activity7;

import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Integer speed;
    Integer time;
    int distance;

    System.out.println("Enter your speed in MPH");
    speed = Integer.parseInt(scnr.nextLine());

    System.out.println("Enter how many hours traveled");
    time = Integer.parseInt(scnr.nextLine());


    System.out.println("Hours       Distance");
    System.out.println("~~~~~~~~~~~~~~~~~~~~");
    for( int i = 1; i <=time; i = i+1) {
        distance = speed * i;
        System.out.println(i + "         "+ distance);
    }



    }
}

package weekTwo;

import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        // P - principle amount
        //r - annual interest rate
        //n times per year
        //t - number of years
        //A - amount of money at the end of specified years
        double P,r, A;
        int n,t;

        System.out.println("Enter the Principle amount");
        //make scanner, declare object, create instance
        Scanner scnr = new Scanner(System.in);
        //scnr.nextDouble() or, Double.parseDouble(scnr.nextLine())
        //scnr.nextInt() or Integer.parseInt(scnr.nextLine())
        P = Double.parseDouble(scnr.nextLine());
        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(scnr.nextLine())/100;
        System.out.println("Enter the number of times compounded: ");
        n = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter the number of years: ");
        t = Integer.parseInt(scnr.nextLine());

        A = P * Math.pow((1 + r/n), n *t);

        System.out.printf("After %d years, you will have : %.2f",t, A);

            }
}

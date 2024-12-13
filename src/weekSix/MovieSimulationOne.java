package weekSix;

import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        System.out.println("How many movie details would you like to enter");
        final int userNum = Integer.parseInt(scnr.nextLine());

        String [] movieNames = new String [userNum];
        String [] movieTypes = new String [userNum];
        int [] movieAvail = new int [userNum];
        double [] moviePrices = new double[userNum];

        for (int i = 0; i<userNum;i++ ){
            System.out.println("Enter movie name: " + (i + 1));
            movieNames[i] = scnr.nextLine();
            System.out.println("Enter movie type: ");
            movieTypes[i] = scnr.nextLine();
            System.out.println("Enter available seats: ");
            movieAvail[i] = Integer.parseInt(scnr.nextLine());
            System.out.println("Enter price of ticket: ");
            moviePrices[i] = Double.parseDouble(scnr.nextLine());

        }
        displaymovieNamesDetails(movieNames,movieTypes,movieAvail,moviePrices);

    }
    static void displaymovieNamesDetails(String movieNames[],String movieTypes[],int movieAvail[],double moviePrices[]){
        System.out.println("\nMovie Details");
        String Header = String.format("%-20s %-20s %-20s %-20s", "Movie Name", "Movie Type", "Available Seats", "Ticket Price");
        System.out.println(Header);
        for (int i = 0; i<movieNames.length;i++) {
            String output = String.format("%-20s %-20s %-20d $ %.2f", movieNames[i], movieTypes[i], movieAvail[i], moviePrices[i]);
            System.out.println(output);
        }


    }
}

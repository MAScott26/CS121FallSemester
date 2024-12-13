package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {

    public static void main(String[] args) {

        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"Action/Adventure","Action","SciFi","Drama/Historical"};
        Double[] moviePrices = {14.25,20.15,18.11,22.12};
        String movieChoice = "";
        char[] rows = {'A', 'B', 'C' ,'D' ,'E'};
        int movieIndex = 0;

        final int ROWS = 5;
        final int COLUMNS = 10;
        int [][] movieAvailability = new int[ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);
        movieIndex = selectMovie(movieChoice,movieNames );
        displaySelectedMovie(movieNames, movieTypes, moviePrices, movieIndex);

        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability, rows);
    }

    public static int selectMovie(String movieChoice, String movieNames[]){
        Scanner scnr = new Scanner (System.in);
        int movieIndex = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("\nEnter the Movie you are purchasing tickets for");
            movieChoice = scnr.nextLine();
            for(int i = 0; i < movieNames.length; i++){
                if (movieChoice.equals(movieNames[i])){
                    keepGoing = false;
                    movieIndex = i;
                    i = movieNames.length;
                    break;
                }
            }
        }
        return movieIndex;
    }
    public static void displayMovieDetails(String movieNames[],String movieTypes[],Double moviePrices[] ) {
        System.out.println("~~~~~~~~~~~~~~~~~~~Movie List~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-20s %-20s $%.2f\n", movieNames[i], movieTypes[i], moviePrices[i]);

        }
    }
    public static void displaySelectedMovie(String movieNames[],String movieTypes[],Double moviePrices[], int movieIndex){
        System.out.println("~~~~~~~~~~~~~~~~~~Movie Details~~~~~~~~~~~~~~~~~");
        System.out.printf("%-20s %-20s $%.2f\n", movieNames[movieIndex], movieTypes[movieIndex], moviePrices[movieIndex]);
    }
    static void randomizeAvailability(int[][] movieAvailability){
        System.out.println("\n~~~~~~~~~~~~~~~~Available Seats~~~~~~~~~~~~~~~~~");
        Random rand = new Random();
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }

        }
    }
    static void displaySeatAvailability(int[][] movieAvailability, char[]rows){
        System.out.println("\nSeating availability: [1 = Available | 0 = Unavailable]\n");
        System.out.println("    1 2 3 4 5 6 7 8 9 10");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < movieAvailability.length; i++) {
            System.out.printf(rows[i] + " | ");
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.printf(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }
}

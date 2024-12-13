package weekSix;

import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args) {

        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"Action/Adventure","Action","SciFi","Drama/Historical"};
        Double[] moviePrices = {14.25,20.15,18.11,22.12};

        final int ROWS = 5;
        final int COLUMNS = 10;
        int [][] movieAvailability = new int[ROWS][COLUMNS];



        displayMovieDetails(movieNames,movieTypes,moviePrices);
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);


    }
    public static void displayMovieDetails(String movieNames[],String movieTypes[],Double moviePrices[] ){
        System.out.println("~~~~~~~~~~~~Movie Details~~~~~~~~~~~~");
        for (int i = 0; i < movieNames.length; i++ ){
            System.out.printf("%-20s %-20s $%.2f\n",movieNames[i], movieTypes[i], moviePrices[i]);

        }
    }
    public static  void setSeatAvailability(int [][] movieAvailability) {
        System.out.println("~~~~Initial Seats~~~~");
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = 0;
            }

        }
    }
    static void displaySeatAvailability(int[][] movieAvailability){
        System.out.println("\nSeating availability: [1 = Available | 0 = Unavailable]\n");
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.printf(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void randomizeAvailability(int[][] movieAvailability){
        System.out.println("~~~~Random Seats~~~~");
        Random rand = new Random();
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }

        }
    }
}


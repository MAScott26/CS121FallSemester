package wekkFour;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Integer theNumber = (int) (Math.random() * 100);
        Integer counter = 0;
        String userGuess;
        Integer guess;

        boolean q = false;


        while (!q) {
            counter += 1;
            System.out.println("guess a number between 1 and 100. press q to give up");
            userGuess = scnr.nextLine();

            if (userGuess.equals("q")) {
                System.out.println("Quitter! The number was : " + theNumber);
                q = true;
                break;
            } else {
                int uGuess = Integer.parseInt(userGuess);
                if (uGuess > theNumber) {
                    System.out.println("Your guess is too high");
                } else if (uGuess < theNumber) {
                    System.out.println("your guess is too low");
                } else {
                    System.out.println("Correct!");
                    System.out.println("You guessed correct in "+ counter + " attempts!");
                    break;

                }
            }

        }
    }
}
//
package wekkFour.LabFour;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scnr = new Scanner(System.in);
        Integer randNum = 0;
        String randColor = "";
        Integer counter = 0;
        String uGuess;

        for ( int i = 1; i<= 10;i++) {
            randNum = random.nextInt(5);
            switch (randNum) {
                case 0:
                    randColor = "red";
                    break;
                case 1:
                    randColor = "green";
                    break;
                case 2:
                    randColor = "blue";
                    break;
                case 3:
                    randColor = "orange";
                    break;
                case 4:
                    randColor = "yellow";
                    break;
            }
            System.out.println(i + "). What color has the computer chosen?");
            uGuess = scnr.nextLine();

            if (uGuess.equals(randColor)){
                counter = counter + 1;
                System.out.println("Correct!");
            }
            else{
                System.out.println("incorrect. The computer chose: " + randColor);
            }


        }
    System.out.println("You got "+ counter + " out of 10 correct!");

        

    }
}

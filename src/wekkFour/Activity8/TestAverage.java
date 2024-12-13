package wekkFour.Activity8;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int students;
        int numScores;
        int testScore;
        int totalScore = 0;
        double avgScore;


        System.out.println("how many students?");
        students = Integer.parseInt(scnr.nextLine());
        System.out.println("how many scores per student?");
        numScores = Integer.parseInt(scnr.nextLine());

        for(int i = 1; i <= students;i++){
            totalScore= 0;
            System.out.printf("Student Number %d%n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n", i);
            for(int j = 1; j<=numScores;j++){
                System.out.printf("Enter Score %d ", j);
                testScore = Integer.parseInt(scnr.nextLine());
                totalScore +=testScore;
            }
            avgScore = (double)totalScore/numScores;
            System.out.printf("The average for student %d%n is %.2f%n",i,avgScore);

        }





    }
}

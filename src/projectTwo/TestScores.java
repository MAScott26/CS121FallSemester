package projectTwo;

import java.util.Scanner;


public class TestScores {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        char letterGrade = 'z';
        double randNum  = Math.random()*10;
        final int SIZE = (int) randNum + 1;
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.printf("Enter your %d Test Score(s)",SIZE);
        for(int i = 0; i< SIZE;i++){
            System.out.printf("\nEnter grade %d:", i + 1);
            testScores[i] = scnr.nextInt();
        }
        for (int i = 0; i < SIZE;i++){
            letterGrades[i] = getLetterGrade(testScores, i, letterGrade);
        }

        printGrades(testScores,letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);



        scnr.close();
    }

    public static char getLetterGrade(int[] testScores, int i,char letterGrade){
        if (testScores[i]>=90){
            letterGrade = 'A';
        }
        else if  (testScores[i]<90 && testScores[i]>=80){
            letterGrade = 'B';
        }
        else if  (testScores[i]<80 && testScores[i]>=70){
            letterGrade = 'C';
        }
        else if  (testScores[i]<70 && testScores[i]>=60){
            letterGrade = 'D';
        }
        else if  (testScores[i]<60){
            letterGrade = 'F';
        }

        return letterGrade;
    }

    public static void printGrades(int testScores[],char letterGrades[]  ){
        System.out.println("Score    Grade");
        for (int i = 0; i < testScores.length; i ++ )
            System.out.printf(testScores[i] + "       " + letterGrades[i] + "\n");
    }

    public static void printHighestScore(int testScores[]) {
        int highestScore = 0;
        for (int i = 0; i < testScores.length; i++) {
            if (highestScore < testScores[i]) {
                highestScore = testScores[i];
            }
        }
        System.out.println("Highest Score is: " + highestScore);
    }

    public static void printLowestScore(int testScores[]){
        int lowestScore = 99999;
        for (int i = 0; i < testScores.length; i++) {
            if (lowestScore > testScores[i]) {
                lowestScore = testScores[i];
            }
        }
        System.out.println("Lowest Score is: " + lowestScore);
    }

    public static void printAverageScore(int testScores[]){
        double averageScore = 0.00;
        int added = 0;
        for(int i = 0; i < testScores.length;i++){
            added = added + testScores[i];
        }
        averageScore = (double)added /(double) testScores.length;
        System.out.printf("Average Score is: %.2f", averageScore);
    }
}

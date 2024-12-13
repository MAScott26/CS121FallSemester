package weekTwo;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
    Double score1;
    Double score2;
    Double score3;
    Double average;
    String letterGrade = "N";

        System.out.println("enter the first test score: ");
        score1 = Double.parseDouble(scnr.nextLine());
        System.out.println("enter the second test score: ");
        score2 = Double.parseDouble(scnr.nextLine());
        System.out.println("enter the third test score: ");
        score3 = Double.parseDouble(scnr.nextLine());

        average = (score1 + score2 + score3) / 3;

        if ((average >= 90) && (average <= 100)){
            letterGrade = "A";
        }
        else if ((average <90) && (average >=80)){
            letterGrade = "B";
        }
        else if ((average < 80)&& (average >=70)){
            letterGrade = "C";
        }
        else if((average<70)&& (average >=60)){
            letterGrade = "D";
        }
        else if(average < 60){
            letterGrade = "F";
        }
        System.out.println("Since the average is "+ average + " The letter grade is: "+ letterGrade);
        scnr.close();



    }
}

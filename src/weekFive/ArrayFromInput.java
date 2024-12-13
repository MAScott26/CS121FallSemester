package weekFive;
import java.util.Scanner;


public class ArrayFromInput {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int [] age;
        String [] name;
        Double [] grade;

        age = new int[3];
        name = new String[3];
        grade = new Double[3];

        for(int i = 0; i<3;i++){
            System.out.println((i+1) + ".)Enter name: ");
            name[i] = scnr.nextLine();
            System.out.println((i+1)+".)Enter age: ");
            age[i] = Integer.parseInt(scnr.nextLine());
            System.out.println((i+1)+".) Enter Test Grade ");
            grade[i] = Double.parseDouble(scnr.nextLine());
        }
        System.out.printf("%-15s | %-10s | %s","Name: ", "Age: ", "Grade: \n");
        for(int i = 0; i<name.length; i++){
            System.out.printf("%-15s | %-10d | %.2f\n",name[i], age[i], grade[i]);

        }



    }
}

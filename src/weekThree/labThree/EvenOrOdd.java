package weekThree.labThree;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);

    Integer userInput;

    System.out.println("Enter a number: ");
    userInput = Integer.parseInt(scnr.nextLine());
    if (userInput % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    }
}

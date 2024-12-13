import java.util.Scanner;

public class Recursiontest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Number to count down from:");
        int count = Integer.parseInt(scnr.nextLine());
        Recursion.countDown(count);
        System.out.println("Enter a letter to start with");
        String character = scnr.nextLine();
        Character curChar = character.charAt(0);
        Recursion.alphaBackwards(curChar);

        scnr.close();




    }
}

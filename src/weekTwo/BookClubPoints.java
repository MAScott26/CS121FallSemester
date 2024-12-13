package weekTwo;
import java.util.Scanner;
public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Integer numBooks;
        Integer points = 0;

        System.out.println("enter the number of books purchased: ");
        numBooks = Integer.parseInt(scnr.nextLine());
        if (numBooks <= 0){
            points = 0;
        }
        else if (numBooks == 1) {
            points = 5;
        }
        else if (numBooks == 2) {
            points = 15;
        }
        else if (numBooks == 3) {
            points = 30;
        }
        else if (numBooks >= 4) {
            points = 60;
        }
        System.out.println("since you bought " + numBooks + " book(s), you earned "+  points + " points.");
        scnr.close();
    }
}

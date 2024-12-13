package weekThree;
import java.util.Scanner;



public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian, vegan, gFree;
        Scanner scnr = new Scanner(System.in);
        String joe = "\nJoe's Gourmet Burgers";
        String main = "\nMain Street Pizza Company";
        String corner = "\nCorner Café";
        String mama = "\nMama’s Fine Italian";
        String chef = "\nThe Chef’s Kitchen";

        System.out.println("Is a member of your party Vegitarian?");
        vegetarian = scnr.nextLine();
        System.out.println("Is a member of your party Vegan?");
        vegan = scnr.nextLine();
        System.out.println("Is a member of your party Gluten-Free?");
        gFree = scnr.nextLine();

        System.out.println("Here are your restaurant options: ");

        if (vegetarian.equals("no") && vegan.equals("no") && gFree.equals("no")) {
            System.out.printf("\t %s", joe);
        }
        if (vegan.equals("no") && gFree.equals("no")){
            System.out.printf("\t %s", mama);
        }
        if (vegan.equals("no")){
            System.out.printf("\t %s", main);
        }
        System.out.printf("\t%s%n\t%s",corner,chef);





    }
}

package weekThree;
import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String oceanChoice;

        System.out.println("Enter the name of an Ocean: ");
        oceanChoice = scnr.nextLine();


        switch(oceanChoice) {
            case "Atlantic":
                System.out.println("Surface Area: 85,133,000 km2  \nVolume: 354,700,000km³ \nDepth: 28,232 Ft");
                break;
            case "Pacific":
                System.out.println("Surface Area: 165,250,000 km2 \nVolume: 714,000,000km³ \nDepth: 35,876 Ft ");
                break;
            case "Indian":
                System.out.println("Surface Area: 70,560,000 km2  \nVolume: 264,000,000km³ \nDepth: 23,920 ft");
                break;
            case "Southern":
                System.out.println("Surface Area: 20,327,000 km2 \nVolume:  71,800,000km³ \nDepth: 24,390ft ");
                break;
            case "Arctic":
                System.out.println("Surface Area: 14,090,000 km2  \nVolume: 18,070,000km³ \nDepth: 18,264ft ");
                break;
            default:
                System.out.println("Unknown ocean.");
                break;

        }
    }
}


    //Ladelle Diekhoff
// Date Created: 08-25-22
// Date Modified: 04-16-24
// Recursion Example : Coffee Creamer
// Students liked this example: Helped them understand it better, Use again.
import java.util.Scanner;
    public class CoffeeCreamer {
        public static void main(String[] args) {
//Scanner instance
            Scanner scanner = new Scanner(System.in);
            System.out.println("Assuming you already have coffee");
//Prompt user for creamer amount
            System.out.println("\nEnter the number of creamers you'd like to add: ");
//Input: 5
            int creamer = Integer.parseInt(scanner.nextLine());
//close scanner
            scanner.close();
//Call to methods
            getCartonOfCreamer(); // gets the carton of creamer
            getSpoon(); // gets the spoon
            addCreamer(creamer); // adds the creamer in the coffee - recursive
           // method call;
        }
        // Method: getCartonOfCreamer()
// Method Functionality: Displays a statement to indicate
// the step to get a carton of creamer.
// Params: None
// Returns:None
        public static void getCartonOfCreamer(){
            System.out.println("1. Get the carton of creamer.");
        }
        // Method: getSpoon()
// Method Functionality: Displays a statement to indicate
// the steps get a spoon.
// Params: None
// Returns:None
        public static void getSpoon(){
            System.out.println("2. Get a spoon.");
        }
        // Method: addCreamer()
// Method Functionality: Displays a statement to indicate
// the steps get a spoon.
// Params: int remainingCreamer
// Returns:None
// recursive method
        public static void addCreamer(int remainingCreamer)
        { //Base Case
            if(remainingCreamer == 0){
                System.out.println("Finished adding creamer!");
                return;
            }
            System.out.println("3. Take out some creamer.");
            System.out.println("4. Pour creamer from the spoon into the coffee.");
            System.out.println();
//Recursive call
            addCreamer(remainingCreamer - 1 );
        }


    }


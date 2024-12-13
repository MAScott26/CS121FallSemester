package Project3;
import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Bank Bank = new Bank();

    Integer PIN;
    String firstName,lastName;

    public void displayMenu(){
        int input;
        while(true) {
            System.out.println("**********MENU**********\n" +
                    "\n" +
                    "Please make a Selection:\n" +
                    "1) Access Account\n" +
                    "2) Open a New Account\n" +
                    "3) Close All Accounts\n" +
                    "4) Exit\n");

            input = Integer.parseInt(scanner.nextLine());

            if (input == 1){
                accessAccount();
            }
            else if (input == 2){
                openAccount();
            }
            else if (input == 3){
                closeAllAccounts();
            }
            else if (input == 4){
                System.out.println("Exiting......");
                break;
            }
            else{
                System.out.println("Invalid Entry Please Try Again");}
        }
    }

    private void accessAccount(){
        System.out.println("Enter PIN:");
        PIN  = Integer.parseInt(scanner.nextLine());
        if(PIN == null){
            System.out.println("PIN is not Valid");
            return;
        }
        else if()


    }

    private void openAccount(){
        String userInput;
        System.out.println("Are you a new customer?\n1) Yes\n2) No");
        userInput = scanner.nextLine();
        if (userInput.equals("yes") || Integer.parseInt(userInput) == 1){
            createNewCustomer();
        }
    }

    private void createNewCustomer(){
        String firstName,lastName,PIN;

        System.out.println("Enter First Name:");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        lastName = scanner.nextLine();
        System.out.println("Enter New PIN:");
        PIN = scanner.nextLine();
        Customer Customer = new Customer(firstName, lastName, PIN);
        Bank.addCustomer(Customer);

        return Customer;
    }

    private void closeAllAccounts(){
        System.out.println("Enter Pin of Account to Close");


    }


}

package weekThirteen;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class RestSet {
    Set<String> Reservation = new HashSet<>();
    public void addReservation(){

        Scanner scnr = new Scanner(System.in);
        boolean keepGoing = true;
        System.out.println("Enter Reservation ID or 0 to Quit");
        while(keepGoing){
            String userIn = scnr.nextLine();
            if(Objects.equals(userIn, "0")){
                break;
            }
            else{
                Reservation.add(userIn);
            }

        }

    }
}

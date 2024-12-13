package weekFive.labFive;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int rooms;
        int occupied;
        int totalRooms = 0;
        int totalOcc = 0;
        Double occRate;
        int vacant;


        System.out.println("How many floors?");
        int floors = Integer.parseInt(scnr.nextLine());

        for(int i = 0; i < floors; i++) {
            System.out.printf("\nHow many rooms on floor %d\n", i + 1);
            rooms = Integer.parseInt(scnr.nextLine());
            totalRooms += rooms;
            System.out.printf("\nHow many occupied rooms on floor %d\n", i + 1);
            occupied = Integer.parseInt(scnr.nextLine());
            totalOcc += occupied;
        }
        occRate = (double)totalOcc / (double)totalRooms ;
        vacant = totalRooms - totalOcc;
        System.out.printf("\nFloors: %d", floors);
        System.out.printf("\nRooms: %d", totalRooms);
        System.out.printf("\nOccupied rooms: %d", totalOcc);
        System.out.printf("\nVacant Rooms: %d", vacant);
        System.out.printf("\nOccupancy rate: %.2f ", occRate );
        System.out.print("(" + occRate*100 + "%)");


    }
}

package weekNine.RestaurantInheritance;

public class RegularReservation extends TableReservation{


    public RegularReservation(String customerName, String reservationTime, int numGuests) {
        super(customerName, reservationTime, numGuests);


    }

    @Override
    public String toString(){
        return String.format("\nName: %s\nTime: %s\nGuests: %d\n(Standard Seating)",customerName,reservationTime,numGuests);
    }
}

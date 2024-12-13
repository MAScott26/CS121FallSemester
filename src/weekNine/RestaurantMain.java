package weekNine;

public class RestaurantMain {
    public static void main(String[] args) {

        RestaurantSystem reservationOne = new RestaurantSystem("John Doe", "Steak and Wine", "6:30 PM", 4);
        RestaurantSystem reservationTwo = new RestaurantSystem("Jane Deer","Cheese Board","9:00 AM",5);
        RestaurantSystem reservationThree = new RestaurantSystem(555444);

        System.out.println("Test Reservation number: \n" + reservationOne.getResNumber());

        System.out.println("\nReservation One Information");
        System.out.printf("\nVIP Number: %d\nName: %s\nOrder: %s\nTime: %s\nGuests: %d\n"
                ,reservationOne.getVipNumber(),reservationOne.getName(),reservationOne.getorder(),reservationOne.getTime(), reservationOne.getNumGuests());
        System.out.println(reservationOne.getResNumber(reservationOne.getName()));

        System.out.println("\nReservation Two Information");
        System.out.printf("\nVIP Number: %d\nName: %s\nOrder: %s\nTime: %s\nGuests: %d\n"
                ,reservationTwo.getVipNumber(),reservationTwo.getName(),reservationTwo.getorder(),reservationTwo.getTime(), reservationTwo.getNumGuests());
        System.out.println(reservationOne.getResNumber(reservationOne.getName()));

        System.out.println("\nReservation Three Information");
        System.out.printf("\nVIP Number: %d\nName: %s\nOrder: %s\nTime: %s\nGuests: %d\n"
                ,reservationThree.getVipNumber(),reservationThree.getName(),reservationThree.getorder(),reservationThree.getTime(), reservationThree.getNumGuests());
        System.out.println(reservationThree.getResNumber(reservationThree.getVipNumber()));

        System.out.println("End Of Day Reservation Reset...");
        System.out.println(reservationOne.getResNumber("Reset", 1000000));

    }
}

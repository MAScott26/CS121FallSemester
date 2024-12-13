package weekNine.RestaurantInheritance;


public class Main {
    public static void main(String[] args) {
        TableReservation reservation1 = new TableReservation("Joe Deer", "7:00 PM", 3);
        System.out.println(reservation1);

        RegularReservation reservation2 = new RegularReservation("John Doe", "8:00 PM",2 );
        System.out.println(reservation2);

        VIPReservation reservation3 = new VIPReservation("Luke Atmey", "9:27", 1, 99217);
        System.out.println(reservation3);

    }
}

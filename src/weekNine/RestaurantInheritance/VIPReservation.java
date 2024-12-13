package weekNine.RestaurantInheritance;

public class VIPReservation extends TableReservation{

    private int vipID;

    public VIPReservation(String customerName, String reservationTime, int numGuests, int vipID) {
        super(customerName, reservationTime, numGuests);
        this.vipID = vipID;
    }

    public int getVipID() {
        return vipID;
    }

    public void setVipID(int vipID) {
        this.vipID = vipID;
    }

    @Override
    public String toString(){
        return String.format("\nName: %s\nTime: %s\nGuests: %d\nVIP ID: %d\n(Priority Seating)",customerName,reservationTime,numGuests, vipID);
    }
}

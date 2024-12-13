package weekNine.RestaurantInheritance;

public class TableReservation {
    protected String customerName, reservationTime;
    protected int numGuests;

    public TableReservation(String customerName,String reservationTime, int numGuests) {
        this.customerName = customerName;
        this.reservationTime = reservationTime;
        this.numGuests = numGuests;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String toString(){
        return String.format("\nName: %s\nTime: %s\nGuests: %d\n",customerName,reservationTime,numGuests);
    }
}

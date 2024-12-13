package weekNine;

import java.sql.SQLOutput;

public class RestaurantSystem {
    private String customerName, foodOrder, reservTime;
    private int numGuests, vipNumber;
    private static int resNumber = 1000000;

    public RestaurantSystem(String Name, String Order, String Time, int Guests){
        this.customerName = Name;
        this.foodOrder = Order;
        this.reservTime = Time;
        this.numGuests = Guests;

    }
    public RestaurantSystem(int VIP){
        this.vipNumber = VIP;
        this.customerName = "Joe Deer";
        this.foodOrder = "Venison And Wine";
        this.reservTime = "4:00 AM";
        this.numGuests = 1;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFoodOrder(String foodOrder) {
        this.foodOrder = foodOrder;
    }

    public void setReservTime(String reservTime) {
        this.reservTime = reservTime;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public void setVipNumber(int vipNumber) {
        this.vipNumber = vipNumber;
    }

    public String getName(){
        return customerName;
    }
    public String getorder(){
        return foodOrder;
    }
    public String getTime(){
        return reservTime;
    }
    public int getNumGuests(){
        return numGuests;
    }
    public int getVipNumber(){
        return vipNumber;
    }
    //regular methods
    public int getResNumber(){
        return resNumber+1;
    }

//overloaded methods
// public void
    public int getResNumber(String name){
        System.out.printf("Thank you for your Reservation %s\nYour Reservation number is: ", name);
        resNumber +=1;
        return resNumber;
    }
    public int getResNumber(int VipNumber){
        System.out.printf("Welcome back Valued Guest %s\nYour Reservation number is: ", customerName);
        resNumber +=1;
        return resNumber;
    }
    public int getResNumber(String any, int aNumber) {
        if (any.equalsIgnoreCase("Reset")){
            resNumber = aNumber;
        }
        else {
            resNumber = 100000;
        }
        return resNumber;
    }

}

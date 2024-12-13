package weekTen.AbstractClasses;

public class SubclassCustomer extends AbstractClassUser {
    protected String order, time ;




    public SubclassCustomer(String name, String  email, String password, int contactnumber,String order, String time){
        super(name,email,password,contactnumber);
        this.order = order;
        this.time = time;
    }

    public String getOrder() {
        return order;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public void DisplayDetails() {
        System.out.println(String.format("\nName: %s\nEMail: %s\nPassword: %s\nContact: %d\nFood Order: %s\nReservation Time: %s\n", name, eMail,passWord,contactNumber, order, time));
    }
}

package Project3;

public class Customer {

    private String firstName, lastName,PIN;


    public Customer(String firstName,String lastName,String PIN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void addAccount(){

    }

    private void removeAccount(){

    }

    private void getAnAccount(){

    }

    private void getAllAccount(){

    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\n" +
                        "HP: %d\n",
                firstName,lastName, PIN);
    }
}

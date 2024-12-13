package weekEight.packageDemo;

public class Person {

    public String firstName;
    public String lastName;

    private int age;
    private String address;
    private double salary;

    public Person(String FirstName, String LastName, int Age, String Address, double Salary){
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.address = Address;
        this.salary = Salary;
    }
    public void displayPersonContent(){
        System.out.printf("\nFull Name: %s %s \nAge: %d \nAddress: %s \nSalary: %.2f\n",firstName, lastName, age, address, salary );
    }
    private void displayAge(){
        System.out.println("Age" + age);
    }

    protected void displayAddress(){
        System.out.println("Address: "+ address);

    }

    void displaySalary(){
        System.out.println("Salary: " + salary);
    }

    //setters and getters
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
    //getters/accessors
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }



}

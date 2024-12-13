package weekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person personOne = new Person("John", "Doe", 30, "123 elm street", 33000.59);
        Person personTwo = new Person("Jane","Doe", 29, "125 elm street", 55876.74);

        personOne.displayPersonContent();
        personTwo.displayPersonContent();

        personOne.lastName = "DoeA";
        personTwo.lastName = "DoeB";

        personOne.setAge(34);
        personTwo.setSalary(44000.65);

        //personOne.displayAge();


        personOne.displayPersonContent();
        personTwo.displayPersonContent();

    }
}

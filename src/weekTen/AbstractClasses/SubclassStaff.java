package weekTen.AbstractClasses;

public class SubclassStaff extends AbstractClassUser{
protected String hours;


    public SubclassStaff(String name,String eMail,String passWord,int contactNumber, String hours){
        super(name, eMail,passWord, contactNumber);
        this.hours = hours;


    }


    @Override
    public void DisplayDetails() {
        System.out.println(String.format("\nName: %s\nEMail: %s\nPassword: %s\nContact: %d\nHours: %s", name, eMail,passWord,contactNumber, hours));
    }

}

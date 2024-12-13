package weekTen.AbstractClasses;

public abstract class AbstractClassUser {

    protected String name, eMail, passWord;
    protected int contactNumber;

    public AbstractClassUser(String name, String  email, String password, int contactnumber){
        this.name = name;
        this.eMail = email;
        this.passWord = password;
        this.contactNumber = contactnumber;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void DisplayDetails();





}

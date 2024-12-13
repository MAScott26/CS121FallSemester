package weekEight.packageDemo;

public class Student {
    private String studentName;
    private String major;
    private int studentID;
    private int year;
    private double gpa;

    //constructor
    public Student(String Name, String Major, int ID, int Year, Double GPA){
        this.studentName = Name;
        this.major = Major;
        this.studentID =ID;
        this.year = Year;
        this.gpa = GPA;
    }

    public void setStudentName(String Name){
        this.studentName = Name;
    }
    public void setmajor(String Major){
        this.major = Major;
    }
    public void setStudentID(int ID){
        this.studentID = ID;
    }
    public void setYear(int Year){
        this.year = Year;
    }
    public void setGPA(double GPA){
        this.gpa = GPA;
    }


    public String getStudentName(){
        return studentName;
    }
    public String getMajor(){
        return major;
    }
    public int getStudentID(){
        return studentID;
    }
    public int getYear(){
        return year;
    }
    public double getGPA(){
        return gpa;
    }

}

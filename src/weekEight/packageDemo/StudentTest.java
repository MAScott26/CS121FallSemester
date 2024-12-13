package weekEight.packageDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne = new Student("Michael Scott","Music Media Production",99999999, 2024, 3.00 );
        System.out.println("Name:" + studentOne.getStudentName() );
        System.out.println("Major:" + studentOne.getMajor() );
        System.out.println("ID Number:" + studentOne.getStudentID() );
        System.out.println("Year:" + studentOne.getYear() );
        System.out.println("GPA:" + studentOne.getGPA());

        //update data
        studentOne.setmajor("Music Media Production With Computer Science Minor");
        studentOne.setGPA(3.51);
        System.out.println("\nUPDATED INFORMATION USING METHODS\n");
        System.out.println("Major:" + studentOne.getMajor() );
        System.out.println("GPA:" + studentOne.getGPA());
    }
}

package weekEleven.ArrayListsDemo;
import weekEight.packageDemo.Student;

import java.util.Scanner;
import java.util.ArrayList;

public class TestCustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManagement StudentInfo = new SystemManagement();

        while (true){
            System.out.println("enter info or press q to quit");
            String input = scanner.nextLine();
            if(input.equals("q")){
                break;
            }
            else{
                StudentInfo.addName(input);
            }


        }
        //SystemManagement.displayInfo();




    }


}

package weekThree.labThree;
import javax.swing.*;


public class Login {
    public static void main(String[] args) {
        String userName;
        String passWord;
        String name;
        String pw;
        userName = "cs121student";
        passWord = "abcd1234";

        name = JOptionPane.showInputDialog("Enter your username: ");
        pw = JOptionPane.showInputDialog("Enter your password: ");


        if ((name.equals(userName) ) && (pw.equals( passWord))){
            JOptionPane.showMessageDialog(null,"Welcome to CS121.");
        }
        else if (!name.equals(userName) && (pw.equals( passWord))){
            JOptionPane.showMessageDialog(null,"User name is incorrect");
        }
        else if ((name.equals(userName)) && (!pw.equals(passWord))){
            JOptionPane.showMessageDialog(null,"Password is incorrect");
        }
        else {
            JOptionPane.showMessageDialog(null,"Both username and password are incorrect.");
        }



    }
}

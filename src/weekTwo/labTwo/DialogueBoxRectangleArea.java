package weekTwo.labTwo;

import javax.swing.*;

public class DialogueBoxRectangleArea {
    public static void main(String[] args) {
        int width;
        int length;
        int area;
        String message;

        width = Integer.parseInt(JOptionPane.showInputDialog("Enter your Width "));
        length = Integer.parseInt(JOptionPane.showInputDialog("Enter your Length "));

        area = length * width;

        message =String.format( "your area is: %d", area);

        JOptionPane.showMessageDialog(null,message);


    }
}

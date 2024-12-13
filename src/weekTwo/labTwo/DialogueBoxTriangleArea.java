package weekTwo.labTwo;

import javax.swing.*;

public class DialogueBoxTriangleArea {
    public static void main(String[] args) {

        double base;
        double height;
        double area;
        String message;

        base = Double.parseDouble(JOptionPane.showInputDialog("Enter your Base "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height "));

        area = (base * height) / 2;

        message = String.format("the area of your triangle is: %.2f", area);

        JOptionPane.showMessageDialog(null,message);


    }
}

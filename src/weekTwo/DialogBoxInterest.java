package weekTwo;

import javax.swing.JOptionPane;


//scanner
public class DialogBoxInterest {
    public static void main(String[] args) {
        // P - principle amount
        //r - annual interest rate
        //n times per year
        //t - number of years
        //A - amount of money at the end of specified years
        double P,r, A;
        int n,t;

        //System.out.println("Enter the Principle amount");
       P =  Double.parseDouble(JOptionPane.showInputDialog("Enter the Principle amount: "));
       r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "))/100;
       n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of times compounded: "));
       t =  Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years: "));



        A = P * Math.pow((1 + r/n), n *t);

        System.out.printf("After %d years, you will have : %.2f",t, A);





    }
}

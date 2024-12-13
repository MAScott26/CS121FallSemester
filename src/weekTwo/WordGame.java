package weekTwo;
import javax.swing.*;
public class WordGame {
    public static void main(String[] args) {
        String name ;
        String age ;
        String city ;
        String college ;
        String major ;
        String animal ;
        String petName ;

        name = JOptionPane.showInputDialog("Enter your name: ");
        age = JOptionPane.showInputDialog("Enter your Age: ");
        city = JOptionPane.showInputDialog("Enter your city: ");
        college = JOptionPane.showInputDialog("Enter your college: ");
        major = JOptionPane.showInputDialog("Enter your Major: ");
        animal = JOptionPane.showInputDialog("Enter an animal: ");
        petName = JOptionPane.showInputDialog("Enter your pet's name: ");



        String message = String.format("There once was a person named %s who lived in %s. At the age of\n" +
                "%s, %s went to college at %s. %s graduated with a major in\n" +
                "%s. Then, %s adopted a(n) %s named %s. They both\n" +
                "lived happily ever after!",name, city, age, name, college, name, major, name, animal, petName );

        JOptionPane.showMessageDialog(null,message);




    }
}

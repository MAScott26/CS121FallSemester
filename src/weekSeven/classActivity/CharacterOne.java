package weekSeven.classActivity;
import java.util.Scanner;

public class CharacterOne {
    Scanner scnr = new Scanner(System.in);
    String  name, moveName;
    int HP;

    public CharacterOne(){
        name = "Default Player1";
        moveName = "Default Player1 Move";
        HP = 999;

    }
    public void attack(){
        System.out.println(name + " Attacks their Enemy Using " + moveName);
    }
    public void damaged(){
        System.out.println(name + " Takes Damage");
        HP -= 5;
        System.out.println("Hp:" + HP);
    }
}

package weekSeven.classActivity;

import java.util.Scanner;

public class CharacterTwo {
    Scanner scnr = new Scanner(System.in);
    String  name, moveName;
    int HP;

    public CharacterTwo(){
        name = "Default Player2";
        moveName = "Default Player2 Move";
        HP = 999;

    }
    public void damaged(){
        System.out.println(name + " Takes Damage");
        HP -= 5;
        System.out.println("Hp:" + HP);
    }
    public void attack(){
        System.out.println(name + " Attacks their Enemy Using " + moveName);
    }

}

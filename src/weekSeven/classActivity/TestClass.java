package weekSeven.classActivity;


import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        CharacterOne Hero = new CharacterOne();
        CharacterTwo Villain  = new CharacterTwo();

        Hero.attack();
        Villain.damaged();
        Villain.attack();
        Hero.damaged();



    }
}

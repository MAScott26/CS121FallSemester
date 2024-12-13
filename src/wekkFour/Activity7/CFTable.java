package wekkFour.Activity7;

public class CFTable {
    public static void main(String[] args) {

        double f;
        System.out.println("Celsius     Fahrenheit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i <=20; i = i+1) {
            f = (9 / 5) * i + 32;
            System.out.println(i + "           " + f);
        }
    }
}

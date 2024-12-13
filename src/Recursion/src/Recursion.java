public class Recursion {
    public static void countDown(int count){
        if (count < 1){
            System.out.println("Blast Off!!!!");
            return;
        }
        System.out.println(count);
        countDown(count-1);

    }

    public static void alphaBackwards(char curChar){
        if (curChar == 'a'){
            System.out.println(curChar);
            return;
        }
        System.out.println(curChar);
        curChar = (char) (curChar-1);
        alphaBackwards(curChar);


    }

}

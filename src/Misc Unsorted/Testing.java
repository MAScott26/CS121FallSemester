
    import java.util.Queue;
    import java.util.Scanner;
    import java.util.LinkedList;

    public class Testing {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            /* Variable declaration goes here */
            Queue<Character> codesQueue = new LinkedList<Character>();
            /* Your code goes here */
            codesQueue.add( scnr.nextLine().charAt(0));
            codesQueue.add( scnr.nextLine().charAt(0));
            codesQueue.add( scnr.nextLine().charAt(0));



            System.out.println(codesQueue.remove());
            System.out.println(codesQueue.remove());
            System.out.println(codesQueue.remove());
        }
    }
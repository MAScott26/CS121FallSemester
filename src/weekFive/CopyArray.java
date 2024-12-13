package weekFive;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter how many items are in the Array: ");
        final int elemNum = Integer.parseInt(scnr.nextLine());

        int[] array1 = new int[elemNum];
        int[] array2 = new int[elemNum];
        int[] array3 = new int[elemNum];
        int[] array4 = new int[elemNum];

        int tempval;

        for(int i = 0; i<elemNum; i++ ){
            System.out.printf("Enter array element %d\n", i + 1);
            array1[i] = Integer.parseInt(scnr.nextLine());
        }
        System.out.println("Array 1: ");
        for(int i = 0; i<elemNum; i++ ){
            System.out.print(array1[i] + " ");
        }
        for(int i = 0; i<elemNum; i++ ){
            array2[i] = array1[i];
            array4[i] = array1[i];
        }
        System.out.println("\nArray 2: ");
        for(int i = 0; i<elemNum; i++ ) {
            System.out.print(array2[i] + " ");
        }
        for(int i = 0; i<elemNum; i++ ) {
            array3[i] = array1[i] * array1[i] * array1[i];
        }
        System.out.println("\nArray 3 - Squared: ");
        for(int i = 0; i<elemNum; i++ ) {
            System.out.print(array3[i] + " ");
        }
        for(int i = 0; i < array1.length/2; i++ ) {
            tempval = array4[i];
            array4[i] = array4[array4.length -1 -i];
            array4[array4.length -1 -i] = tempval;
        }
        System.out.println("\nArray 4 - Reverse: ");
        for(int i = 0; i < elemNum; i++ ) {
            System.out.print(array4[i] + " ");
        }
    }

}

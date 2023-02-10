package ArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myInts = getIntegers(5);
        for (int i=0; i<myInts.length; i++){
            System.out.println("Element " + i + ", typed value was " + myInts[i]);
        }

        System.out.println("The average is " + getAverage(myInts));

//        Min in array
        System.out.println("How many integers do you want to add to your array?");
        int count = scanner.nextInt();

        int array[] = readIntegers(count);
        int min = findMin(array);
        System.out.println("Min of array is = " + min);

//      Reversed Array
        int[] array2 = {1,2,3,4,5};
        System.out.println("Array = " + Arrays.toString(array2));
        reverse(array2);
        System.out.println("Reversed Array = " + Arrays.toString(array2));


    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0;  i<array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }


    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integers:");
        int[] array = new int[count];

        for (int i=0; i<array.length;i++){
            System.out.println("Enter number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i=0; i< halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

package ArrayLists.Challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int array[] = getIntegers(5);
        prinArray(array);
//        sortIntegers(array);
        System.out.println("\nFor Loop\n");
        prinArray(sortIntegersForLoop(array));
        System.out.println("\nWhile Loop:\n");
        prinArray(sortIntegersWhileLoop(array));

    }

    public static int[] getIntegers(int number){

        System.out.println("Enter " + number + " numbers in your Array");
        int array[] = new int[number];

        for (int i=0; i<number; i++){
            array[i] = scanner.nextInt();

        }

        return array;
    }

    public static void prinArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.println(i+1 + ": " + array[i]);
        }
    }

    public static int[] sortIntegersForLoop(int[] array){

        int sortedArray[] = new int[array.length];
        //int max = Integer.MIN_VALUE;
        int temp;
        for (int j=0; j< array.length; j++){
            for (int i=0; i< array.length-1; i++){
                if (array[i] < array[i+1]){
                    temp = array[i];
                    array[i]  = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

    private static int[] sortIntegersWhileLoop(int[] array) {
        int sortedArray[] = new int[array.length];

        for (int j=0; j< array.length; j++){
            sortedArray[j] = array[j];
        }

        boolean flag = true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0; i<sortedArray.length-1;i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]  = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }



}

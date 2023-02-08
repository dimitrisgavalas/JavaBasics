package ArrayLists;

import java.util.Scanner;
public class SortedArray {

    public static int[] getIntegers(int arraySize){

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[arraySize];

        for (int i=0; i<arraySize; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        boolean flag = true;

        while(flag){
            flag=false;
            int tmp;
            for(int i=0;i<array.length-1; i++){
                if (array[i] < array[i+1]){
                    tmp = array[i+1];
                    array[i+1]=array[i];
                    array[i]=tmp;
                    flag=true;
                }
            }
        }
        return array;
    }


}







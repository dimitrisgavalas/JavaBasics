package ArrayLists.Array;

import java.util.Scanner;
public class MinimumElement {

    //private Scanner scanner = new Scanner(System.in);

    // write code here
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr how many spaces do you want the array to have: ");
        int arrayLength = scanner.nextInt();

        return arrayLength;
    }

    private static int[] readElements(int count){
        Scanner scanner2 = new Scanner(System.in);
        int[] array = new int[count];

        for (int i = 0; i < count; i++){
            System.out.println("Entero digit numero" + i + " : ");
            array[i] = scanner2.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;

    }

}
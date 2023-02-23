package AutoboxingUnboxing;

import java.util.ArrayList;

//created wrapper
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

//        object wrapper
//        difference between int and Integer is that Integer is a class
//      below same with:
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

//        long way
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++){
//            autoboxing. When we are creating or converting an integer. A base primitive type
//            into an INteger. We are taking the primitive type and we are going to the object
//            wrapper
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i=0; i<=10; i++){
//            unboxing. Taking it from class or object wrapper and converting it
//            back to primitive type
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

//        short way

    }
}

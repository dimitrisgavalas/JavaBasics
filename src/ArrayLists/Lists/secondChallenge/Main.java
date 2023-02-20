package ArrayLists.Lists.secondChallenge;

public class Main {

    private static ToDoList firstList = new ToDoList();

    public static void main(String[] args) {

        firstList.addItem("Deez nuts");
        firstList.printArray();
        firstList.addItem("one nuts");
        firstList.printArray();

        firstList.addItem("two nuts");
        firstList.addItem("three nuts");
        firstList.printArray();

        firstList.removeItem("Deez nuts");
//        firstList.printArray();
//        firstList.printArray();




    }
}

package ArrayLists.Lists.secondChallenge;

public class Main {

    private static ToDoList firstList = new ToDoList();

    public static void main(String[] args) {

        firstList.addItem("Buy nuts");
        firstList.printArray();
        firstList.addItem("Buy bread");
        firstList.printArray();

        firstList.addItem("eat two nuts");
        firstList.addItem("eat three nuts");
        firstList.printArray();

        firstList.removeItem("Buy nuts");
        System.out.println("\nBuy nuts removed\n");
        firstList.printArray();

        firstList.modifyList(1, "Buy milk");
        firstList.printArray();


        System.out.println("position of 'Buy milk' is : " + firstList.findItem("Buy milk"));




    }
}

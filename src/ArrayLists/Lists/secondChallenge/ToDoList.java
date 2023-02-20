package ArrayLists.Lists.secondChallenge;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> toDoList = new ArrayList<String>();

    public void addItem(String item){
        toDoList.add(item);
    }

    public void removeItem(String item){
        toDoList.remove(item);
    }

    public void printArray(){
        System.out.println("Printing ArrayList");
        for (int i=0; i<toDoList.size(); i++){
            System.out.println((i+1) + ". " + toDoList.get(i));
        }
    }

}

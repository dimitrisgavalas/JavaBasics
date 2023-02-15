package ArrayLists.Lists.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;
    Scanner scanner = new Scanner(System.in);

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact){
        //check whether its on file
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        //add contact in list of records
        myContacts.add(contact);
        return true;
    }

    //return int. Private bc only used within this class
    private int findContact(Contact contact){
        //return int . Shows what the element position is in the array for that particular contact obj
        //return num>=0 if it exists in ArrayList. num<0 if it doesn't exist
        return this.myContacts.indexOf(contact);
    }

    //loop through all the records and extract the name out
    //compare to the name that has been passed and return index position if on file
    private int findContact(String contactName){

        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        System.out.println("Wasnt found");
        return -1;
    }


    //oldContact = we are searching for
    //newContact = the one we will update
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0){
            System.out.println("It doesnt exist in array");
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }

        System.out.println("It exist in array");
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }







    public void printOptionsAvailable(){
        System.out.println("0 - Quit");
        System.out.println("1 - Print Contacts");
        System.out.println("2 - Add new Contacts");
        System.out.println("3 - Update Existing Contact");
        System.out.println("4 - Remove Contact");
        System.out.println("5 - Search Contact");

    }
    public void quit(){

    }
    public void printContacts(){
        System.out.println();
    }




    public void removeContact(){}






    public boolean checkContact(){
        return true;
    }
}

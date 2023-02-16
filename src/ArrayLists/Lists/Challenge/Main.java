package ArrayLists.Lists.Challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("ENter your choice: (6 for available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit();
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter ne contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Contact add, " + name + " already on file.");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phoone");
    }

    public static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - Shutdown");
        System.out.println("1 - Print Contacts");
        System.out.println("2 - Add new Contact");
        System.out.println("3 - Update Existing Contact");
        System.out.println("4 - Remove Contact");
        System.out.println("5 - Search Contact");
        System.out.println("6 - Print a list of available actions");
        System.out.println("Choose your action: ");
    }

    public static void quit(){
        System.out.println("\nShutting down...");
    }


    public void removeContact(){}






    public boolean checkContact(){
        return true;
    }
}

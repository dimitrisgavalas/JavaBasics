package MasterChallenge;

public class Main {
    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("Basic", "Cow", 15, "BB");
//        hamburger.setKetchup(true);
//        hamburger.setTomato(true);
//
//        hamburger.totalPrice();

        Hamburger2 hamburger2 = new Hamburger2("Basic", "Pork", 3.58, "White");
        double price = hamburger2.itemizeHamburger();
        hamburger2.addHamburgerAddition1("Tomato", 0.3);
        hamburger2.addHamburgerAddition2("Lettuce", 0.3);
        hamburger2.addHamburgerAddition3("Cheese", 0.3);

        System.out.println("Total burger price is " + hamburger2.itemizeHamburger());


    }
}

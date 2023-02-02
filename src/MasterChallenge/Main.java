package MasterChallenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Cow", 15, "BB");
        hamburger.setKetchup(true);
        hamburger.setTomato(true);

        hamburger.totalPrice();
    }
}

package MasterChallenge;

public class Hamburger {

    private String breadRoll;
    private String meat;
    private double price;

    private String burgerName;
    private boolean tomato;
    private boolean ketchup;

    private boolean lettuce;

    public Hamburger(String breadRoll, String meat, double price, String burgerName) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
        this.burgerName = burgerName;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void totalPrice(){
        System.out.println("Base Burger price = " + this.price);
        if (tomato){
            this.price += 1;
            System.out.println("You added Tomato. Price 1$.");
        }

        if (ketchup){
            this.price += 1;
            System.out.println("You added Ketchup. Price 1$.");
        }

        if (lettuce){
            this.price += 1.5;
            System.out.println("You added lettuce. Price 1.5$.");
        }

        System.out.println("Total Price = " + this.price + "$");
    }
}

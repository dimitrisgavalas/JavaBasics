package MasterChallenge;

public class HealthyBurger extends Hamburger{

    private boolean carrot;
    private boolean mustard;
    private boolean cheese;

    public HealthyBurger(String breadRoll, String meat, double price, String burgerName, boolean carrot, boolean mustard, boolean cheese) {
        super(breadRoll, meat, price, burgerName);
        this.carrot = carrot;
        this.mustard = mustard;
        this.cheese = cheese;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
    }
}

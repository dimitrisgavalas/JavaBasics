package Composition;

public class Main {


    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

//    created an instance of a class without using a variable(new Resolution())
        Monitor theMonitor = new Monitor("27inch Curved", "Samsung", 27, new Resolution(2540,  1440));

        Motherboard theMotherboard = new Motherboard("Aorus Master", "Gigabyte", 4, 6, "v9.22");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//    how do we access drawPixelAt method from Monitor class to PC? The PC has getters but no way of
//    accessing it
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 13");
//        thePC.getTheCase().pressPowerButton();
    }

}

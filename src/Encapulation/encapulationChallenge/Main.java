package Encapulation.encapulationChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(80, true);

        System.out.println("Initial page count = " + printer.getPrintedPages());

        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());

        printer.fillToner(100);


    }
}

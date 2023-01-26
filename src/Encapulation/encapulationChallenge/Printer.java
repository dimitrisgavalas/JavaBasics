package Encapulation.encapulationChallenge;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel> 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else
            this.tonerLevel = -1;

        this.printedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int addToner){
        if (addToner> 0 && addToner <= 100){
            if (this.tonerLevel + addToner <= 100) {
                this.tonerLevel += addToner;
                System.out.println("Added " + addToner + "%.");
                System.out.println("Overall toner levels = " + this.tonerLevel);
                return this.tonerLevel;
            }else{
                System.out.println("Toner will Overflow. Add less");
                System.out.println("Overall toner levels = " + this.tonerLevel);
                return -1;
            }
        } else {
            return -1;
        }


    }

    public int printPages(int pages){

        int pagesToPrint = (pages/2) + (pages%2);
        if (this.duplexPrinter){
            pagesToPrint /= 2;
            System.out.println("Printing in Duplex Mode");
        }
        this.printedPages ++;
        return pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}

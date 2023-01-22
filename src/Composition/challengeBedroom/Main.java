package Composition.challengeBedroom;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //base objects we can now pass tou our bedroom
        Wall wall1 = new Wall(10, 20, "West");
        Wall wall2= new Wall(20, 30, "East");
        Wall wall3 = new Wall(10, 20, "North");
        Wall wall4 = new Wall(20, 30, "South");

        Ceiling ceiling = new Ceiling(3, "light Blue");

        Door door = new Door(1, 2);

        Desk desk = new Desk("classic", 4, 1);

        Bed bed = new Bed("modern", 4, 2, 1);

        Bedroom bedroom = new Bedroom("Dimitris Bedroom", wall1, wall2, wall3, wall4, ceiling, door, bed, desk);

        bedroom.enterBedroom();
        bedroom.makeBed();




    }
}

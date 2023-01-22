package Composition.challengeBedroom;

import java.awt.*;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Door door;
    private Bed bed;
    private Desk desk;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Door door, Bed bed, Desk desk) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.door = door;
        this.bed = bed;
        this.desk = desk;
    }


    public void enterBedroom(){
        door.openDoor();
    }

    public void makeBed(){
        System.out.println("Bedroom --> Making Bed");
        bed.make();
    }
    public void study(){
        System.out.println("You started studying");
    }

}

package Composition.challengeBedroom;

public class Door {
    private int width;
    private int height;

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void openDoor(){
        System.out.println("Bedroom door opened.Entered");
    }
}

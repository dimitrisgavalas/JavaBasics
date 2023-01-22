package Composition.challengeBedroom;

public class Wall {

    private int width;
    private int height;
    private String direction;

    public Wall(int width, int height, String direction) {
        this.width = width;
        this.height = height;
        this.direction = direction;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getDirection() {
        return direction;
    }
}

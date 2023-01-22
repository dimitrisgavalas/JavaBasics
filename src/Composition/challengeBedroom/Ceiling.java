package Composition.challengeBedroom;

public class Ceiling {
    private int height;//where the ceiling starts
    private String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getpaintedColor() {
        return paintedColor;
    }
}

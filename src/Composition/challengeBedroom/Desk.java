package Composition.challengeBedroom;

public class Desk {

    private String style;
    private int drawers;
    private int height;

    public Desk(String style, int drawers, int height) {
        this.style = style;
        this.drawers = drawers;
        this.height = height;
    }

    public String getStyle() {
        return style;
    }

    public int getDrawers() {
        return drawers;
    }

    public int getHeight() {
        return height;
    }


}

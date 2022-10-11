package oop.parcial2.neighborhood;

public class Kitchen
{
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;


    Kitchen(int width, int height, String color, boolean stove, boolean sink, int windows, boolean refigerator, boolean oven) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.stove = stove;
        this.sink = sink;
        this.windows = windows;
        this.refigerator = refigerator;
        this.oven = oven;
    }

    /*
    public boolean hasStove() {
        return stove;
    }

    public boolean hasSink() {
        return sink;
    }

    public int getWindows() {
        return windows;
    }

    public boolean hasRefigerator() {
        return refigerator;
    }

    public boolean hasOven() {
        return oven;
    }
    */

    public static KitchenBuilder builder()
    {
        return new KitchenBuilder();
    }
}


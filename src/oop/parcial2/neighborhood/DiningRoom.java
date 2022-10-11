package oop.parcial2.neighborhood;

public class DiningRoom {
    private int windows;
    private boolean tv;
    private int chairsCapacity;
    private int width;
    private int height;
    private String color;

    DiningRoom(int width, int height, String color, int windows, boolean tv, int chairsCapacity) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.windows = windows;
        this.tv = tv;
        this.chairsCapacity = chairsCapacity;
    }

    /*
    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public int getChairsCapacity() {
        return chairsCapacity;
    }
    */

    public static DiningRoomBuilder builder()
    {
        return new DiningRoomBuilder();
    }
}

package oop.parcial2.neighborhood;

public class BedRoom{
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    BedRoom(int width, int height, String color, BedSize bedSize, boolean tv) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.bedSize = bedSize;
        this.tv = tv;
    }

    /*
    public BedSize getBedSize() {
        return bedSize;
    }

    public boolean isTv() {
        return tv;
    }
    */

    public static BedRoomBuilder builder()
    {
        return new BedRoomBuilder();
    }
}

import oop.parcial2.neighborhood.*;

import java.util.Arrays;

public class Main {
    public static void main() {

        Neighborhood neighborhood = Neighborhood.builder()
                .street(Arrays.asList(
                                Street.builder()
                                        .name("calle 1")
                                        .house(100, House.builder()
                                                .kitchen(Kitchen.builder()
                                                        .oven(false)
                                                        .width(90)
                                                        .height(20)
                                                        .color("White and grey")
                                                        .sink(false)
                                                        .stove(true)
                                                        .build())
                                                .bedRoom(BedRoom.builder()
                                                        .bedSize(BedSize.King)
                                                        .color("Blue")
                                                        .height(15)
                                                        .width(60)
                                                        .tv(false)
                                                        .build())
                                                .diningRoom(DiningRoom.builder()
                                                        .tv(true)
                                                        .chairsCapacity(8)
                                                        .windows(10)
                                                        .width(100)
                                                        .height(10)
                                                        .color("Red")
                                                        .build())
                                                .build())
                                        .house(101, House.builder()
                                                .kitchen(Kitchen.builder()
                                                        .oven(false)
                                                        .width(90)
                                                        .height(20)
                                                        .color("White and grey")
                                                        .sink(false)
                                                        .stove(true)
                                                        .build())
                                                .bedRoom(BedRoom.builder()
                                                        .bedSize(BedSize.King)
                                                        .color("Blue")
                                                        .height(15)
                                                        .width(60)
                                                        .tv(false)
                                                        .build())
                                                .diningRoom(DiningRoom.builder()
                                                        .tv(true)
                                                        .chairsCapacity(8)
                                                        .windows(10)
                                                        .width(100)
                                                        .height(10)
                                                        .color("Red")
                                                        .build())
                                                .build())
                                        .build(),
                                Street.builder()
                        .name("calle 2")
                        .house(100, House.builder()
                                .kitchen(Kitchen.builder()
                                        .oven(false)
                                        .width(90)
                                        .height(20)
                                        .color("White and grey")
                                        .sink(false)
                                        .stove(true)
                                        .build())
                                .bedRoom(BedRoom.builder()
                                        .bedSize(BedSize.King)
                                        .color("Blue")
                                        .height(15)
                                        .width(60)
                                        .tv(false)
                                        .build())
                                .diningRoom(DiningRoom.builder()
                                        .tv(true)
                                        .chairsCapacity(8)
                                        .windows(10)
                                        .width(100)
                                        .height(10)
                                        .color("Red")
                                        .build())
                                .build())
                        .house(101, House.builder()
                                .kitchen(Kitchen.builder()
                                        .oven(false)
                                        .width(90)
                                        .height(20)
                                        .color("White and grey")
                                        .sink(false)
                                        .stove(true)
                                        .build())
                                .bedRoom(BedRoom.builder()
                                        .bedSize(BedSize.King)
                                        .color("Blue")
                                        .height(15)
                                        .width(60)
                                        .tv(false)
                                        .build())
                                .diningRoom(DiningRoom.builder()
                                        .tv(true)
                                        .chairsCapacity(8)
                                        .windows(10)
                                        .width(100)
                                        .height(10)
                                        .color("Red")
                                        .build())
                                .build())
                        .build()))
			.gardens(2)
                .basketballCourt(true)
                .build();

    }
}